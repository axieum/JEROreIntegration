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
 * MALACHITE
 */

public class OreMalachite extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OreMalachite()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.MALACHITE.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.MALACHITE.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.SWAMPLAND
        );
        this.addSpawnBiomes(
            BOPBiomes.bayou,
            BOPBiomes.bog,
            BOPBiomes.dead_swamp,
            BOPBiomes.fen,
            BOPBiomes.land_of_lakes,
            BOPBiomes.lush_swamp,
            BOPBiomes.marsh,
            BOPBiomes.moor,
            BOPBiomes.ominous_woods,
            BOPBiomes.quagmire,
            BOPBiomes.wetland
        );
    }
}
