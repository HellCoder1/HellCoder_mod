package mod.HellCoder.Things.Items.tools;

import mod.HellCoder.HellCoder_mod;
import mod.HellCoder.Utility.RegisterHelper;
import mod.HellCoder.Things.Materials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Nagibator extends ItemSword {

    public float attackDamage;
    public ToolMaterial toolMaterial = Materials.DIGA_TOOL_MATERIAL;

    public Nagibator(String name) {
        super(Materials.DIGA_TOOL_MATERIAL);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellCoder_mod.tabsHC);
        this.maxStackSize = 1;
        this.setMaxDamage(toolMaterial.getMaxUses());
        this.attackDamage = 4.0F + toolMaterial.getDamageVsEntity();
        RegisterHelper.registerItem(this);
    }

    @Override
    public float getDamageVsEntity() {
        return this.toolMaterial.getDamageVsEntity();
    }

    public float getStrVsBlock(ItemStack stack, Block block) {
        if (block == Blocks.web)
        {
            return 15.0F;
        }
        else
        {
            Material material = block.getMaterial();
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
        }
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn) {
        if ((double)blockIn.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(1, playerIn);
        }

        return true;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.BLOCK;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        playerIn.addChatComponentMessage(new ChatComponentText("Attack damage:" + String.valueOf(attackDamage) + " Uses:" + (toolMaterial.getMaxUses() - itemStackIn.getItemDamage())));
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(Block blockIn) {
        return blockIn == Blocks.web;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }

    /**
     * Return whether this item is repairable in an anvil.
     *
     * @param toRepair The ItemStack to be repaired
     * @param repair The ItemStack that should repair this Item (leather for leather armor, etc.)
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null) {
            return true;
        } else {
            return false;
        }
        //return super.getIsRepairable(toRepair, repair);
    }
}
