package mod.HellCoder.Things.Blocks;

import mod.HellCoder.HellCoder_mod;
import mod.HellCoder.Utility.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HCBlock extends Block {

    public HCBlock(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellCoder_mod.tabsHC);
        RegisterHelper.registerBlock(this);
    }
}
