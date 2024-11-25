package com.jkvin114.displaydelight.init;


import net.neoforged.fml.config.IConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec;

public class DisplayConfig {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final IConfigSpec CONFIG;

    public static final ModConfigSpec.BooleanValue TOOLTIP;
    public static final ModConfigSpec.BooleanValue MESSAGE;
    static {
        BUILDER.push("Features");
        TOOLTIP = BUILDER.comment("Should placeable tooltips be enabled?").define("Tooltips", true);
        MESSAGE = BUILDER.comment("Should a message be enabled when attempting to place a food item?").define("Display-Message", true);
        BUILDER.pop();
        CONFIG = BUILDER.build();
    }
}