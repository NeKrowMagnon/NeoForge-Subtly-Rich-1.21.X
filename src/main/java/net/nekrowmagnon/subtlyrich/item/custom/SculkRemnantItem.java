package net.nekrowmagnon.subtlyrich.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;

import java.util.Map;

public class SculkRemnantItem extends Item {
    private static final Map<Block, Block> SCULK_MAP =
            Map.of(
                    Blocks.END_STONE, Blocks.SCULK,
                    Blocks.CHORUS_PLANT, Blocks.AMETHYST_CLUSTER,
                    Blocks.CHORUS_FLOWER, ModBlocks.SHULK_POLYP.get()
            );

    public SculkRemnantItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(SCULK_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), SCULK_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_BLOCK_CHARGE, SoundSource.BLOCKS);
            }

        }

        return InteractionResult.SUCCESS;
    }
}
