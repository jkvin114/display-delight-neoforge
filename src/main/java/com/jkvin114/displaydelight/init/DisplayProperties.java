package com.jkvin114.displaydelight.init;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class DisplayProperties {
    public static final IntegerProperty STACKS = IntegerProperty.create("stacks", 1, 6);
   // public static final BooleanProperty WAXED = BooleanProperty.create("waxed");
    public static final BooleanProperty SUPPORT = BooleanProperty.create("support");
    public static final BooleanProperty PLATE_HIDDEN = BooleanProperty.create("plate_hidden");
}