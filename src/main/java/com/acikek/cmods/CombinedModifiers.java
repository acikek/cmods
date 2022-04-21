package com.acikek.cmods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class CombinedModifiers implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("cmods");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Combining the Modifiers...");
    }
}
