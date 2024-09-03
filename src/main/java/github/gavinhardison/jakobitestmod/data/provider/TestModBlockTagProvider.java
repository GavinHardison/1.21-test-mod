package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.TestMod;
import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class TestModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TestModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(blockinit.SILT)
                .add(blockinit.SILT_BRICKS)
                .add(blockinit.POTASH_ORE)
                .add(blockinit.DEEPSLATE_POTASH_ORE)
                .add(blockinit.NETHER_POTASH_ORE)
                .add(blockinit.END_POTASH_ORE)
                .add(blockinit.POTASH_BLOCK)
                .add(blockinit.POLISHED_POTASH_BLOCK);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(blockinit.SILT_BRICKS)
                .add(blockinit.POTASH_ORE)
                .add(blockinit.DEEPSLATE_POTASH_ORE)
                .add(blockinit.NETHER_POTASH_ORE)
                .add(blockinit.END_POTASH_ORE)
                .add(blockinit.POTASH_BLOCK)
                .add(blockinit.POLISHED_POTASH_BLOCK);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(blockinit.SILT);
        getOrCreateTagBuilder(TagList.Blocks.COPPER_TAG)
                .add(Blocks.COPPER_BLOCK);
        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_COPPER_TOOL)
                .add(Blocks.OBSIDIAN)
                .add(Blocks.CRYING_OBSIDIAN)
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.BEACON);
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(blockinit.CARNATION);
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(blockinit.CARNATION_POT);
        getOrCreateTagBuilder(TagList.Blocks.ASH_LOGS)
                .add(blockinit.ASH_LOG)
                .add(blockinit.STRIPPED_ASH_LOG)
                .add(blockinit.ASH_WOOD)
                .add(blockinit.STRIPPED_ASH_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(TagList.Blocks.ASH_LOGS);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(blockinit.ASH_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(blockinit.ASH_SAPLING);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(blockinit.ASH_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(blockinit.ASH_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(blockinit.ASH_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(blockinit.ASH_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(blockinit.ASH_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(blockinit.ASH_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(blockinit.ASH_STAIRS);
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(blockinit.ASH_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(blockinit.ASH_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(blockinit.ASH_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(blockinit.ASH_WALL_HANGING_SIGN);
    }
}
