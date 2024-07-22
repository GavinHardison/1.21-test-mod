package github.gavinhardison.jakobitestmod.init;

import github.gavinhardison.jakobitestmod.TestMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.IntProvider;

public class blockinit {
    public static final Block SILT = registerWithItem("silt", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .instrument(NoteBlockInstrument.FLUTE)
            .strength(0.4F)
            .sounds(BlockSoundGroup.SAND)));
    public static final Block SILT_BRICKS = registerWithItem("silt_bricks", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block POTASH_ORE = registerWithItem("potash_ore", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(2.0F, 3.0F)
            .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_POTASH_ORE = registerWithItem("deepslate_potash_ore", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.DEEPSLATE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(3.0F, 3.0F)
            .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block NETHER_POTASH_ORE = registerWithItem("nether_potash_ore", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.DARK_RED)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(2.0F, 3.0F)
            .sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block END_POTASH_ORE = registerWithItem("end_potash_ore", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.PALE_YELLOW)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(2.0F, 3.0F)
            .sounds(BlockSoundGroup.STONE)));
    public static final Block POTASH_BLOCK = registerWithItem("potash_block", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.DULL_PINK)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(1.5F, 3.0F)
            .sounds(BlockSoundGroup.CALCITE)));
    public static final Block POLISHED_POTASH_BLOCK = registerWithItem("polished_potash_block", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.DULL_PINK)
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresTool()
            .strength(1.5F, 3.0F)
            .sounds(BlockSoundGroup.CALCITE)));
    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, TestMod.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        iteminit.register(name, new BlockItem(registered, settings));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }
    public static void load() {}
}
