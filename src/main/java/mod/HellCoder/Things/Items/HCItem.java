package mod.HellCoder.Things.Items;

import mod.HellCoder.HellCoder_mod;
import mod.HellCoder.Utility.RegisterHelper;
import net.minecraft.item.Item;

public class HCItem extends Item {

    public HCItem(String name) {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellCoder_mod.tabsHC);
        RegisterHelper.registerItem(this);
    }


}
