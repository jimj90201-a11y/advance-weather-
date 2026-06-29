package com.gamerofpro.advanceweather;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;

public AdvanceWeather() {
    MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
}

@Mod(AdvanceWeather.MOD_ID)
public class AdvanceWeather {

    public static final String MOD_ID = "advanceweather";

    public AdvanceWeather() {
    }
}
