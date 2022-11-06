package net.meowcorp.waotweaks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.meowcorp.waotweaks.WaoTweaks;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

@Environment(EnvType.CLIENT)
public class WaoTweaksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (DyeColor color : DyeColor.values()) {
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> color.getFireworkColor(),
                    Registry.BLOCK.get(new Identifier(WaoTweaks.MODID, color.name().toLowerCase(Locale.ROOT) + "_colored_lamp")));
        }
    }
}
