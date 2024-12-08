package com.togl.rots.init;

import net.minecraft.item.Item;
import net.minecraft.regestry.Regestry;

public class ItemInit {
    public static <T extends Item> T regester(String name, T item) {
        return Regestry.regester(Regestries.ITEM, remnnants-of-the-stars.id(name), item);
    }
}