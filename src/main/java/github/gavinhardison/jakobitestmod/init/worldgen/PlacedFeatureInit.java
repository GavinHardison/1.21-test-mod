package github.gavinhardison.jakobitestmod.init.worldgen;

import github.gavinhardison.jakobitestmod.TestMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedFeatureInit {
    public static final RegistryKey<PlacedFeature> POTASH_ORE_KEY = registerKey("potash_ore");
    public static final RegistryKey<PlacedFeature> NETHER_POTASH_ORE_KEY = registerKey("nether_potash_ore");
    public static final RegistryKey<PlacedFeature> END_POTASH_ORE_KEY = registerKey("end_potash_ore");
    public static final RegistryKey<PlacedFeature> CARNATION_KEY = registerKey("carnation");
    public static final RegistryKey<PlacedFeature> CARNATION_PATCH_KEY = registerKey("carnation_patch");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, POTASH_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.POTASH_ORE_KEY),
                Modifiers.modifiersCount(9, HeightRangePlacementModifier.uniform(YOffset.fixed(-24), YOffset.fixed(64))));
        register(context, NETHER_POTASH_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.NETHER_POTASH_ORE_KEY),
                Modifiers.modifiersCount(9, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_POTASH_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.END_POTASH_ORE_KEY),
                Modifiers.modifiersCount(9, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, CARNATION_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.CARNATION_KEY),
                List.of(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR)));
        register(context, CARNATION_PATCH_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.CARNATION_PATCH_KEY),
                List.of(RarityFilterPlacementModifier.of(64),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));
    }
    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, TestMod.id(name));
    }
    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }
    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }
}
