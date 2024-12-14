package com.togl.rots.block;

import com.togl.rots.RemnantsOfTheStars;
import com.togl.rots.item.ItemInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class BlockInit {
    public static final Block EXAMPLE_BLOCK = registerWithItems("example_block", new Block(AbstractBlock.Settings.create()
            .strength(1.5F, 6.0F)
            .requiresTool())
            new Item.Settings().fireproof());

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, RemnantsOfTheStars.id(name), block);
    }

    public static <T extends Block> T registerWithItems(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItems(String name, T block) {
        return registerWithItems(name, block, new Item.Settings());
    }

    public static void load() {}
}
