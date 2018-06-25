package me.axieum.mcmod.jeroreintegration.compatibility;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.enums.BOPGems;
import biomesoplenty.api.item.BOPItems;
import jeresources.api.distributions.DistributionSquare;
import jeresources.api.drop.LootDrop;
import jeresources.api.restrictions.BiomeRestriction;
import jeresources.api.restrictions.DimensionRestriction;
import jeresources.api.restrictions.Restriction;
import jeresources.compatibility.JERAPI;
import net.minecraft.init.Biomes;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;

public class BiomesOPlenty
{
    public static void init()
    {
        // AMBER
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.AMBER.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    Biomes.BIRCH_FOREST,
                    BOPBiomes.boreal_forest.get(),
                    BOPBiomes.coniferous_forest.get(),
                    Biomes.FOREST,
                    BOPBiomes.grove.get(),
                    BOPBiomes.redwood_forest.get(),
                    Biomes.ROOFED_FOREST,
                    BOPBiomes.seasonal_forest.get(),
                    BOPBiomes.shield.get(),
                    BOPBiomes.temperate_rainforest.get(),
                    BOPBiomes.woodland.get()
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.AMBER.ordinal()))
        );

        // AMETHYST
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.AMETHYST.ordinal()),
            new DistributionSquare(24, 1, 4, 32),
            new Restriction(new DimensionRestriction(DimensionType.THE_END)),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()))
        );

        // BIOME ESSENCE
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.biome_block, 1),
            new DistributionSquare(24, 1, 4, 32),
            new Restriction(new DimensionRestriction(DimensionType.THE_END)),
            true,
            new LootDrop(new ItemStack(BOPItems.biome_essence, 1))
        );

        // EMERALD
        //JERAPI.getInstance().getWorldGenRegistry().register(
        //   new ItemStack(Blocks.EMERALD_ORE, 1),
        //    new DistributionSquare(12, 1, 4, 32),
        //    new Restriction(
        //        new BiomeRestriction(
        //            BOPBiomes.alps.get(),
        //            BOPBiomes.crag.get(),
        //            Biomes.EXTREME_HILLS,
        //            BOPBiomes.highland.get(),
        //           BOPBiomes.mountain.get(),
        //            BOPBiomes.overgrown_cliffs.get()
        //        ),
        //        new DimensionRestriction(DimensionType.OVERWORLD)
        //    ),
        //    true,
        //    new LootDrop(new ItemStack(Items.EMERALD, 1))
        //);

        // MALACHITE
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.MALACHITE.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    BOPBiomes.bayou.get(),
                    BOPBiomes.bog.get(),
                    BOPBiomes.dead_swamp.get(),
                    BOPBiomes.fen.get(),
                    BOPBiomes.land_of_lakes.get(),
                    BOPBiomes.lush_swamp.get(),
                    BOPBiomes.marsh.get(),
                    BOPBiomes.moor.get(),
                    BOPBiomes.ominous_woods.get(),
                    BOPBiomes.quagmire.get(),
                    Biomes.SWAMPLAND,
                    BOPBiomes.wetland.get()
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.MALACHITE.ordinal()))
        );

        // PERIDOT
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.PERIDOT.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    BOPBiomes.chaparral.get(),
                    BOPBiomes.flower_field.get(),
                    BOPBiomes.grassland.get(),
                    BOPBiomes.lavender_fields.get(),
                    BOPBiomes.meadow.get(),
                    BOPBiomes.orchard.get(),
                    Biomes.PLAINS,
                    BOPBiomes.prairie.get(),
                    BOPBiomes.shrubland.get()
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.PERIDOT.ordinal()))
        );

        // RUBY
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.RUBY.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    BOPBiomes.brushland.get(),
                    Biomes.DESERT,
                    BOPBiomes.lush_desert.get(),
                    Biomes.MESA,
                    BOPBiomes.oasis.get(),
                    BOPBiomes.outback.get(),
                    Biomes.SAVANNA,
                    BOPBiomes.steppe.get(),
                    BOPBiomes.volcanic_island.get(),
                    BOPBiomes.wasteland.get(),
                    BOPBiomes.xeric_shrubland.get()
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.RUBY.ordinal()))
        );
        
        // SAPPHIRE
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.SAPPHIRE.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    BOPBiomes.coral_reef.get(),
                    BOPBiomes.kelp_forest.get(),
                    BOPBiomes.mangrove.get(),
                    Biomes.MUSHROOM_ISLAND,
                    Biomes.OCEAN
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.SAPPHIRE.ordinal()))
        );

        // TANZANITE
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.TANZANITE.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    BOPBiomes.cold_desert.get(),
                    Biomes.COLD_TAIGA,
                    BOPBiomes.dead_forest.get(),
                    BOPBiomes.glacier.get(),
                    Biomes.ICE_PLAINS,
                    BOPBiomes.maple_woods.get(),
                    Biomes.MUTATED_TAIGA,
                    BOPBiomes.snowy_coniferous_forest.get(),
                    BOPBiomes.snowy_forest.get(),
                    Biomes.TAIGA,
                    BOPBiomes.tundra.get()
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.TANZANITE.ordinal()))
        );

        // TOPAZ
        JERAPI.getInstance().getWorldGenRegistry().register(
            new ItemStack(BOPBlocks.gem_ore, 1, BOPGems.TOPAZ.ordinal()),
            new DistributionSquare(12, 1, 4, 32),
            new Restriction(
                new BiomeRestriction(
                    BOPBiomes.bamboo_forest.get(),
                    BOPBiomes.cherry_blossom_grove.get(),
                    BOPBiomes.eucalyptus_forest.get(),
                    BOPBiomes.flower_island.get(),
                    Biomes.JUNGLE,
                    BOPBiomes.mystic_grove.get(),
                    BOPBiomes.rainforest.get(),
                    BOPBiomes.sacred_springs.get(),
                    BOPBiomes.tropical_island.get(),
                    BOPBiomes.tropical_rainforest.get()
                ),
                new DimensionRestriction(DimensionType.OVERWORLD)
            ),
            true,
            new LootDrop(new ItemStack(BOPItems.gem, 1, BOPGems.TOPAZ.ordinal()))
        );
    }
}
