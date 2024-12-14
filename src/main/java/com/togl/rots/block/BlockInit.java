package com.togl.rots.block;

import com.togl.rots.RemnantsOfTheStars;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class BlockInit {
    public static final Block EXAMPLE_BLOCK = register("example_block", new Block(AbstractBlock.Settings.create()
            .strength(1.5F, 6.0F)
            .requiresTool()
    ));

    public static <T extends Block> T register(String name, T block){
        return Registry.register(Registries.BLOCK, RemnantsOfTheStars.id(name), block);
    }

    public static void load() {}
}
