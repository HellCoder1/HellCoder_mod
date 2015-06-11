package mod.HellCoder.Utility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class RegisterHelper {

    public static ArrayList[] things = {new ArrayList(), new ArrayList(), new ArrayList()};

    //Register block and texture
    public static void registerBlock(Block block) {
        String name = block.getUnlocalizedName().substring(5);
        GameRegistry.registerBlock(block, name);
        ModelHelper.registerBlock(block, name);
        things[0].add(name);
    }

    //register item and texture
    public static void registerItem(Item item) {
        String name = item.getUnlocalizedName().substring(5);
        GameRegistry.registerItem(item, name);
        ModelHelper.registerItem(item, name);
        things[1].add(name);
    }

    //regiter recipes
    public static void addRecipe (ItemStack out, Object[] params) {
        int i = 0; i++; things[2].add(i);
        GameRegistry.addRecipe(out, params);
    }

}
