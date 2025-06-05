package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider  {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SHULK_CALYX.get());
        dropSelf(ModBlocks.SHULK_POLYP.get());
        dropSelf(ModBlocks.WITHERING_SCULK_CATALYST.get());

        dropSelf(ModBlocks.SHULK_PLANKS.get());
        dropSelf(ModBlocks.SHULK_STAIRS.get());
        add(ModBlocks.SHULK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHULK_SLAB.get()));

        dropSelf(ModBlocks.SHULK_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SHULK_BUTTON.get());

        dropSelf(ModBlocks.SHULK_FENCE.get());
        dropSelf(ModBlocks.SHULK_FENCE_GATE.get());
        dropSelf(ModBlocks.SHULK_WALL.get());

        add(ModBlocks.SHULK_DOOR.get(),
                block -> createDoorTable(ModBlocks.SHULK_DOOR.get()));
        dropSelf(ModBlocks.SHULK_TRAPDOOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
