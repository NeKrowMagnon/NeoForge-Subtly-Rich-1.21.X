package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SubtlyRich.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SHULK_CALYX.get())
                .add(ModBlocks.SHULK_POLYP.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SHULK_CALYX.get())
                .add(ModBlocks.SHULK_POLYP.get());

        tag(BlockTags.FENCES).add(ModBlocks.SHULK_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SHULK_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.SHULK_WALL.get());
    }
}
