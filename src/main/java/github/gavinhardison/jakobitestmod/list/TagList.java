package github.gavinhardison.jakobitestmod.list;

import github.gavinhardison.jakobitestmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> COPPER_TAG = TagKey.of(RegistryKeys.BLOCK, TestMod.id("copper"));
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = TagKey.of(RegistryKeys.BLOCK, TestMod.id("incorrect_for_copper_tool"));
    }
}
