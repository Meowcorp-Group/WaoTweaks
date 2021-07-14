package online.meowcorp.waotweaks;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
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

    //God's golden sword
    public static ToolItem GODS_GOLDEN_SWORD = new SwordItem(
            GodSwordMaterial.INSTANCE, 2147483647, 2147483647.0F,
            new Item.Settings()
            .fireproof()
            .maxDamage(-2147483647)
    );

    public static void register() {

        //NINETEEN DOLLAR FORTNITE CARD
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "fortnite_card"), FORTNITE_CARD);

        //God's golden sword
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "gods_golden_sword"), GODS_GOLDEN_SWORD);

    }
}
