package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.data.PackOutput;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SubtlyRich.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SHULK_CALYX);
        blockWithItem(ModBlocks.SHULK_POLYP);
        blockWithItem(ModBlocks.WITHERING_SCULK_CATALYST);

        blockWithItem(ModBlocks.SHULK_PLANKS);
        stairsBlock(ModBlocks.SHULK_STAIRS.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()));
        slabBlock(ModBlocks.SHULK_SLAB.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()), blockTexture(ModBlocks.SHULK_PLANKS.get()));

        buttonBlock(ModBlocks.SHULK_BUTTON.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()));
        pressurePlateBlock(ModBlocks.SHULK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()));

        fenceBlock(ModBlocks.SHULK_FENCE.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()));
        fenceGateBlock(ModBlocks.SHULK_FENCE_GATE.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()));
        wallBlock(ModBlocks.SHULK_WALL.get(), blockTexture(ModBlocks.SHULK_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.SHULK_DOOR.get(), modLoc("block/shulk_door_bottom"), modLoc("block/shulk_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SHULK_TRAPDOOR.get(), modLoc("block/shulk_trapdoor"), true, "cutout");

        blockItem(ModBlocks.SHULK_STAIRS);
        blockItem(ModBlocks.SHULK_SLAB);
        blockItem(ModBlocks.SHULK_PRESSURE_PLATE);
        blockItem(ModBlocks.SHULK_FENCE_GATE);
        blockItem(ModBlocks.SHULK_TRAPDOOR, "_bottom");

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }


    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("subtlyrich:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("subtlyrich:block/" + deferredBlock.getId().getPath() + appendix));
    }


}
