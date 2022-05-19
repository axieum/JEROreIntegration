package me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering;

import java.io.File;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import me.axieum.mcmod.jeroreintegration.config.Config;
import me.axieum.mcmod.jeroreintegration.integrations.Integrate;
import me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ores.OreBauxite;

public class ImmersiveEngineering
{

	public static final OreBlock[] IE_ORES = {
			new OreBauxite()
	};
	
	public static void init()
    {
        File ieFile = Config.getFile("immersiveengineering.json");
        if (ieFile == null)
            Integrate.write("immersiveengineering.json", IE_ORES);
    }

}
