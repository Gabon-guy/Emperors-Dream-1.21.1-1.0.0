package net.gabon_guy.emperorsdream.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gabon_guy.emperorsdream.EmperorsDream;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMBER = registerItem("amber", new Item(new Item.Settings()));
    public static final Item RAW_AMBER = registerItem("raw_amber", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EmperorsDream.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EmperorsDream.LOGGER.info("Registering Mod Items for " + EmperorsDream.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AMBER);
            entries.add(RAW_AMBER);
        });
    }
}