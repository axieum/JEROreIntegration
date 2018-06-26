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
 * SAPPHIRE
 */

public class OreSapphire extends OreBlock
{
    @SuppressWarnings("unchecked")
    public OreSapphire()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.SAPPHIRE.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.SAPPHIRE.ordinal()));
        this.setDimensionName(DimensionType.OVERWORLD.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("12,1,4,32");
        this.addSpawnBiomes(
            Biomes.MUSHROOM_ISLAND,
            Biomes.OCEAN
        );
        this.addSpawnBiomes(
            BOPBiomes.coral_reef,
            BOPBiomes.kelp_forest,
            BOPBiomes.mangrove
        );
    }
}
