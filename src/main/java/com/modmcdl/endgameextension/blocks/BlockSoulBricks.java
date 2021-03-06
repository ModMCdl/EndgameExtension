package com.modmcdl.endgameextension.blocks;

import javax.annotation.Nonnull;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSoulBricks extends Block implements IHasModel
{
	public BlockSoulBricks(String name, Material material)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(30F);
		this.setResistance(6000F);
		this.setHarvestLevel("pickaxe", 10);
		
		this.setCreativeTab(EndgameExtension.endtab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		EndgameExtension.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}	
	
}
