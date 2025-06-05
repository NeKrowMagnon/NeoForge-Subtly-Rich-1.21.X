package net.nekrowmagnon.subtlyrich.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.block.custom.WitheringSculkCatalystBlock;
import net.nekrowmagnon.subtlyrich.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SubtlyRich.MOD_ID);

    public static final DeferredBlock<Block> SHULK_POLYP = registerBlock("shulk_polyp",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
                    .sound(SoundType.CORAL_BLOCK)));

    public static final DeferredBlock<Block> SHULK_CALYX = registerBlock("shulk_calyx",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F, 7.0F)));

    public static final DeferredBlock<Block> SHULK_PLANKS = registerBlock("shulk_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F, 7.0F)));

    public static final DeferredBlock<StairBlock> SHULK_STAIRS = registerBlock("shulk_stairs",
            () -> new StairBlock(ModBlocks.SHULK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 7.0F)));
public static final DeferredBlock<SlabBlock> SHULK_SLAB = registerBlock("shulk_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 7.0F)));

public static final DeferredBlock<PressurePlateBlock> SHULK_PRESSURE_PLATE = registerBlock("shulk_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 7.0F)));
public static final DeferredBlock<ButtonBlock> SHULK_BUTTON = registerBlock("shulk_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .noCollission()
                            .strength(3.5F, 7.0F)));

public static final DeferredBlock<FenceBlock> SHULK_FENCE = registerBlock("shulk_fence",
            () -> new FenceBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 7.0F)));
public static final DeferredBlock<FenceGateBlock> SHULK_FENCE_GATE = registerBlock("shulk_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 7.0F)));
public static final DeferredBlock<WallBlock> SHULK_WALL = registerBlock("shulk_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 7.0F)));

public static final DeferredBlock<DoorBlock> SHULK_DOOR = registerBlock("shulk_door",
            () -> new DoorBlock(BlockSetType.COPPER,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
                            .strength(3.5F, 7.0F)));
public static final DeferredBlock<TrapDoorBlock> SHULK_TRAPDOOR = registerBlock("shulk_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.COPPER,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
                            .strength(3.5F, 7.0F)));


    public static final DeferredBlock<Block> WITHERING_SCULK_CATALYST = registerBlock("withering_sculk_catalyst",
            () -> new WitheringSculkCatalystBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.WITHER_SKELETON)
                    .strength(1.5F, 4.0F)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
