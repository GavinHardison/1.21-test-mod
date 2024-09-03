package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

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
        blockStateModelGenerator.registerFlowerPotPlant(blockinit.CARNATION, blockinit.CARNATION_POT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(blockinit.ASH_LOG)
                .log(blockinit.ASH_LOG)
                .wood(blockinit.ASH_WOOD);
        blockStateModelGenerator.registerLog(blockinit.STRIPPED_ASH_LOG)
                .log(blockinit.STRIPPED_ASH_LOG)
                .wood(blockinit.STRIPPED_ASH_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(blockinit.ASH_LEAVES);
        blockStateModelGenerator.registerTintableCross(blockinit.ASH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerHangingSign(blockinit.STRIPPED_ASH_LOG, blockinit.ASH_HANGING_SIGN, blockinit.ASH_WALL_HANGING_SIGN);

        var ashFamily = new BlockFamily.Builder(blockinit.ASH_PLANKS)
                .button(blockinit.ASH_BUTTON)
                .fence(blockinit.ASH_FENCE)
                .fenceGate(blockinit.ASH_FENCE_GATE)
                .pressurePlate(blockinit.ASH_PRESSURE_PLATE)
                .sign(blockinit.ASH_SIGN, blockinit.ASH_WALL_SIGN)
                .slab(blockinit.ASH_SLAB)
                .stairs(blockinit.ASH_STAIRS)
                .door(blockinit.ASH_DOOR)
                .trapdoor(blockinit.ASH_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(ashFamily.getBaseBlock())
                .family(ashFamily);
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
        itemModelGenerator.register(iteminit.COPPER_HELMET, Models.GENERATED);
        itemModelGenerator.register(iteminit.COPPER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(iteminit.COPPER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(iteminit.COPPER_BOOTS, Models.GENERATED);
        itemModelGenerator.register(iteminit.ASH_BOAT, Models.GENERATED);
        itemModelGenerator.register(iteminit.ASH_CHEST_BOAT, Models.GENERATED);
    }
}
