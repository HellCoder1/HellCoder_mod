package mod.HellCoder.Things.Items;

import mod.HellCoder.HellCoder_mod;
import mod.HellCoder.Utility.RegisterHelper;
import mod.HellCoder.Things.Materials;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HCArmor extends ItemArmor {

    public HCArmor(int type, int render, String name)
    {
        super(Materials.DIGA_ARMOR_MATERIAL, type, render);
        this.setCreativeTab(HellCoder_mod.tabsHC);
        this.setUnlocalizedName(name);
        RegisterHelper.registerItem(this);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.HCHelmet || stack.getItem() == ModItems.HCChest || stack.getItem() == ModItems.HCBoots)
        {
            return "hc:textures/armor/fc_armor_layer_1.png";
        }
        if(stack.getItem() == ModItems.HCLegs)
        {
            return "hc:textures/armor/fc_armor_layer_2.png";
        }
        else return null;
    }
}
