package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.Config.IEConfig.Ores;

public class OreCopper extends IEOreBlock
{

	public OreCopper()
	{
		super();
		oreConfig = Ores.ore_copper;
		this.setBlockMeta(0);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
