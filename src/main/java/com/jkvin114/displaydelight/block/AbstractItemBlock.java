package com.jkvin114.displaydelight.block;
import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.init.DisplayConfig;
import com.jkvin114.displaydelight.init.DisplayProperties;
import net.minecraft.core.RegistryAccess;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import com.jkvin114.displaydelight.init.BlockAssociations;
import com.jkvin114.displaydelight.init.DisplayItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.jkvin114.displaydelight.block.BlockHelper.needSupport;


public abstract class AbstractItemBlock extends HorizontalDirectionalBlock {

    public static final BooleanProperty SUPPORT = DisplayProperties.SUPPORT;

    public AbstractItemBlock(BlockBehaviour.Properties props) {
        super(props);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SUPPORT, false));
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader world, BlockPos pos, Player player) {
        ItemStack stk= this.getStackFor();
        if(stk.getItem().equals(Items.AIR)){
            stk = new ItemStack(state.getBlock().asItem());
        }
        return  stk;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING,SUPPORT);

    }
    @Override
    protected @NotNull List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        List<ItemStack> droppedStacks = super.getDrops(state, params);

        boolean silktouch=false;

        if(DisplayConfig.SILKTOUCH_DROPS_FOOD_BLOCK_ITEM.get()){
            try{
                var enchantmentRegistry = params.getLevel().registryAccess().registryOrThrow(Registries.ENCHANTMENT);
                ItemStack tool = params.getParameter(LootContextParams.TOOL);
                if(tool.getEnchantmentLevel(enchantmentRegistry.getHolderOrThrow(Enchantments.SILK_TOUCH)) > 0){
                    silktouch=true;
                }
            } catch (Exception e) {
                DisplayDelight.LOGGER.error(e.toString());
            }
        }



        Block block = state.getBlock();
        Item foodItem = getStackFor().getItem();
        boolean silktouchApplied = false;

        if (block instanceof AbstractStackablePlatedFoodBlock platedFoodBlock) {

            //silk touch only applies to blocks with max stacks
            if (foodItem.equals(Items.AIR) ||
                    (silktouch
                            && platedFoodBlock.getStacks(state) >= platedFoodBlock.getMaxStackable())
                            && platedFoodBlock.hasPlate(state)){
                foodItem = this.asItem();
                silktouchApplied = true;
            }

            droppedStacks.add(new ItemStack(foodItem, !silktouchApplied ? platedFoodBlock.getStacks(state) : 1));

            if (!silktouchApplied && platedFoodBlock.hasPlate(state)) droppedStacks.add(new ItemStack(DisplayItems.PLATE));

        } else if (block instanceof SmallPlatedFoodBlock platedFoodBlock) {

            if (foodItem.equals(Items.AIR) ||
                    (silktouch && platedFoodBlock.hasPlate(state))) {
                foodItem = this.asItem();
                silktouchApplied = true;
            }
            droppedStacks.add(new ItemStack(foodItem));
            if (!silktouchApplied && platedFoodBlock.hasPlate(state)) droppedStacks.add(new ItemStack(DisplayItems.SMALL_PLATE));

        } else {

            if (foodItem.equals(Items.AIR)|| silktouch) {
                foodItem = this.asItem();
            }

            droppedStacks.add(new ItemStack(foodItem));
        }

        return droppedStacks;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos below=context.getClickedPos().below();
        BlockState stateBelow = level.getBlockState(below);

        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(SUPPORT,needSupport(level,below,stateBelow));

    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, Direction direction,
                                           BlockState neighborState, LevelAccessor level,
                                           BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN) {
            return state.setValue(SUPPORT, needSupport(level,neighborPos,neighborState));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }


    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        //return world.getBlockState(pos.below()).isFaceSturdy(world, pos.below(), Direction.UP, SupportType.CENTER);
        return true;
    }
    public ItemStack getStackFor() {
        return new ItemStack(BlockAssociations.getItemFor(this));
    }
}