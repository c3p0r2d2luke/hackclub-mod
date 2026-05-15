package hackclub.ModItems;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CUSTOM_SWORD = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("mymod", "custom_sword"),
                CUSTOM_SWORD);
    }
}