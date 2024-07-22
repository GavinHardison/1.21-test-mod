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
    }
}
