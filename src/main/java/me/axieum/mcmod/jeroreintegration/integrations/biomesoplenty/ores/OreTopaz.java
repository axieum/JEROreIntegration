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
 * TOPAZ
 */

public class OreTopaz extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OreTopaz()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.TOPAZ.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.TOPAZ.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.JUNGLE
        );
        this.addSpawnBiomes(
            BOPBiomes.bamboo_forest,
            BOPBiomes.cherry_blossom_grove,
            BOPBiomes.eucalyptus_forest,
            BOPBiomes.flower_island,
            BOPBiomes.mystic_grove,
            BOPBiomes.rainforest,
            BOPBiomes.sacred_springs,
            BOPBiomes.tropical_island,
            BOPBiomes.tropical_rainforest
        );
    }
}
