package net.meowcorp.waotweaks.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Pots {
    //Levitation
    public static final Potion LEVITATION = new Potion("levitation",
            new StatusEffectInstance(StatusEffects.LEVITATION, 3600, 0)
    );
    public static final Potion LONG_LEVITATION = new Potion("levitation",
            new StatusEffectInstance(StatusEffects.LEVITATION, 9600, 0)
    );
    public static final Potion STRONG_LEVITATION = new Potion("levitation",
            new StatusEffectInstance(StatusEffects.LEVITATION, 1800, 1)
    );

    public static void register() {
        Registry.register(Registry.POTION, new Identifier("waotweaks", "levitation"), LEVITATION);
        Registry.register(Registry.POTION, new Identifier("waotweaks", "long_levitation"), LONG_LEVITATION);
        Registry.register(Registry.POTION, new Identifier("waotweaks", "strong_levitation"), STRONG_LEVITATION);
    }
}
