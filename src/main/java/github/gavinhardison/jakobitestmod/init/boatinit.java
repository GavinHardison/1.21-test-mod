package github.gavinhardison.jakobitestmod.init;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import github.gavinhardison.jakobitestmod.TestMod;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class boatinit {
    public static final Identifier ASH_BOAT_ID = TestMod.id("ash_boat");
    public static final Identifier ASH_CHEST_BOAT_ID = TestMod.id("ash_chest_boat");
    public static final RegistryKey<TerraformBoatType> ASH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ASH_BOAT_ID);

    public static final TerraformBoatType ASH_TYPE = register(ASH_BOAT_KEY, new TerraformBoatType.Builder()
            .item(iteminit.ASH_BOAT)
            .chestItem(iteminit.ASH_CHEST_BOAT)
            .planks(blockinit.ASH_PLANKS.asItem())
            .build());

    public static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }

    public static void load() {}
}
