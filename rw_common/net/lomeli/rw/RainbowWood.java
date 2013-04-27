package net.lomeli.rw;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = StringsRW.MOD_ID, name = StringsRW.MOD_NAME, version = StringsRW.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class RainbowWood 
{
	@SidedProxy(clientSide = StringsRW.CLIENTP, serverSide = StringsRW.COMMONP)
    public static CommonProxy proxy;
	
	public static Block rwWood;
	
	public static int rwWoodID;
	
	@SuppressWarnings("static-access")
	@PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
		 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		 
		 config.load();
		 
		 rwWoodID = config.get(config.CATEGORY_BLOCK, "rwWood", 650).getInt(650);
		 
		 config.save();
    }
	
	
	@Init
    public void main(FMLInitializationEvent event)
    {
		rwWood = new BlockRW(rwWoodID);
		
		GameRegistry.registerBlock(rwWood, ItemRW.class, "Wood");
		
		RecipesRainbowWood.registerWood();
		for(int i = 0; i <= 15; i++)
		{
			OreDictionary.registerOre("woodPlank", (new ItemStack(rwWood,1,i)));
			OreDictionary.registerOre("plankWood", (new ItemStack(rwWood,1,i)));
		}
		
		proxy.renderThings();
    }
}
