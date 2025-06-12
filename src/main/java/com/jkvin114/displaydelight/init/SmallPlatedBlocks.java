package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SmallPlatedBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DisplayDelight.MODID);

    public static final DeferredBlock<Block> PLATED_CAKE_SLICE = createPlatedBlock("small_plated_cake_slice");
    public static final DeferredBlock<Block> PLATED_APPLE_PIE_SLICE = createPlatedBlock("small_plated_apple_pie_slice");
    public static final DeferredBlock<Block> PLATED_CHOCOLATE_PIE_SLICE = createPlatedBlock("small_plated_chocolate_pie_slice");
    public static final DeferredBlock<Block> PLATED_SWEET_BERRY_CHEESECAKE_SLICE = createPlatedBlock("small_plated_sweet_berry_cheesecake_slice");
    public static final DeferredBlock<Block> PLATED_STUFFED_POTATO = createPlatedBlock("small_plated_stuffed_potato");
    public static final DeferredBlock<Block> PLATED_COD_ROLL = createPlatedBlock("small_plated_cod_roll");
    public static final DeferredBlock<Block> PLATED_SALMON_ROLL = createPlatedBlock("small_plated_salmon_roll");
    public static final DeferredBlock<Block> PLATED_KELP_ROLL_SLICE = createPlatedBlock("small_plated_kelp_roll_slice");
    public static final DeferredBlock<Block> PLATED_CABBAGE_ROLLS = createPlatedBlock("small_plated_cabbage_rolls");


    //EXPANDED DELIGHT
    public static final DeferredBlock<Block> ED_SWEET_ROLL = createPlatedBlock("ed_small_plated_sweet_roll");
    public static final DeferredBlock<Block> ED_BERRY_SWEET_ROLL = createPlatedBlock("ed_small_plated_berry_sweet_roll");
    public static final DeferredBlock<Block> ED_GLOW_BERRY_SWEET_ROLL = createPlatedBlock("ed_small_plated_glow_berry_sweet_roll");
    public static final DeferredBlock<Block> ED_CHEESE_SLICE = createPlatedBlock("ed_small_plated_cheese_slice");


    //DELIGHTFUL
    public static final DeferredBlock<Block> DF_SALMONBERRY_PIE_SLICE = createPlatedBlock("df_small_plated_salmonberry_pie_slice");
    public static final DeferredBlock<Block> DF_PUMPKIN_PIE_SLICE = createPlatedBlock("df_small_plated_pumpkin_pie_slice");

    //pineapple delight
    public static final DeferredBlock<Block> PD_PINEAPPLE_PIE_SLICE = createPlatedBlock("pd_small_plated_pineapple_pie_slice");


    public static final DeferredBlock<Block> OD_ELDER_GUARDIAN_ROLL = createPlatedBlock("od_small_plated_elder_guardian_roll");
    public static final DeferredBlock<Block> OD_FUGU_ROLL = createPlatedBlock("od_small_plated_fugu_roll");


    //cultural delight
    public static final DeferredBlock<Block> CTD_CHICKEN_ROLL_SLICE = createPlatedBlock("ctd_small_plated_chicken_roll_slice");
    public static final DeferredBlock<Block> CTD_MIDORI_ROLL_SLICE = createPlatedBlock("ctd_small_plated_midori_roll_slice");
    public static final DeferredBlock<Block> CTD_PUFFERFISH_ROLL = createPlatedBlock("ctd_small_plated_pufferfish_roll");
    public static final DeferredBlock<Block> CTD_TROPICAL_ROLL = createPlatedBlock("ctd_small_plated_tropical_roll");
    public static final DeferredBlock<Block> CTD_RICE_BALL = createPlatedBlock("ctd_small_plated_rice_ball");
    public static final DeferredBlock<Block> CTD_EGG_ROLL = createPlatedBlock("ctd_small_plated_egg_roll");
    public static final DeferredBlock<Block> CTD_CALAMARI_ROLL = createPlatedBlock("ctd_small_plated_calamari_roll");
    public static final DeferredBlock<Block> CTD_CUT_PICKLE = createPlatedBlock("ctd_small_plated_cut_pickle");

    public static final DeferredBlock<Block> BNC_SMALL_PLATED_QUICHE_SLICE = createPlatedBlock("bnc_small_plated_quiche_slice");
    public static final DeferredBlock<Block> ED_SMALL_PLATED_CRANBERRY_COBBLER_SLICE = createPlatedBlock("ed_small_plated_cranberry_cobbler_slice");
    public static final DeferredBlock<Block> ED_SMALL_PLATED_HONEYED_GOAT_CHEESE_TART_SLICE = createPlatedBlock("ed_small_plated_honeyed_goat_cheese_tart_slice");
    public static final DeferredBlock<Block> ACD_SMALL_PLATED_RAW_FISH_FILLET_ROLL = createPlatedBlock("acd_small_plated_raw_fish_fillet_roll");
    public static final DeferredBlock<Block> ACD_SMALL_PLATED_FRIED_PERCH_ROLL = createPlatedBlock("acd_small_plated_fried_perch_roll");
    public static final DeferredBlock<Block> ERD_SMALL_PLATED_CHORUS_PIE_SLICE = createPlatedBlock("erd_small_plated_chorus_pie_slice");
    public static final DeferredBlock<Block> EDD_SMALL_PLATED_CHORUS_FRUIT_PIE_SLICE = createPlatedBlock("edd_small_plated_chorus_fruit_pie_slice");
    public static final DeferredBlock<Block> MND_SMALL_PLATED_MAGMA_CAKE_SLICE = createPlatedBlock("mnd_small_plated_magma_cake_slice");


    private static BlockBehaviour.Properties baseProps() {
        return BlockBehaviour.Properties.of().noOcclusion()
                .noTerrainParticles().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
    }

    private static DeferredBlock<Block> createPlatedBlock(String name) {
        return REGISTRY.register(name,
                () -> new SmallPlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }

    public static Block[] getAll() {
        return new Block[]{PLATED_APPLE_PIE_SLICE.get(), PLATED_CAKE_SLICE.get(),
                PLATED_CHOCOLATE_PIE_SLICE.get(), PLATED_SWEET_BERRY_CHEESECAKE_SLICE.get(),
                PLATED_STUFFED_POTATO.get(), PLATED_COD_ROLL.get(), PLATED_SALMON_ROLL.get(),
                PLATED_KELP_ROLL_SLICE.get(), PLATED_CABBAGE_ROLLS.get(),

                ED_SWEET_ROLL.get(), ED_BERRY_SWEET_ROLL.get(), ED_GLOW_BERRY_SWEET_ROLL.get(), ED_CHEESE_SLICE.get(),

                DF_SALMONBERRY_PIE_SLICE.get(), DF_PUMPKIN_PIE_SLICE.get(),
                PD_PINEAPPLE_PIE_SLICE.get(),
                OD_ELDER_GUARDIAN_ROLL.get(), OD_FUGU_ROLL.get(),


                CTD_CHICKEN_ROLL_SLICE.get(), CTD_MIDORI_ROLL_SLICE.get(), CTD_PUFFERFISH_ROLL.get(),
                CTD_TROPICAL_ROLL.get(), CTD_RICE_BALL.get(), CTD_EGG_ROLL.get(), CTD_CALAMARI_ROLL.get(), CTD_CUT_PICKLE.get(),

                BNC_SMALL_PLATED_QUICHE_SLICE.get(),ED_SMALL_PLATED_CRANBERRY_COBBLER_SLICE.get(),ED_SMALL_PLATED_HONEYED_GOAT_CHEESE_TART_SLICE.get(),ACD_SMALL_PLATED_RAW_FISH_FILLET_ROLL.get(),
                ACD_SMALL_PLATED_FRIED_PERCH_ROLL.get(),ERD_SMALL_PLATED_CHORUS_PIE_SLICE.get(),EDD_SMALL_PLATED_CHORUS_FRUIT_PIE_SLICE.get(),MND_SMALL_PLATED_MAGMA_CAKE_SLICE.get()
        };
    }
}
