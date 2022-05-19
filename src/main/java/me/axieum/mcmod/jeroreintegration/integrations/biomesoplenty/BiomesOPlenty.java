package me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty;

import java.io.File;

import me.axieum.mcmod.jeroreintegration.OreBlock;
import me.axieum.mcmod.jeroreintegration.config.Config;
import me.axieum.mcmod.jeroreintegration.integrations.Integrate;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreAmber;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreAmethyst;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreBiomeEssence;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreMalachite;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OrePeridot;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreRuby;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreSapphire;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreTanzanite;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores.OreTopaz;

public class BiomesOPlenty
{
    public static final OreBlock[] BOP_ORES = {
        new OreAmber(),
        new OreAmethyst(),
        new OreBiomeEssence(),
        new OreMalachite(),
        new OrePeridot(),
        new OreRuby(),
        new OreSapphire(),
        new OreTanzanite(),
        new OreTopaz()
    };

    public static void init()
    {
        File bopFile = Config.getFile("biomesoplenty.json");
        if (bopFile == null)
            Integrate.write("biomesoplenty.json", BOP_ORES);
    }
}
