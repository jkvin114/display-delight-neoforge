package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.ShowcaseBlock;
import com.jkvin114.displaydelight.blockentity.ShowcaseBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ShowcaseBlocks {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
        DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, DisplayDelight.MODID);


    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DisplayDelight.MODID);

//    public static final DeferredBlock<ShowcaseBlock> SHOWCASE1 =
//            BLOCKS.register("glass_showcase", () -> new ShowcaseBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
//
//    public static final DeferredBlock<ShowcaseBlock> SHOWCASE_WOOD =
//            BLOCKS.register("wood_showcase", () -> new ShowcaseBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
//                    .isViewBlocking(ShowcaseBlocks::never).noOcclusion()));

    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }


    public static final Supplier<BlockEntityType<ShowcaseBlockEntity>> SHOWCASE_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "showcase",
            // The block entity type, created using a builder.
            () -> BlockEntityType.Builder.of(
                            // The supplier to use for constructing the block entity instances.
                            ShowcaseBlockEntity::new
                            // A vararg of blocks that can have this block entity.
                            // This assumes the existence of the referenced blocks as DeferredBlock<Block>s.

                    )
                    // Build using null; vanilla does some datafixer shenanigans with the parameter that we don't need.
                    .build(null)
    );



}
