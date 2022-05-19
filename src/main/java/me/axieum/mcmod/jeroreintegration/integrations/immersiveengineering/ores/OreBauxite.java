package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores;

import blusunrize.immersiveengineering.common.Config.IEConfig.Ores;

public class OreBauxite extends IEOreBlock
{

	public OreBauxite()
	{
		super();
		oreConfig = Ores.ore_bauxite;
		this.setBlockMeta(1);
		this.setGenerationValue(""+oreConfig[3]+','+oreConfig[0]+','+oreConfig[1]+','+oreConfig[2]+"");
	}

}
