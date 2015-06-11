package mod.HellCoder.Things.Blocks;

import net.minecraft.block.material.Material;

public class CopperOre extends HCBlock {

    public CopperOre(Material materialIn, String name) {
        super(materialIn, name);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
    }
}
