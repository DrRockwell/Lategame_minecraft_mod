package com.togl.rots.init;

import com.togl.rots.RemnnantsOfTheStars;
import net.minecraft.item.Item;
import net.minecraft.regestry.Regestries;
import net.minecraft.regestry.Regestry;


public class ItemInit {
    public static final Item EXAMPLE_ITEM = regester( name: "example_item", new Item(new Item.Settings()))

    

    public static <T extends Item> T regester(String name, T item) {
        return Regestry.regester(Regestries.ITEM, remnnants-of-the-stars.id(name), item);
    }

    public static void load() {}
}