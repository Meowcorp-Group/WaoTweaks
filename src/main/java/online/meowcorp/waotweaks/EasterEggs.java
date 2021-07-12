package online.meowcorp.waotweaks;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class EasterEggs {

    //NINETEEN DOLLAR FORTNITE CARD
    public static final Item FORTNITE_CARD = new Item(
            new Item
                    .Settings()
                    .fireproof()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON)
    );

    public static void register() {

        //NINETEEN DOLLAR FORTNITE CARD
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "fortnite_card"), FORTNITE_CARD);

    }
}
