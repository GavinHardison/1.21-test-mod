package github.gavinhardison.jakobitestmod.init;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import github.gavinhardison.jakobitestmod.TestMod;
import github.gavinhardison.jakobitestmod.list.BlockSetTypeList;
import github.gavinhardison.jakobitestmod.list.WoodTypeList;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.List;

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

    public static final FlowerBlock CARNATION = registerWithItem("carnation", new FlowerBlock(
            createStewEffects(
                    new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SPEED, 400),
                    new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.JUMP_BOOST, 400)),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CARNATION_POT = register("carnation_pot",
            Blocks.createFlowerPotBlock(CARNATION));

    public static final Block ASH_LOG = registerWithItem("ash_log",
            Blocks.createLogBlock(MapColor.OFF_WHITE, MapColor.BROWN));

    public static final Block STRIPPED_ASH_LOG = registerWithItem("stripped_ash_log",
            Blocks.createLogBlock(MapColor.OFF_WHITE, MapColor.OFF_WHITE));

    public static final Block ASH_WOOD = registerWithItem("ash_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block STRIPPED_ASH_WOOD = registerWithItem("stripped_ash_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RAW_IRON_PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final LeavesBlock ASH_LEAVES = registerWithItem("ash_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final SaplingBlock ASH_SAPLING = registerWithItem("ash_sapling",
            new SaplingBlock(
                    null,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)));

    public static final Block ASH_PLANKS = registerWithItem("ash_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.RAW_IRON_PINK)));

    public static final DoorBlock ASH_DOOR = registerWithItem("ash_door",
            new DoorBlock(BlockSetTypeList.ASH,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .nonOpaque()
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final FenceBlock ASH_FENCE = registerWithItem("ash_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(ASH_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final FenceGateBlock ASH_FENCE_GATE = registerWithItem("ash_fence_gate",
            new FenceGateBlock(WoodTypeList.ASH,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()));

    public static final StairsBlock ASH_STAIRS = registerWithItem("ash_stairs",
            new StairsBlock(ASH_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)
                    .mapColor(ASH_PLANKS.getDefaultMapColor())));

    public static final SlabBlock ASH_SLAB = registerWithItem("ash_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(ASH_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final PressurePlateBlock ASH_PRESSURE_PLATE = registerWithItem("ash_pressure_plate",
            new PressurePlateBlock(BlockSetTypeList.ASH,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(0.5F)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ASH_BUTTON = registerWithItem("ash_button",
            Blocks.createWoodenButtonBlock(BlockSetTypeList.ASH));

    public static final TrapdoorBlock ASH_TRAPDOOR = registerWithItem("ash_trapdoor",
            new TrapdoorBlock(BlockSetTypeList.ASH,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .burnable()));

    private static final Identifier ASH_SIGN_TEXTURE = TestMod.id("entity/signs/ash");

    private static final Identifier ASH_HANGING_SIGN_TEXTURE = TestMod.id("entity/signs/hanging/ash");

    private static final Identifier ASH_HANGING_SIGN_GUI_TEXTURE = TestMod.id("textures/gui/hanging_signs/ash");

    public static final TerraformSignBlock ASH_SIGN = register("ash_sign",
            new TerraformSignBlock(ASH_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final TerraformWallSignBlock ASH_WALL_SIGN = register("ash_wall_sign",
            new TerraformWallSignBlock(ASH_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final TerraformHangingSignBlock ASH_HANGING_SIGN = register("ash_hanging_sign",
            new TerraformHangingSignBlock(ASH_HANGING_SIGN_TEXTURE, ASH_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
                            .sounds(BlockSoundGroup.HANGING_SIGN)));

    public static final TerraformWallHangingSignBlock ASH_WALL_HANGING_SIGN = register("ash_wall_hanging_sign",
            new TerraformWallHangingSignBlock(ASH_HANGING_SIGN_TEXTURE, ASH_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(ASH_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
                            .sounds(BlockSoundGroup.HANGING_SIGN)));

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

    private static SuspiciousStewEffectsComponent createStewEffects(SuspiciousStewEffectsComponent.StewEffect... effects) {
        return new SuspiciousStewEffectsComponent(List.of(effects));
    }

    public static void load() {}
}
