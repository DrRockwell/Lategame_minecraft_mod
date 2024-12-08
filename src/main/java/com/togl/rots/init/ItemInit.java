package com.togl.rots.init;

import com.togl.rots.RemnantsOfTheStars;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;



public class ItemInit {
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new Item.Settings()));

    public static final Item METEORITE_ORE = register("meteorite_ore",
            new Item(new Item.Settings().fireproof()));

    public static final Item NETHERITE_FABRIC = register("netherite_fabric",
            new Item(new Item.Settings().fireproof()));
    //
      //       @Override
     //       public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
    //            tooltip.add(Text.translatable("Test_Lore").formatted(Formatting.GOLD));
    //        }
    // I think the above way is how to add lore but I cant figure out if it even goes here

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, RemnantsOfTheStars.id(name), item);
    }

    public static void load() {}
}