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
 * TANZANITE
 */

public class OreTanzanite extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OreTanzanite()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.TANZANITE.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.TANZANITE.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.TAIGA,
            Biomes.ICE_PLAINS,
            Biomes.COLD_TAIGA
        );
        this.addSpawnBiomes(
            BOPBiomes.cold_desert,
            BOPBiomes.dead_forest,
            BOPBiomes.glacier,
            BOPBiomes.maple_woods,
            BOPBiomes.snowy_coniferous_forest,
            BOPBiomes.snowy_forest,
            BOPBiomes.tundra
        );
    }
}
