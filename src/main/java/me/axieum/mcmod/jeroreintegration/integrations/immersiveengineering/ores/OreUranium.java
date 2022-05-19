package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.Config.IEConfig.Ores;

public class OreUranium extends IEOreBlock
{

	public OreUranium()
	{
		super();
		oreConfig = Ores.ore_uranium;
		this.setBlockMeta(5);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
