package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TestModRecipeProvider extends FabricRecipeProvider {
    public TestModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, blockinit.SILT)
                .input('E', iteminit.SILT_BALL)
                .pattern("EE")
                .pattern("EE")
                .criterion(hasItem(iteminit.SILT_BALL), conditionsFromItem(iteminit.SILT_BALL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.SILT_BRICKS)
                .input('E', iteminit.SILT_BRICK)
                .pattern("EE")
                .pattern("EE")
                .criterion(hasItem(iteminit.SILT_BRICK), conditionsFromItem(iteminit.SILT_BRICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.POLISHED_POTASH_BLOCK, 4)
                .input('E', blockinit.POTASH_BLOCK)
                .pattern("EE")
                .pattern("EE")
                .criterion(hasItem(blockinit.POTASH_BLOCK), conditionsFromItem(blockinit.POTASH_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, blockinit.POTASH_BLOCK)
                .input('E', iteminit.POTASH)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(iteminit.POTASH), conditionsFromItem(iteminit.POTASH))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, iteminit.COPPER_SWORD)
                .input('E', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_PICKAXE)
                .input('E', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_AXE)
                .input('E', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_SHOVEL)
                .input('E', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_HOE)
                .input('E', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EE")
                .pattern(" S")
                .pattern(" S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, iteminit.POTASH, 9)
                .input(blockinit.POTASH_BLOCK)
                .criterion(hasItem(blockinit.POTASH_BLOCK), conditionsFromItem(blockinit.POTASH_BLOCK))
                .offerTo(exporter);
        List<ItemConvertible> siltBall = List.of(iteminit.SILT_BALL);
        List<ItemConvertible> potashOres = List.of(blockinit.POTASH_ORE, blockinit.DEEPSLATE_POTASH_ORE, blockinit.NETHER_POTASH_ORE, blockinit.END_POTASH_ORE);
        ItemConvertible polishedPotashBlock = blockinit.POLISHED_POTASH_BLOCK;
        ItemConvertible potashBlock = blockinit.POTASH_BLOCK;
        List<ItemConvertible> copperTools = List.of(iteminit.COPPER_SWORD, iteminit.COPPER_PICKAXE, iteminit.COPPER_AXE, iteminit.COPPER_SHOVEL, iteminit.COPPER_HOE);
        RecipeProvider.offerSmelting(exporter,
                siltBall,
                RecipeCategory.MISC,
                iteminit.SILT_BRICK,
                0.3F,
                100,
                "test_mod");
        RecipeProvider.offerSmelting(exporter,
                potashOres,
                RecipeCategory.MISC,
                iteminit.POTASH,
                0.5F,
                200,
                "test_mod");
        RecipeProvider.offerBlasting(exporter,
                potashOres,
                RecipeCategory.MISC,
                iteminit.POTASH,
                0.5F,
                100,
                "test_mod");
        RecipeProvider.offerSmelting(exporter,
                copperTools,
                RecipeCategory.MISC,
                Items.COPPER_INGOT,
                0.1F,
                200,
                "test_mod");
        RecipeProvider.offerBlasting(exporter,
                copperTools,
                RecipeCategory.MISC,
                Items.COPPER_INGOT,
                0.1F,
                100,
                "test_mod");
        RecipeProvider.offerStonecuttingRecipe(exporter,
                RecipeCategory.BUILDING_BLOCKS,
                polishedPotashBlock,
                potashBlock);
    }
    private static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
