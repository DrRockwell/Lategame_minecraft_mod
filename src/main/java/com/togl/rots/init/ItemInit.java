package com.togl.rots.init;

import com.togl.rots.RemnantsOfTheStars;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;



public class ItemInit {
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new Item.Settings()));

    public static final Item METEORITE_ORE = register("meteorite_ore",
            new Item(new Item.Settings().fireproof()));

    public static final Item NETHERITE_FABRIC = register("netherite_fabric",
            new Item(new Item.Settings().fireproof()));
    

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, RemnantsOfTheStars.id(name), item);
    }

    public static void load() {}
}