package com.gamerofpro.advanceweather;

import com.mojang.logging.LogUtils;
import net.minecraft.server.level.ServerLevel;
import org.slf4j.Logger;

import java.util.Random;

public class WeatherHandler {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final int CHECK_INTERVAL_TICKS = 20 * 60 * 10;
    public static final int WEATHER_DURATION_TICKS = 20 * 60 * 5;

    public static final double RAIN_CHANCE = 0.35;
    public static final double THUNDER_CHANCE = 0.15;

    private static final Random RANDOM = new Random();

    public static void rollWeather(ServerLevel level) {
        double roll = RANDOM.nextDouble();

        LOGGER.info("Weather roll: {}", roll);

        if (roll < THUNDER_CHANCE) {
            LOGGER.info("Thunderstorm selected.");
            level.setWeatherParameters(
                    0,
                    WEATHER_DURATION_TICKS,
                    true,
                    true
            );
        } else if (roll < RAIN_CHANCE) {
            LOGGER.info("Rain selected.");
            level.setWeatherParameters(
                    0,
                    WEATHER_DURATION_TICKS,
                    true,
                    false
            );
        } else {
            LOGGER.info("Clear weather selected.");
            level.setWeatherParameters(
                    WEATHER_DURATION_TICKS,
                    0,
                    false,
                    false
            );
        }
    }
}
