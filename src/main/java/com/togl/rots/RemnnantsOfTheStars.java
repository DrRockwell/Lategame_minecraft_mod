package com.togl.rots;

import com.togl.rots.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RemnnantsOfTheStars implements ModInitializer {
	public static final String MOD_ID = "remnnants-of-the-stars";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}