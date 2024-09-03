package github.gavinhardison.jakobitestmod;

import github.gavinhardison.jakobitestmod.init.*;
import github.gavinhardison.jakobitestmod.init.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("TestMod");
	public static final String MOD_ID = "jakobitestmod";

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		iteminit.load();
		blockinit.load();
		itemgroupinit.load();
		BiomeModificationInit.load();
		armormaterialinit.load();
		boatinit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.BREAD, iteminit.RYE_BREAD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.CLAY, blockinit.SILT);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.CLAY_BALL, iteminit.SILT_BALL);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Items.BRICK_WALL, blockinit.SILT_BRICKS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.BRICK, iteminit.SILT_BRICK);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.GLOWSTONE_DUST, iteminit.POTASH);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.DEEPSLATE_COAL_ORE, blockinit.POTASH_ORE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(blockinit.POTASH_ORE, blockinit.DEEPSLATE_POTASH_ORE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(blockinit.DEEPSLATE_POTASH_ORE, blockinit.NETHER_POTASH_ORE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(blockinit.NETHER_POTASH_ORE, blockinit.END_POTASH_ORE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.RAW_IRON_BLOCK, blockinit.POTASH_BLOCK);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Items.SMOOTH_QUARTZ_SLAB, blockinit.POLISHED_POTASH_BLOCK);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.AMETHYST_SHARD, iteminit.POTASH);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(Items.STONE_HOE, iteminit.COPPER_SHOVEL);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(iteminit.COPPER_SHOVEL, iteminit.COPPER_PICKAXE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(iteminit.COPPER_PICKAXE, iteminit.COPPER_AXE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(iteminit.COPPER_AXE, iteminit.COPPER_HOE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.STONE_SWORD, iteminit.COPPER_SWORD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.CHAINMAIL_BOOTS, iteminit.COPPER_HELMET);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(iteminit.COPPER_HELMET, iteminit.COPPER_CHESTPLATE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(iteminit.COPPER_CHESTPLATE, iteminit.COPPER_LEGGINGS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(iteminit.COPPER_LEGGINGS, iteminit.COPPER_BOOTS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.POPPY, blockinit.CARNATION);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Items.BAMBOO_BUTTON, blockinit.ASH_LOG);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_LOG, blockinit.ASH_WOOD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_WOOD, blockinit.STRIPPED_ASH_LOG);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.STRIPPED_ASH_LOG, blockinit.STRIPPED_ASH_WOOD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.STRIPPED_ASH_WOOD, blockinit.ASH_PLANKS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_PLANKS, blockinit.ASH_STAIRS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_STAIRS, blockinit.ASH_SLAB);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_SLAB, blockinit.ASH_FENCE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_FENCE, blockinit.ASH_FENCE_GATE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_FENCE_GATE, blockinit.ASH_DOOR);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_DOOR, blockinit.ASH_TRAPDOOR);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_TRAPDOOR, blockinit.ASH_PRESSURE_PLATE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(blockinit.ASH_PRESSURE_PLATE, blockinit.ASH_BUTTON);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.CHERRY_LEAVES, blockinit.ASH_LEAVES);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.CHERRY_SAPLING, blockinit.ASH_SAPLING);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.addAfter(Items.BAMBOO_HANGING_SIGN, blockinit.ASH_SIGN);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.addAfter(blockinit.ASH_SIGN, blockinit.ASH_HANGING_SIGN);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(Items.BAMBOO_CHEST_RAFT, iteminit.ASH_BOAT);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(iteminit.ASH_BOAT, iteminit.ASH_CHEST_BOAT);
		});
		LOGGER.info("Loaded!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}