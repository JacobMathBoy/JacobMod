package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTroll2 extends Item {
	public static String name = "InvincibilityPotion";
	public ItemTroll2() {
		super();
		setUnlocalizedName("Invincibility Potion");
		this.setCreativeTab(CreativeTabs.tabBrewing);
	}
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.setHealth(0.0f);
		return itemStackIn;
	}
	public ItemStack attackEntity(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.setHealth(0.0f);
		return itemStackIn;
	}
	public ItemStack clickBlock(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.setHealth(0.0f);
		return itemStackIn;
	}
}
