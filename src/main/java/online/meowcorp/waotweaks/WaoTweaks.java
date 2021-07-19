package online.meowcorp.waotweaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class WaoTweaks implements ModInitializer {

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

    @Override
    public void onInitialize() {

        //Register other classes
        Voidorite.register();
        VoidoriteOreGen.register();
        VoidoriteArmor.register();
        Food.register();
        EasterEggs.register();

    }

}