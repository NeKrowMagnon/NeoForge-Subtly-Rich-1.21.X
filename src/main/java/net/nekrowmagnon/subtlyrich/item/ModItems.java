package net.nekrowmagnon.subtlyrich.item;

import net.minecraft.world.item.Item;
import net.nekrowmagnon.subtlyrich.SubtlyRich;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static  final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SubtlyRich.MOD_ID);

    public static final DeferredItem<Item> SCULK_REMNANT = ITEMS.register("sculk_remnant",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WITHERING_SCULK_REMNANT = ITEMS.register("withering_sculk_remnant",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FUSING_SCULK_REMNANT = ITEMS.register("fusing_sculk_remnant",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


