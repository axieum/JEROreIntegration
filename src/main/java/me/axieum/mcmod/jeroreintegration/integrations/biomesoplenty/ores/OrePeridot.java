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
 * PERIDOT
 */

public class OrePeridot extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OrePeridot()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.PERIDOT.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.PERIDOT.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.PLAINS
        );
        this.addSpawnBiomes(
            BOPBiomes.chaparral,
            BOPBiomes.flower_field,
            BOPBiomes.grassland,
            BOPBiomes.lavender_fields,
            BOPBiomes.meadow,
            BOPBiomes.orchard,
            BOPBiomes.prairie,
            BOPBiomes.shrubland
        );
    }
}
