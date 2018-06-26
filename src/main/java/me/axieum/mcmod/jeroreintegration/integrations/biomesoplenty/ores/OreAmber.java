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
 * AMBER
 */

public class OreAmber extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OreAmber()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.AMBER.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.AMBER.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.BIRCH_FOREST,
            Biomes.FOREST,
            Biomes.ROOFED_FOREST
        );
        this.addSpawnBiomes(
            BOPBiomes.boreal_forest,
            BOPBiomes.coniferous_forest,
            BOPBiomes.grove,
            BOPBiomes.redwood_forest,
            BOPBiomes.seasonal_forest,
            BOPBiomes.shield,
            BOPBiomes.temperate_rainforest,
            BOPBiomes.woodland
        );
    }
}
