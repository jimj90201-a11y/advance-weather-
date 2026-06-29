package com.gamerofpro.advanceweather;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

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

            // WeatherHandler.rollWeather();
        }
    }
}
