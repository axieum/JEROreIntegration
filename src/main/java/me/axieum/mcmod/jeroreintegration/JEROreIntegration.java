package me.axieum.mcmod.jeroreintegration;

import me.axieum.mcmod.jeroreintegration.compatibility.BiomesOPlenty;
import me.axieum.mcmod.jeroreintegration.config.Config;
import net.minecraftforge.common.MinecraftForge;
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
        Config.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new Config());
        
        // Integrate
        if (Loader.isModLoaded("biomesoplenty") && Config.BOP_ENABLED)
            BiomesOPlenty.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //
    }
}
