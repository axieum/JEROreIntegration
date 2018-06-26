package me.axieum.mcmod.jeroreintegration;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.base.Optional;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;

public class OreBlock
{
    protected Block block;
    protected int blockMeta = 0;
    protected ItemStack[] drops;
    protected String dimensionName = "Unknown";
    protected Biome[] spawnBiomes;
    protected boolean requiresSilktouch = true;
    protected String generationType;
    protected String generationValue;

    public void setBlock(Block block)
    {
        this.block = block;
    }

    public Block getBlock()
    {
        return this.block;
    }

    public void setBlockMeta(int id)
    {
        this.blockMeta = id;
    }

    public int getBlockMeta()
    {
        return this.blockMeta;
    }

    public String getBlockKey()
    {
        if (this.block == null)
            return null;
        return this.block.getRegistryName() + ":" + this.blockMeta;
    }

    public void addDrops(ItemStack... itemStack)
    {
        this.drops = ArrayUtils.addAll(this.drops, itemStack);
    }

    public ItemStack[] getDrops()
    {
        return this.drops;
    }

    public void setRequiresSilktouch(boolean required)
    {
        this.requiresSilktouch = required;
    }

    public boolean requiresSilktouch()
    {
        return this.requiresSilktouch;
    }

    public void setGenerationType(GenerationType type)
    {
        this.generationType = type.name().toLowerCase();
    }

    public String getGenerationType()
    {
        return this.generationType;
    }

    public void setGenerationValue(String value)
    {
        this.generationValue = value;
    }

    public String getGenerationValue()
    {
        return this.generationValue;
    }

    public void setDimensionName(String name)
    {
        this.dimensionName = name;
    }

    public String getDimensionName()
    {
        return this.dimensionName;
    }

    public void addSpawnBiomes(Biome... biomes)
    {
        this.spawnBiomes = ArrayUtils.addAll(this.spawnBiomes, biomes);
    }

    @SuppressWarnings("unchecked")
    public void addSpawnBiomes(Optional<Biome>... biomes)
    {
        for (Optional<Biome> biome : biomes)
            if (biome.isPresent())
                this.spawnBiomes = ArrayUtils.addAll(this.spawnBiomes, biome.get());
    }

    public Biome[] getSpawnBiomes()
    {
        // Order the biomes alpabetically.
        if (this.spawnBiomes == null)
            return null;

        Arrays.sort(this.spawnBiomes, new Comparator<Biome>() {
            @Override
            public int compare(Biome biomeOne, Biome biomeTwo)
            {
                return biomeOne.getBiomeName().compareToIgnoreCase(biomeTwo.getBiomeName());
            }
        });

        return this.spawnBiomes;
    }
}
