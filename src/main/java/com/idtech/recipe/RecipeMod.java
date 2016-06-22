package com.idtech.recipe;

import com.idtech.item.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeMod {

	public static void init() {
		ItemStack dirt = new ItemStack(Blocks.dirt, 1);
		ItemStack swordStack = new ItemStack(ItemMod.killerSword, 64);
		ItemStack swordStack2 = new ItemStack(ItemMod.invincPotion, 64);
		GameRegistry.addShapelessRecipe(swordStack, dirt, dirt, dirt, dirt, dirt, dirt, dirt, dirt, dirt);
		GameRegistry.addShapedRecipe(swordStack2, "yyy", "yyy", "yyy", 'y', Blocks.cobblestone);
		GameRegistry.addSmelting(Blocks.stone, swordStack, -1000.0f);
	}
}
