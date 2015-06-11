package mod.HellCoder.Things.Items.tools;

import mod.HellCoder.Utility.LogHelper;
import mod.HellCoder.Things.Items.HCItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Scythe extends HCItem {

    protected ToolMaterial toolMaterial = ToolMaterial.EMERALD;

    public Scythe(String name) {
        super(name);
        this.maxStackSize = 1;
        this.setMaxDamage(toolMaterial.getMaxUses());
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, BlockPos pos, EntityLivingBase player)
    {
        int radius = 3;
        //int height = 4;

        if (block != null)
        {
            if (block.isLeaves(world, pos))
            {
                LogHelper.info("1");
                trimLeaves(itemstack, player, world, pos, radius);
                return false;
            }
            else
            {
                trimCutCorner(itemstack, player, world, pos, radius);

                if (world.rand.nextInt(3) == 0)
                {
                    trim(world, pos, radius - 1);
                    return true;
                }
            }
        }

        return false;
    }

    public void trim(World world, BlockPos pos, int radius)
    {

        for (int aX = -radius; aX <= radius; aX++)
        {
            for (int aY = 0; aY <= radius; aY++)
            {
                for (int aZ = -radius; aZ <= radius; aZ++)
                {
                    BlockPos posi = new BlockPos(pos.getX() + aX, pos.getY() + aY, pos.getZ() + aZ);

                    Block block = world.getBlockState(posi).getBlock();
                    IBlockState meta = world.getBlockState(posi);

                    if (block != null && block != Blocks.air)
                    {
                        if (block == Blocks.tallgrass)
                        {
                            block.dropBlockAsItem(world,posi, meta, 0);
                        }
                        else if (block != Blocks.waterlily && block instanceof BlockFlower)
                        {
                            block.dropBlockAsItem(world, posi, meta, 0);
                            world.setBlockToAir(posi);
                        }
                    }
                }
            }
        }
    }

    public void trimLeaves(ItemStack stack, EntityLivingBase entity, World world, BlockPos pos, int radius)
    {
        for (int aX = -radius; aX <= radius; aX++)
        {
            for (int aY = -radius; aY <= radius; aY++)
            {
                for (int aZ = -radius; aZ <= radius; aZ++)
                {
                    BlockPos posi = new BlockPos(pos.getX() + aX, pos.getY() + aY, pos.getZ() + aZ);

                    Block block = world.getBlockState(posi).getBlock();
                    IBlockState state = world.getBlockState(posi);

                    if (block != null)
                    {
                        if (block.isLeaves(world, posi))
                        {
                            block.dropBlockAsItem(world, posi, state, 0);
                            //TODO: For Advanced Scythe
                            EntityItem entityItem = new EntityItem(world, posi.getX(), posi.getY(), posi.getZ(), new ItemStack(block));
                            entityItem.setDefaultPickupDelay();
                            entity.worldObj.spawnEntityInWorld(entityItem);
                            stack.damageItem(1, entity);
                            world.setBlockToAir(posi);
                        }
                    }
                }
            }
        }
    }

    public void trimCutCorner(ItemStack stack, EntityLivingBase entity, World world, BlockPos pos, int radius)
    {
        for (int aX = -radius; aX <= radius; aX++)
        {
            for (int aY = 0; aY <= radius; aY++)
            {
                for (int aZ = -radius; aZ <= radius; aZ++)
                {
                    if ((aX + aZ < radius * 2) && (-aX + aZ < radius * 2) && (aX + -aZ < radius * 2) && (-aX + -aZ < radius * 2))
                    {
                        BlockPos posi = new BlockPos(pos.getX() + aX, pos.getY() + aY, pos.getZ() + aZ);

                        Block block = world.getBlockState(posi).getBlock();
                        IBlockState meta = world.getBlockState(posi);

                        if (block != null && block != Blocks.air)
                        {
                            if (world.rand.nextInt(37) == 0)
                            {
                                stack.damageItem(1, entity);
                            }

                            if (block == Blocks.tallgrass)
                            {
                                block.dropBlockAsItem(world, posi, meta, 0);
                                world.setBlockToAir(posi);

                            } else if (block != Blocks.waterlily && block instanceof BlockFlower)
                            {
                                block.dropBlockAsItem(world, posi, meta, 0);
                                world.setBlockToAir(posi);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public float getStrVsBlock(ItemStack item, Block block)
    {
        return Items.shears.getStrVsBlock(item, block);
    }

    @Override
    public int getItemEnchantability()
    {
        return this.toolMaterial.getEnchantability();
    }

    @Override
    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack itemToRepairWith)
    {
        return false;
    }

    @Override
    public boolean isFull3D()
    {
        return true;
    }
}
