package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.Config.IEConfig.Ores;

public class OreNickel extends IEOreBlock
{

	public OreNickel()
	{
		super();
		oreConfig = Ores.ore_nickel;
		this.setBlockMeta(4);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
