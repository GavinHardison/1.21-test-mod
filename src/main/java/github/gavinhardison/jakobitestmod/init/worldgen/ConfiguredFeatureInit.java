package github.gavinhardison.jakobitestmod.init.worldgen;

import github.gavinhardison.jakobitestmod.TestMod;
import github.gavinhardison.jakobitestmod.init.blockinit;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> POTASH_ORE_KEY = registerKey("potash_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_POTASH_ORE_KEY = registerKey("nether_potash_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_POTASH_ORE_KEY = registerKey("end_potash_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CARNATION_KEY = registerKey("carnation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CARNATION_PATCH_KEY = registerKey("carnation_patch");
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneOreReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherOreReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endOreReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldPotashTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, blockinit.POTASH_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, blockinit.DEEPSLATE_POTASH_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherPotashTargets = List.of(
                OreFeatureConfig.createTarget(netherOreReplaceables, blockinit.NETHER_POTASH_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endPotashTargets = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, blockinit.END_POTASH_ORE.getDefaultState()));
        register(context, POTASH_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPotashTargets, 9));
        register(context, NETHER_POTASH_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherPotashTargets, 9));
        register(context, END_POTASH_ORE_KEY, Feature.ORE, new OreFeatureConfig(endPotashTargets, 9));

        RegistryEntryLookup<PlacedFeature> registryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        register(context, CARNATION_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                BlockStateProvider.of(blockinit.CARNATION)));

        register(context, CARNATION_PATCH_KEY, Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        6,
                        3,
                        registryLookup.getOrThrow(PlacedFeatureInit.CARNATION_KEY)));
    }
    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, TestMod.id(name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                   F feature,
                                                                                   FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
