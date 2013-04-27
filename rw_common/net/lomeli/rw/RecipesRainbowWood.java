package net.lomeli.rw;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RecipesRainbowWood 
{
	public static void registerWood()
	{
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 0), "White Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 1), "Orange Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 2), "Magenta Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 3), "Light Blue Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 4), "Yellow Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 5), "Lime Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 6), "Pink Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 7), "Gray Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 8), "Light Gray Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 9), "Cyan Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 10), "Purple Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 11), "Blue Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 12), "Brown Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 13), "Green Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 14), "Red Wood");
		LanguageRegistry.addName(new ItemStack(RainbowWood.rwWood, 1, 15), "Black Wood");
		
		for(int i = 0; i <= 15; i++)
		{
			GameRegistry.addShapelessRecipe((new ItemStack(RainbowWood.rwWood, 1, i)), 
					new Object[]{ Block.planks, (new ItemStack(Item.dyePowder, 1, (15 - i))) });
		}
	}
}