package me.axieum.mcmod.jeroreintegration;

import me.axieum.mcmod.jeroreintegration.config.Config;
import me.axieum.mcmod.jeroreintegration.integrations.Integrate;
import me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.BiomesOPlenty;
import me.axieum.mcmod.jeroreintegration.integrations.immersiveengineering.ImmersiveEngineering;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES, clientSideOnly = true)
public class JEROreIntegration
{
    @Mod.Instance(Reference.MOD_ID)
    public static JEROreIntegration instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Setup configuration
        Config.init(event.getModConfigurationDirectory());

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	// Generate default mod configuration files
        if (Loader.isModLoaded("biomesoplenty"))
            BiomesOPlenty.init();
    	if (Loader.isModLoaded("immersiveengineering"))
        	ImmersiveEngineering.init();

        // Load all integrations
        Integrate.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //
    }
}
