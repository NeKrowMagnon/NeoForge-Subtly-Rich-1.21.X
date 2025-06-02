package net.nekrowmagnon.subtlyrich.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.nekrowmagnon.subtlyrich.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class WitheringSculkCatalystBlock extends Block {
    public WitheringSculkCatalystBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hitResult) {

        level.playSound(player, pos, SoundEvents.SCULK_CATALYST_BLOOM, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }


    @Override
    public void stepOn(@NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WITHER, 60));
        }
        if (entity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == Items.END_STONE) {
                itemEntity.setItem(new ItemStack(ModItems.WITHERING_SCULK_REMNANT.get(), itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, state, entity);
    }

}
