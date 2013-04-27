package net.lomeli.rw;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockRW extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon[] iconArray;
	
	public static String blockTexture;
	
	public BlockRW(int par1) {
		super(par1, Material.wood);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	public Icon getIcon(int par1, int par2)
    {
        return this.iconArray[par2 % this.iconArray.length];
    }

    public int damageDropped(int par1)
    {
        return par1;
    }

    public static int getBlockFromDye(int par0)
    {
        return ~par0 & 15;
    }

    public static int getDyeFromBlock(int par0)
    {
        return ~par0 & 15;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < 16; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
		this.iconArray = new Icon[16];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = iconRegister.registerIcon( StringsRW.MOD_ID.toLowerCase() + ":wood_" + i);
        }
    }
}
