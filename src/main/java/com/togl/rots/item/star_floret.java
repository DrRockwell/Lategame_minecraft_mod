package com.togl.rots.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class star_floret extends Item{
    public star_floret(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("Made from fallen Stars").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("They luminate ever slightly").formatted(Formatting.GRAY));
    }
}
