package github.gavinhardison.jakobitestmod.data.provider;

import github.gavinhardison.jakobitestmod.init.blockinit;
import github.gavinhardison.jakobitestmod.init.iteminit;
import github.gavinhardison.jakobitestmod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class TestModItemTagProvider extends FabricTagProvider<Item> {
    public TestModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(iteminit.COPPER_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(iteminit.COPPER_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(iteminit.COPPER_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(iteminit.COPPER_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(iteminit.COPPER_HOE);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(iteminit.COPPER_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(iteminit.COPPER_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(iteminit.COPPER_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(iteminit.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(blockinit.CARNATION.asItem());
        getOrCreateTagBuilder(TagList.Items.ASH_LOGS)
                .add(blockinit.ASH_LOG.asItem())
                .add(blockinit.STRIPPED_ASH_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(TagList.Items.ASH_LOGS);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(blockinit.ASH_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(blockinit.ASH_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(blockinit.ASH_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(blockinit.ASH_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(blockinit.ASH_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(blockinit.ASH_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(blockinit.ASH_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(blockinit.ASH_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(blockinit.ASH_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(blockinit.ASH_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(blockinit.ASH_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(iteminit.ASH_SIGN);
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(iteminit.ASH_HANGING_SIGN);
        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(iteminit.ASH_BOAT);
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(iteminit.ASH_CHEST_BOAT);
    }
}
