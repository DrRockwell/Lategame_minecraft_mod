package com.togl.rots.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class star_pebble extends Item{
    public star_pebble(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("Made from Comet remains").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("They are warm to the touch").formatted(Formatting.GRAY));
    }
}
