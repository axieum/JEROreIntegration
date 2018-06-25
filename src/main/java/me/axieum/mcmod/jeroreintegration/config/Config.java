package me.axieum.mcmod.jeroreintegration.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jeresources.util.TranslationHelper;
import me.axieum.mcmod.jeroreintegration.Reference;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Config
{
    public static Configuration config;

    public static boolean BOP_ENABLED;

    public static void init(File file)
    {
        if (config == null) {
            config = new Configuration(file);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
            loadConfig();
    }
    
    public static void loadConfig()
    {
        Property property;

        property = config.get(Configuration.CATEGORY_GENERAL, "bopEnabled", true);
        property.setComment(TranslationHelper.translateToLocal(Reference.MOD_ID + ".config.bopEnabled.description"));
        property.setLanguageKey(Reference.MOD_ID + ".config.bopEnabled.title");
        property.requiresMcRestart();
        BOP_ENABLED = property.getBoolean();

        if (config.hasChanged())
            config.save();
    }

    public static List<IConfigElement> getConfigElements()
    {
        List<IConfigElement> list = new ArrayList<>();
        list.addAll(new ConfigElement(config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements());
        return list;
    }
}
