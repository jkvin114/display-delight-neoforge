package com.jkvin114.displaydelight.block;

import com.jkvin114.displaydelight.init.DisplayItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Optional;

public class FoodBlock extends AbstractItemBlock {
    public static final MapCodec<FoodBlock> CODEC = simpleCodec(FoodBlock::new);

    public FoodBlock(BlockBehaviour.Properties props) {
        super(props);
    }

    @Override
    public MapCodec<FoodBlock> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(3, 0, 3, 13, 6, 13);
    }
}
