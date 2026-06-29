package com.gamerofpro.advanceweather;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(AdvanceWeather.MOD_ID)
public class AdvanceWeather {

    public static final String MOD_ID = "advanceweather";

    public AdvanceWeather() {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}
