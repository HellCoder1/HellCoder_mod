package mod.HellCoder.Things.Blocks;

import mod.HellCoder.Things.Machines.RollingMachine.BlockRM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block digaBlock;
    public static Block digaOre;
    public static Block copperOre;
    public static Block copperBlock;
    public static Block rollingmachine;

    public static void loadBlocks() {

        //just blocks
        digaBlock = new BlockDiga(Material.iron, "digaBlock");
        copperBlock = new CopperBlock(Material.iron, "blockCopper");

        //ore bocks
        digaOre = new BlockDigaOre(Material.iron, "digaOre");
        copperOre = new CopperOre(Material.rock, "oreCopper");

        //machines
        rollingmachine = new BlockRM(Material.iron, "RollingMachine");

        //dict
        //OreDictionary.registerOre("blockCopper",copperBlock);
        //OreDictionary.registerOre("digaBlock", digaBlock);
        //OreDictionary.registerOre("oreCopper", copperOre);

        /**
         * Register only for special blocks
         * because method registerItem is located
         * in block classes
         */
    }

}
