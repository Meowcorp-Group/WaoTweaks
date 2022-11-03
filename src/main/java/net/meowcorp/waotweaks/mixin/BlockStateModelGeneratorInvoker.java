package net.meowcorp.waotweaks.mixin;

import net.minecraft.data.client.BlockStateModelGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockStateModelGenerator.class)
public interface BlockStateModelGeneratorInvoker {
    @Invoker("registerRedstoneLamp")
    void invokeRegisterRedstoneLamp();
}
