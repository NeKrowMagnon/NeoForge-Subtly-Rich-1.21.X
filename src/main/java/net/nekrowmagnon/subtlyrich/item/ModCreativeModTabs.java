package net.nekrowmagnon.subtlyrich.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SubtlyRich.MOD_ID);

    public static final Supplier<CreativeModeTab> SUBTLY_RICH_END = CREATIVE_MODE_TAB.register("subtly_rich_end_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SHULK_POLYP.get()))
                    .title(Component.translatable("creativetab.subtlyrich.subtly_rich_end"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SHULK_POLYP);
                        output.accept(ModBlocks.SHULK_CALYX);
                        output.accept(ModItems.SHULKER_PALP);
                        output.accept(ModItems.CALCIUM_DUST);
                        output.accept(ModItems.MAGNESIUM_DUST);

                        output.accept(ModBlocks.SHULK_PLANKS);
                        output.accept(ModBlocks.SHULK_STAIRS);
                        output.accept(ModBlocks.SHULK_SLAB);

                        output.accept(ModBlocks.SHULK_PRESSURE_PLATE);
                        output.accept(ModBlocks.SHULK_BUTTON);

                        output.accept(ModBlocks.SHULK_FENCE);
                        output.accept(ModBlocks.SHULK_FENCE_GATE);
                        output.accept(ModBlocks.SHULK_WALL);

                        output.accept(ModBlocks.SHULK_DOOR);
                        output.accept(ModBlocks.SHULK_TRAPDOOR);
                    }).build());
    public static final Supplier<CreativeModeTab> SUBTLY_RICH_GENERAL = CREATIVE_MODE_TAB.register("subtly_rich_general_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCULK_REMNANT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SubtlyRich.MOD_ID, "subtly_rich_end_tab"))
                    .title(Component.translatable("creativetab.subtlyrich.subtly_rich_general"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SCULK_REMNANT);
                        output.accept(ModItems.WITHERING_SCULK_REMNANT);
                        output.accept(ModItems.FUSING_SCULK_REMNANT);
                        output.accept(ModBlocks.WITHERING_SCULK_CATALYST);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
