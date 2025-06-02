package net.nekrowmagnon.subtlyrich.item;

import net.minecraft.world.item.Item;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.nekrowmagnon.subtlyrich.item.custom.FuelItem;
import net.nekrowmagnon.subtlyrich.item.custom.SculkRemnantItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static  final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SubtlyRich.MOD_ID);

    public static final DeferredItem<Item> SCULK_REMNANT = ITEMS.register("sculk_remnant",
            () -> new SculkRemnantItem(new Item.Properties().durability(8)));
    public static final DeferredItem<Item> WITHERING_SCULK_REMNANT = ITEMS.register("withering_sculk_remnant",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FUSING_SCULK_REMNANT = ITEMS.register("fusing_sculk_remnant",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHULKER_PALP = ITEMS.register("shulker_palp",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SHULKER_PALP)));
    public static final DeferredItem<Item> CALCIUM_DUST = ITEMS.register("calcium_dust",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final DeferredItem<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


