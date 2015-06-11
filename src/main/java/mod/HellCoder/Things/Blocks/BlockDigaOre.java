package mod.HellCoder.Things.Blocks;

import mod.HellCoder.HellCoder_mod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDigaOre extends HCBlock {

    public BlockDigaOre(Material material, String name) {
        super(material, name);
        this.setCreativeTab(HellCoder_mod.tabsHC);
        this.setStepSound(Block.soundTypeMetal);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        return MathHelper.getRandomIntegerInRange(rand, 3, 8);
    }
}
