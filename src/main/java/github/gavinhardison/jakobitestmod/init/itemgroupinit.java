package github.gavinhardison.jakobitestmod.init;

import github.gavinhardison.jakobitestmod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class itemgroupinit {
    public static final Text TEST_MOD_TITLE = Text.translatable("itemGroup." + TestMod.MOD_ID + ".test_mod_group");
    public static final ItemGroup TEST_MOD_GROUP = register("test_mod_group", FabricItemGroup.builder()
            .displayName(TEST_MOD_TITLE)
            .icon(Items.BELL::getDefaultStack)
            .special()
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(TestMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
                    .build());
    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, TestMod.id(name), itemGroup);
    }
    public static void load() {}
}
