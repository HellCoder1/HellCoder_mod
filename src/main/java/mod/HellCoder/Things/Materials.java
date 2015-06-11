package mod.HellCoder.Things;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {

    public static final ItemArmor.ArmorMaterial DIGA_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("DIGA", "diga", 50, new int[]{5, 10, 8, 5}, 22);
    public static final Item.ToolMaterial DIGA_TOOL_MATERIAL = EnumHelper.addToolMaterial("DIGA", 5, 3228, 60.0F, 30, 22);

}
