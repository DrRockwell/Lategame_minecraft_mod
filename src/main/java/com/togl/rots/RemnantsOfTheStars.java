package com.togl.rots;

import com.togl.rots.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RemnantsOfTheStars implements ModInitializer {
	public static final String MOD_ID = "remnantsofthestars";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing...");
		ItemInit.load();
		LOGGER.info("Initialized Successfully");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}