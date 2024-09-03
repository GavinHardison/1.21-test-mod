package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import github.gavinhardison.jakobitestmod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureSet;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TestModRecipeProvider extends FabricRecipeProvider {
    public TestModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, blockinit.SILT)
                .input('C', iteminit.SILT_BALL)
                .pattern("CC")
                .pattern("CC")
                .criterion(hasItem(iteminit.SILT_BALL), conditionsFromItem(iteminit.SILT_BALL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.SILT_BRICKS)
                .input('S', iteminit.SILT_BRICK)
                .pattern("SS")
                .pattern("SS")
                .criterion(hasItem(iteminit.SILT_BRICK), conditionsFromItem(iteminit.SILT_BRICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.POLISHED_POTASH_BLOCK, 4)
                .input('P', blockinit.POTASH_BLOCK)
                .pattern("PP")
                .pattern("PP")
                .criterion(hasItem(blockinit.POTASH_BLOCK), conditionsFromItem(blockinit.POTASH_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, blockinit.POTASH_BLOCK)
                .input('P', iteminit.POTASH)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(iteminit.POTASH), conditionsFromItem(iteminit.POTASH))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, iteminit.COPPER_SWORD)
                .input('C', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_PICKAXE)
                .input('C', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_AXE)
                .input('C', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_SHOVEL)
                .input('C', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, iteminit.COPPER_HOE)
                .input('C', Items.COPPER_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("CC")
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, iteminit.COPPER_HELMET)
                .input('C', Items.COPPER_INGOT)
                .pattern("CCC")
                .pattern("C C")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, iteminit.COPPER_CHESTPLATE)
                .input('C', Items.COPPER_INGOT)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, iteminit.COPPER_LEGGINGS)
                .input('C', Items.COPPER_INGOT)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, iteminit.COPPER_BOOTS)
                .input('C', Items.COPPER_INGOT)
                .pattern("C C")
                .pattern("C C")
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
        List<ItemConvertible> copperArmor = List.of(iteminit.COPPER_HELMET, iteminit.COPPER_CHESTPLATE, iteminit.COPPER_LEGGINGS, iteminit.COPPER_BOOTS);
        RecipeProvider.offerSmelting(exporter,
                copperArmor,
                RecipeCategory.MISC,
                Items.COPPER_INGOT,
                0.1F,
                200,
                "test_mod");
        RecipeProvider.offerBlasting(exporter,
                copperArmor,
                RecipeCategory.MISC,
                Items.COPPER_INGOT,
                0.1F,
                100,
                "test_mod");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_PLANKS, 4)
                .input(Ingredient.fromTag(TagList.Items.ASH_LOGS))
                .criterion(hasTag(TagList.Items.ASH_LOGS), conditionsFromTag(TagList.Items.ASH_LOGS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_SLAB, 6)
                .input('A', blockinit.ASH_PLANKS)
                .pattern("AAA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_STAIRS, 4)
                .input('A', blockinit.ASH_PLANKS)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_FENCE, 3)
                .input('A', blockinit.ASH_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("ASA")
                .pattern("ASA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_FENCE_GATE)
                .input('A', blockinit.ASH_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("SAS")
                .pattern("SAS")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_DOOR, 3)
                .input('A', blockinit.ASH_PLANKS)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockinit.ASH_TRAPDOOR, 2)
                .input('A', blockinit.ASH_PLANKS)
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, blockinit.ASH_BUTTON)
                .input(blockinit.ASH_PLANKS)
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, blockinit.ASH_PRESSURE_PLATE)
                .input('A', blockinit.ASH_PLANKS)
                .pattern("AA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, iteminit.ASH_SIGN, 3)
                .input('A', blockinit.ASH_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" S ")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, iteminit.ASH_HANGING_SIGN, 6)
                .input('A', blockinit.ASH_PLANKS)
                .input('C', ConventionalItemTags.CHAINS)
                .pattern("C C")
                .pattern("AAA")
                .pattern("AAA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .criterion(hasTag(ConventionalItemTags.CHAINS), conditionsFromTag(ConventionalItemTags.CHAINS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, iteminit.ASH_BOAT)
                .input('A', blockinit.ASH_PLANKS)
                .pattern("A A")
                .pattern("AAA")
                .criterion(hasItem(blockinit.ASH_PLANKS), conditionsFromItem(blockinit.ASH_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, iteminit.ASH_CHEST_BOAT)
                .input(iteminit.ASH_BOAT)
                .input(ConventionalItemTags.WOODEN_CHESTS)
                .criterion(hasItem(iteminit.ASH_BOAT), conditionsFromItem(iteminit.ASH_BOAT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_CHESTS), conditionsFromTag(ConventionalItemTags.WOODEN_CHESTS))
                .offerTo(exporter);
        var ashFamily = new BlockFamily.Builder(blockinit.ASH_PLANKS)
                .button(blockinit.ASH_BUTTON)
                .fence(blockinit.ASH_FENCE)
                .fenceGate(blockinit.ASH_FENCE_GATE)
                .pressurePlate(blockinit.ASH_PRESSURE_PLATE)
                .sign(blockinit.ASH_SIGN, blockinit.ASH_WALL_SIGN)
                .slab(blockinit.ASH_SLAB)
                .stairs(blockinit.ASH_STAIRS)
                .door(blockinit.ASH_DOOR)
                .trapdoor(blockinit.ASH_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        generateFamily(exporter, ashFamily, FeatureSet.empty());
    }
    private static @NotNull String hasTag(@NotNull TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
