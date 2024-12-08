package com.togl.rots.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;



public class ItemInit {
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new Settings()));

    

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, remnnants-of-the-stars.id(name), item);
    }

    public static void load() {}
}