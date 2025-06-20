package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.nekrowmagnon.subtlyrich.item.ModItems;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModItems.MAGNESIUM_DUST.getId(), new FurnaceFuel(1200), false)
                .add(ModItems.CALCIUM_DUST.getId(), new FurnaceFuel(800), false);

    }
}
