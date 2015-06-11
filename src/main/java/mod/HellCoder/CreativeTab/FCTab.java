package mod.HellCoder.CreativeTab;

import mod.HellCoder.Things.Items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FCTab extends CreativeTabs {

    public FCTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.digaingot;
    }
}
