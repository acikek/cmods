package com.acikek.cmods;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CombinedModifiers implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("cmods");

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Combined Modifiers");
    }
}
