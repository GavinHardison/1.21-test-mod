package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.TestMod;
import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.itemgroupinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
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
        addText(translationBuilder, itemgroupinit.TEST_MOD_TITLE, "Test Mod");
    }
}
