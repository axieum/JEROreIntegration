package me.axieum.mcmod.jeroreintegration.integrations.biomesoplenty.ores;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.enums.BOPGems;
import biomesoplenty.api.item.BOPItems;
import me.axieum.mcmod.jeroreintegration.GenerationType;
import me.axieum.mcmod.jeroreintegration.OreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;

/**
 * AMETHYST
 */

public class OreAmethyst extends OreBlock
{
    public OreAmethyst()
    {
        this.setBlock(BOPBlocks.gem_ore);
        this.setBlockMeta(BOPGems.AMETHYST.ordinal());
        this.addDrops(new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()));
        this.setDimensionName(DimensionType.THE_END.getName());
        this.setRequiresSilktouch(true);
        this.setGenerationType(GenerationType.SQUARE);
        this.setGenerationValue("24,1,4,32");
    }
}
