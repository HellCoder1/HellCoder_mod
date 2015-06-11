package mod.HellCoder.Things.Items.tools;

import mod.HellCoder.Things.Items.HCItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class DevTool extends HCItem {

    public DevTool(String name) {
        super(name);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);

            tooltip.add("This tool only for Developer!");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {

        playerIn.addChatComponentMessage(new net.minecraft.util.ChatComponentText("Total Blocks: " + mod.HellCoder.Utility.RegisterHelper.things[0].size()));
        playerIn.addChatComponentMessage(new net.minecraft.util.ChatComponentText("Total Items: " + mod.HellCoder.Utility.RegisterHelper.things[1].size()));
        playerIn.addChatComponentMessage(new net.minecraft.util.ChatComponentText("Total Recipes: " + mod.HellCoder.Utility.RegisterHelper.things[2].size()));
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }
}
