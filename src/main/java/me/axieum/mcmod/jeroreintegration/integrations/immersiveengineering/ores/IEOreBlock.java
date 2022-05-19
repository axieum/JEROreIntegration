package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.IEContent;
import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.world.DimensionType;

public class IEOreBlock extends OreBlock {

	protected static int [] oreConfig;
	
	public IEOreBlock() {
		this.setBlock(IEContent.blockOre);
		this.setDimensionName(DimensionType.OVERWORLD.getName());
		this.setRequiresSilktouch(false);
		this.setGenerationType(GenerationType.SQUARE);
		this.addDrops();
	}

}
