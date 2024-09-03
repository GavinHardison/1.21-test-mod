package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.TestMod;
import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.itemgroupinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import github.gavinhardison.jakobitestmod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TestModEnglishLanguageProvider extends FabricLanguageProvider {

    public TestModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if(text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            TestMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(iteminit.SILT_BALL, "Silt Ball");
        translationBuilder.add(iteminit.RYE_BREAD, "Rye Bread");
        translationBuilder.add(iteminit.SILT_BRICK, "Silt Brick");
        translationBuilder.add(iteminit.POTASH, "Potash");
        translationBuilder.add(blockinit.SILT, "Silt");
        translationBuilder.add(blockinit.SILT_BRICKS, "Silt Bricks");
        translationBuilder.add(blockinit.POTASH_ORE, "Potash Ore");
        translationBuilder.add(blockinit.DEEPSLATE_POTASH_ORE, "Deepslate Potash Ore");
        translationBuilder.add(blockinit.NETHER_POTASH_ORE, "Nether Potash Ore");
        translationBuilder.add(blockinit.END_POTASH_ORE, "End Potash Ore");
        translationBuilder.add(blockinit.POTASH_BLOCK, "Potash Block");
        translationBuilder.add(blockinit.POLISHED_POTASH_BLOCK, "Polished Potash Block");
        translationBuilder.add(iteminit.COPPER_SWORD, "Copper Sword");
        translationBuilder.add(iteminit.COPPER_PICKAXE, "Copper Pickaxe");
        translationBuilder.add(iteminit.COPPER_AXE, "Copper Axe");
        translationBuilder.add(iteminit.COPPER_SHOVEL, "Copper Shovel");
        translationBuilder.add(iteminit.COPPER_HOE, "Copper Hoe");
        translationBuilder.add(iteminit.COPPER_HELMET, "Copper Helmet");
        translationBuilder.add(iteminit.COPPER_CHESTPLATE, "Copper Chestplate");
        translationBuilder.add(iteminit.COPPER_LEGGINGS, "Copper Leggings");
        translationBuilder.add(iteminit.COPPER_BOOTS, "Copper Boots");
        translationBuilder.add(blockinit.CARNATION, "Carnation");
        translationBuilder.add(blockinit.CARNATION_POT, "Carnation Pot");
        translationBuilder.add(blockinit.ASH_LOG, "Ash Log");
        translationBuilder.add(blockinit.STRIPPED_ASH_LOG, "Stripped Ash Log");
        translationBuilder.add(blockinit.ASH_WOOD, "Ash Wood");
        translationBuilder.add(blockinit.STRIPPED_ASH_WOOD, "Stripped Ash Wood");
        translationBuilder.add(blockinit.ASH_LEAVES, "Ash Leaves");
        translationBuilder.add(blockinit.ASH_SAPLING, "Ash Sapling");
        translationBuilder.add(blockinit.ASH_PLANKS, "Ash Planks");
        translationBuilder.add(blockinit.ASH_SLAB, "Ash Slab");
        translationBuilder.add(blockinit.ASH_STAIRS, "Ash Stairs");
        translationBuilder.add(blockinit.ASH_FENCE, "Ash Fence");
        translationBuilder.add(blockinit.ASH_FENCE_GATE, "Ash Fence Gate");
        translationBuilder.add(blockinit.ASH_DOOR, "Ash Door");
        translationBuilder.add(blockinit.ASH_TRAPDOOR, "Ash Trapdoor");
        translationBuilder.add(blockinit.ASH_BUTTON, "Ash Button");
        translationBuilder.add(blockinit.ASH_PRESSURE_PLATE, "Ash Pressure Plate");
        translationBuilder.add(iteminit.ASH_SIGN, "Ash Sign");
        translationBuilder.add(iteminit.ASH_HANGING_SIGN, "Ash Hanging Sign");
        translationBuilder.add(iteminit.ASH_BOAT, "Ash Boat");
        translationBuilder.add(iteminit.ASH_CHEST_BOAT, "Ash Chest Boat");
        translationBuilder.add(TagList.Items.ASH_LOGS, "Ash Logs");

        addText(translationBuilder, itemgroupinit.TEST_MOD_TITLE, "Test Mod");
    }
}
