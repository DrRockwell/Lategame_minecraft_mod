package com.togl.rots.block;

import com.togl.rots.RemnantsOfTheStars;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockInit {

    public static final Block EXAMPLE_BLOCK = new Block(Block.Settings.create().strength(4.0f));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, RemnantsOfTheStars.id(name), block);
    }
    public static void load() {}
}
