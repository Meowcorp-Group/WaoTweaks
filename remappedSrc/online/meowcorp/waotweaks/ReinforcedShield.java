package online.meowcorp.waotweaks;

import me.crimsondawn45.fabricshieldlib.lib.object.FabricShield;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ReinforcedShield {
    public static final Item TEST_SHIELD = new FabricShield(new Item.Settings().group(WaoTweaks.SHIELDS), 100, 1, 9, ItemTags.PLANKS);

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "test_shield"), TEST_SHIELD);

        //Registry.register(Registry.ITEM, new Identifier("waotweaks", "example_shield"), new FabricShield(new Item.Settings().group(ItemGroup.COMBAT), 100, 336, 9, ItemTags.PLANKS));

    }
}
