package de.sivery.fixedbottleoenchanting;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixedBottleOEnchanting implements ModInitializer {
	public static final String MOD_ID = "fixed-bottle-o-enchanting";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loaded Fixed Bottle o' Enchanting");
	}

}