package mod.HellCoder.Things.Blocks;

import net.minecraft.block.material.Material;

public class BlockDiga extends HCBlock {

    public BlockDiga(Material material, String name) {
        super(material, name);
        this.setResistance(3F);
        this.setHardness(4F);
    }
}
