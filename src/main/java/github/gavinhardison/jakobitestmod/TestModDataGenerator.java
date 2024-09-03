package github.gavinhardison.jakobitestmod;

import github.gavinhardison.jakobitestmod.data.generator.TestModWorldGenerator;
import github.gavinhardison.jakobitestmod.data.provider.*;
import github.gavinhardison.jakobitestmod.init.worldgen.ConfiguredFeatureInit;
import github.gavinhardison.jakobitestmod.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TestModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(TestModModelProvider::new);
		pack.addProvider(TestModEnglishLanguageProvider::new);
		pack.addProvider(TestModBlockLootTableProvider::new);
		pack.addProvider(TestModBlockTagProvider::new);
		pack.addProvider(TestModItemTagProvider::new);
		pack.addProvider(TestModWorldGenerator::new);
		pack.addProvider(TestModRecipeProvider::new);
	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}
