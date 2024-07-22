package github.gavinhardison.jakobitestmod;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.itemgroupinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
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
		LOGGER.info("Loaded!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
