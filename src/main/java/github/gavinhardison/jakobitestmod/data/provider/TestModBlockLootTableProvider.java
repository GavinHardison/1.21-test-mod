package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
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
    }
}
