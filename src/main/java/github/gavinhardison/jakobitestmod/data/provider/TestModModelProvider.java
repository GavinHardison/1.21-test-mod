package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class TestModModelProvider extends FabricModelProvider {
    public TestModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.SILT);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.SILT_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.POTASH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.DEEPSLATE_POTASH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.NETHER_POTASH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.END_POTASH_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.POTASH_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.POLISHED_POTASH_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(iteminit.SILT_BALL, Models.GENERATED);
        itemModelGenerator.register(iteminit.RYE_BREAD, Models.GENERATED);
        itemModelGenerator.register(iteminit.SILT_BRICK, Models.GENERATED);
        itemModelGenerator.register(iteminit.POTASH, Models.GENERATED);
        itemModelGenerator.register(iteminit.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(iteminit.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(iteminit.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(iteminit.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(iteminit.COPPER_HOE, Models.HANDHELD);
    }
}
