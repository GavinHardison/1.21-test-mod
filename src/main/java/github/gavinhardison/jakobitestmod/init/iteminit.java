package github.gavinhardison.jakobitestmod.init;

import github.gavinhardison.jakobitestmod.TestMod;
import github.gavinhardison.jakobitestmod.list.FoodList;
import github.gavinhardison.jakobitestmod.list.enums.TestModToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class iteminit {
    public static final Item SILT_BALL = register("silt_ball", new Item(new Item.Settings()));
    public static final Item RYE_BREAD = register("rye_bread", new Item(new Item.Settings().food(FoodList.RYE_BREAD_COMPONENT).maxCount(16)));
    public static final Item SILT_BRICK = register("silt_brick", new Item(new Item.Settings()));
    public static final Item POTASH = register("potash", new Item(new Item.Settings()));
    public static final SwordItem COPPER_SWORD = register("copper_sword",
            new SwordItem(TestModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(TestModToolMaterials.COPPER, 3, -2.4f))));
    public static final PickaxeItem COPPER_PICKAXE = register("copper_pickaxe",
            new PickaxeItem(TestModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(TestModToolMaterials.COPPER, 1, -2.8f))));
    public static final AxeItem COPPER_AXE = register("copper_axe",
            new AxeItem(TestModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(TestModToolMaterials.COPPER, 6, -3.0f))));
    public static final ShovelItem COPPER_SHOVEL = register("copper_shovel",
            new ShovelItem(TestModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(TestModToolMaterials.COPPER, 1.5F, -3.0f))));
    public static final HoeItem COPPER_HOE = register("copper_hoe",
            new HoeItem(TestModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(TestModToolMaterials.COPPER, 0, -3.0f))));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, TestMod.id(name), item);
    }
    public static void load() {}
}
