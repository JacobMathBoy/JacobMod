package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTroll extends Item {
	public final String name = "KillerSword";
	public ItemTroll() {
		super();
		setUnlocalizedName("Killer Sword");
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	public ItemStack attackEntity(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.setHealth(0.0f);
		return itemStackIn;
	}
	public ItemStack clickBlock(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.setHealth(0.0f);
		return itemStackIn;
	}
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.setHealth(0.0f);
		return itemStackIn;
	}
}
