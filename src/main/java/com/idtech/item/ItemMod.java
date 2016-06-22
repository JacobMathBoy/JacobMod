package com.idtech.item;

import com.idtech.BaseMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ItemMod {
	
	public static ItemTroll killerSword;
	public static ItemTroll2 invincPotion;

	public static void preInit(){

		// Initialize items
		killerSword = new ItemTroll();
		invincPotion = new ItemTroll2();

		// Register Items

		GameRegistry.registerItem(killerSword, killerSword.name);
		GameRegistry.registerItem(invincPotion, invincPotion.name);

	}

	public static void init(){
		// Item inventory Rendering
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			renderItem.getItemModelMesher().register(killerSword, 0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + killerSword.name, "inventory"));
			renderItem.getItemModelMesher().register(invincPotion, 0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + invincPotion.name, "inventory"));
		}
	}
}