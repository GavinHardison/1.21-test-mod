package github.gavinhardison.jakobitestmod;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.boatinit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), blockinit.CARNATION, blockinit.CARNATION_POT,
				blockinit.ASH_DOOR, blockinit.ASH_SAPLING, blockinit.ASH_LEAVES, blockinit.ASH_TRAPDOOR);

		TerraformBoatClientHelper.registerModelLayers(boatinit.ASH_BOAT_ID, false);
	}
}