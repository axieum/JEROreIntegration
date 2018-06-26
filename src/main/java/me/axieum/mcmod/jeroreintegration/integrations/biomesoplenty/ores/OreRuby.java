package me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.enums.BOPGems;
import biomesoplenty.api.item.BOPItems;
import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.init.Biomes;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;

/**
 * RUBY
 */

public class OreRuby extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OreRuby()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.RUBY.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.RUBY.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.DESERT,
            Biomes.MESA,
            Biomes.SAVANNA
        );
        this.addSpawnBiomes(
            BOPBiomes.brushland,
            BOPBiomes.lush_desert,
            BOPBiomes.oasis,
            BOPBiomes.outback,
            BOPBiomes.steppe,
            BOPBiomes.volcanic_island,
            BOPBiomes.wasteland,
            BOPBiomes.xeric_shrubland
        );
    }
}
