package com.togl.rots.item;

import com.togl.rots.RemnantsOfTheStars;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;



public class ItemInit {

    public static final Item METEORITE_ORE = register("meteorite_ore",
            new meteorite_ore(new Item.Settings().fireproof()));

    public static final Item NETHERITE_FABRIC = register("netherite_fabric",
            new netherite_fabric(new Item.Settings().fireproof()));

    public static final Item METEOR_SCRAP = register("meteor_scrap",
            new meteor_scrap(new Item.Settings().fireproof()));

    public static final Item METEORITE_INGOT = register("meteorite_ingot",
            new meteorite_ingot(new Item.Settings().fireproof()));

    public static final Item REFINED_METEOR = register("refined_meteor",
            new refined_meteor(new Item.Settings().fireproof()));

    public static final Item STAR_FLORET = register("star_floret",
            new star_floret(new Item.Settings().fireproof()));

    public static final Item STAR_PEBBLE = register("star_pebble",
            new star_pebble(new Item.Settings().fireproof()));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, RemnantsOfTheStars.id(name), item);
    }

    public static void load() {}
}