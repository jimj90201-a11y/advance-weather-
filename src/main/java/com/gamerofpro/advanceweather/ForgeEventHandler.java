package com.gamerofpro.advanceweather;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.server.ServerLifecycleHooks;

public class ForgeEventHandler {

    private int tickCounter = 0;

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }

        tickCounter++;

        if (tickCounter >= WeatherHandler.CHECK_INTERVAL_TICKS) {
            tickCounter = 0;

        MinecraftServer server = ServerLifecycleHooks.getCurrentServer();

if (server != null) {
    for (ServerLevel level : server.getAllLevels()) {
        WeatherHandler.rollWeather(level);
    }
}
        }
    }
}
