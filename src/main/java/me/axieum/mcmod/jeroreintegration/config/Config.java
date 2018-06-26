package me.axieum.mcmod.jeroreintegration.config;

import java.io.File;
import java.io.FilenameFilter;

import me.axieum.mcmod.jeroreintegration.Reference;

public class Config
{
    public static File config_dir;

    public static void init(File configDir)
    {
        if (config_dir == null)
        {
            try
            {
                configDir = new File(configDir, Reference.MOD_ID);
                configDir.mkdir();
                config_dir = configDir;
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static File[] getFiles()
    {
        try
        {
            return config_dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name)
                {
                    return name.endsWith(".json");
                }
            });
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static File getFile(String fileName)
    {
        for (File file : getFiles())
            if (file.getName().equalsIgnoreCase(fileName))
                return file;
        return null;
    }
}
