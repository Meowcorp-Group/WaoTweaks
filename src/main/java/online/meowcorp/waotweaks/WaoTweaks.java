package online.meowcorp.waotweaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class WaoTweaks implements ModInitializer {

    //Item Group ENDERITE
    public static final ItemGroup ENDERITE = FabricItemGroupBuilder.build(
            new Identifier("waotweaks", "enderite"),
            () -> new ItemStack(Enderite.ENDERITE_INGOT)
    );

    //Item Group FOOD
    public static final ItemGroup FOOD = FabricItemGroupBuilder.build(
            new Identifier("waotweaks", "food"),
            () -> new ItemStack(Food.STEAK_SANDWICH)
    );

    @Override
    public void onInitialize() {

        //Register other classes
        Enderite.register();
        EnderiteOreGen.register();
        EnderiteArmor.register();
        Food.register();
        EasterEggs.register();

    }

}