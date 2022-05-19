package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.Config.IEConfig.Ores;

public class OreLead extends IEOreBlock
{

	public OreLead()
	{
		super();
		oreConfig = Ores.ore_lead;
		this.setBlockMeta(2);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
