package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;
import net.nekrowmagnon.subtlyrich.item.ModItems;
import net.nekrowmagnon.subtlyrich.util.ModTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SubtlyRich.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.WITHERING_SCULKABLE_ITEMS)
                .add(Items.END_STONE)
                .add(ModItems.SCULK_REMNANT.get());

    }
}
