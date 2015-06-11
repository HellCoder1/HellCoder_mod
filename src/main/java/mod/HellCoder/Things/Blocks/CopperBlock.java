package mod.HellCoder.Things.Blocks;

import net.minecraft.block.material.Material;

public class CopperBlock extends HCBlock {

    public CopperBlock(Material materialIn, String name) {
        super(materialIn, name);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeMetal);
    }
}
