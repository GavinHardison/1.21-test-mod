package github.gavinhardison.jakobitestmod.list;

import github.gavinhardison.jakobitestmod.TestMod;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class WoodTypeList {
    public static final WoodType ASH = new WoodType(
            TestMod.id("ash").toString(),
            BlockSetTypeList.ASH,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_OPEN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE);
}
