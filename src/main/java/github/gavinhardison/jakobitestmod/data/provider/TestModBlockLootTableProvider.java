package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TestModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TestModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addDrop(blockinit.SILT_BRICKS);
        addDrop(blockinit.SILT);
        addDrop(blockinit.POTASH_ORE);
        addDrop(blockinit.DEEPSLATE_POTASH_ORE);
        addDrop(blockinit.NETHER_POTASH_ORE);
        addDrop(blockinit.END_POTASH_ORE);
        addDrop(blockinit.POTASH_BLOCK);
        addDrop(blockinit.POLISHED_POTASH_BLOCK);
        addDrop(blockinit.CARNATION);
        addPottedPlantDrops(blockinit.CARNATION_POT);

        addDrop(blockinit.ASH_LOG);
        addDrop(blockinit.STRIPPED_ASH_LOG);
        addDrop(blockinit.ASH_WOOD);
        addDrop(blockinit.STRIPPED_ASH_WOOD);
        leavesDrops(blockinit.ASH_LEAVES, blockinit.ASH_SAPLING, SAPLING_DROP_CHANCE);
        addDrop(blockinit.ASH_SAPLING);
        addDrop(blockinit.ASH_PLANKS);
        addDrop(blockinit.ASH_SLAB);
        addDrop(blockinit.ASH_STAIRS);
        addDrop(blockinit.ASH_FENCE);
        addDrop(blockinit.ASH_FENCE_GATE);
        doorDrops(blockinit.ASH_DOOR);
        addDrop(blockinit.ASH_TRAPDOOR);
        addDrop(blockinit.ASH_BUTTON);
        addDrop(blockinit.ASH_PRESSURE_PLATE);
        addDrop(blockinit.ASH_SIGN, iteminit.ASH_SIGN);
        addDrop(blockinit.ASH_WALL_SIGN, iteminit.ASH_SIGN);
        addDrop(blockinit.ASH_HANGING_SIGN, iteminit.ASH_HANGING_SIGN);
        addDrop(blockinit.ASH_WALL_HANGING_SIGN, iteminit.ASH_HANGING_SIGN);
    }
}
