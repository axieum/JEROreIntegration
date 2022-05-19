package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.Config.IEConfig.Ores;

public class OreSilver extends IEOreBlock
{

	public OreSilver()
	{
		super();
		oreConfig = Ores.ore_silver;
		this.setBlockMeta(3);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
