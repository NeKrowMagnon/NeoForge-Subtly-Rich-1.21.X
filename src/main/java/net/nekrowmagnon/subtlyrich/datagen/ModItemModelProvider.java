package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;
import net.nekrowmagnon.subtlyrich.item.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SubtlyRich.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SCULK_REMNANT.get());
        basicItem(ModItems.SHULKER_PALP.get());
        basicItem(ModItems.MAGNESIUM_DUST.get());
        basicItem(ModItems.CALCIUM_DUST.get());
        basicItem(ModItems.WITHERING_SCULK_REMNANT.get());
        basicItem(ModItems.FUSING_SCULK_REMNANT.get());

        buttonItem(ModBlocks.SHULK_BUTTON, ModBlocks.SHULK_PLANKS);
        fenceItem(ModBlocks.SHULK_FENCE, ModBlocks.SHULK_PLANKS);
        wallItem(ModBlocks.SHULK_WALL, ModBlocks.SHULK_PLANKS);

        basicItem(ModBlocks.SHULK_DOOR.asItem());
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(SubtlyRich.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(SubtlyRich.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(SubtlyRich.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }


}
