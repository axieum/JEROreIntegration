package me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;

/**
 * BIOME ESSENCE
 */

public class OreBiomeEssence extends OreBlock
{
    public OreBiomeEssence()
    {
        this.setBlock(BOPBlocks.biome_block);
        this.addDrops(new ItemStack(BOPItems.biome_essence, 1));
        this.setDimensionName(DimensionType.THE_END.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("24,1,4,32");
    }
}
