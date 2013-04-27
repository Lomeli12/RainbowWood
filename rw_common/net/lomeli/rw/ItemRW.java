package net.lomeli.rw;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemRW extends ItemBlock
{
	public ItemRW(int par1) {
		super(par1);
		this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}

    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return Block.cloth.getIcon(2, BlockRW.getBlockFromDye(par1));
    }

    public int getMetadata(int par1)
    {
        return par1;
    }

    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        return super.getUnlocalizedName() + "." + ItemDye.dyeColorNames[BlockRW.getBlockFromDye(par1ItemStack.getItemDamage())];
    }
}
