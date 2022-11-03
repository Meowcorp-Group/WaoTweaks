package net.meowcorp.waotweaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.meowcorp.waotweaks.voidorite.VoidoriteOreGen;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.meowcorp.waotweaks.potions.Pots;
import net.meowcorp.waotweaks.voidorite.Voidorite;
import net.meowcorp.waotweaks.voidorite.VoidoriteArmor;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaoTweaks implements ModInitializer {

    public static final Logger clog = LoggerFactory.getLogger("waotweaks");

    //Item Group VOIDORITE
    public static final ItemGroup VOIDORITE = FabricItemGroupBuilder.build(
            new Identifier("waotweaks", "voidorite"),
            () -> new ItemStack(Voidorite.VOIDORITE_INGOT)
    );

    //Item Group FOOD
    public static final ItemGroup FOOD = FabricItemGroupBuilder.build(
            new Identifier("waotweaks", "food"),
            () -> new ItemStack(Food.STEAK_SANDWICH)
    );

    //Itme Group LAMPS
    public static final ItemGroup LAMPS = FabricItemGroupBuilder.build(
            new Identifier("waotweaks", "lamps"),
            () -> new ItemStack(Registry.ITEM.get(new Identifier("waotweaks", "orange_colored_lamp")))
    );

    @Override
    public void onInitialize() {

        //Register other classes
        Voidorite.register();
        VoidoriteOreGen.register();
        VoidoriteArmor.register();
        Food.register();
        EasterEggs.register();
        Extras.register();
        Pots.register();
        ColoredLamps.register();

        clog.info("It appears that WaoTweaks is installed.");
    }

}