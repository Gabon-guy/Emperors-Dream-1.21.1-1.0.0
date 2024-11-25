package net.gabon_guy.emperorsdream;

import net.fabricmc.api.ClientModInitializer;

import net.gabon_guy.emperorsdream.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class EmperorsDreamClient implements ClientModInitializer {
    public static final String MOD_ID = "emperorsdream";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}