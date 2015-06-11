package mod.HellCoder.Things;

import mod.HellCoder.Utility.RegisterHelper;
import mod.HellCoder.Things.Blocks.ModBlocks;
import mod.HellCoder.Things.Items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void loadRecipes() {

        /**
         * Tools
         */
         RegisterHelper.addRecipe(new ItemStack(ModItems.NagibatorSword), new Object[] {
                " Z ", "CZC", " C ",
                ('Z'), ModItems.diga,
                ('C'), Blocks.obsidian,
        });

        /**
         * Items
         */
        RegisterHelper.addRecipe(new ItemStack(ModItems.diga), new Object[] {
                "AZA", "ZBZ", "AZA",
                ('Z'), ModBlocks.digaBlock,
                ('A'), Blocks.obsidian,
                ('B'), Blocks.diamond_block
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.HCHelmet), new Object[] {
                "ZZZ", "Z Z",
                ('Z'), ModItems.diga
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.HCChest), new Object[] {
                "Z Z", "ZZZ", "ZZZ",
                ('Z'), ModItems.diga
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.HCLegs), new Object[] {
                "ZZZ", "Z Z", "Z Z",
                ('Z'), ModItems.diga
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.HCBoots), new Object[] {
                "Z Z", "Z Z",
                ('Z'), ModItems.diga
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.Rollers), new Object[] {
                " A ", "ZGZ", " A ",
                ('Z'), Items.stick,
                ('A'), Items.redstone,
                ('Z'), Blocks.stone,
                ('G'), ModItems.IronRedstoneGear
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.Press), new Object[] {
                "AAZ", "  G", "AAZ",
                ('Z'), Items.iron_ingot,
                ('G'), Blocks.piston,
                ('A'), Blocks.stone
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.rawOrganicMaterial), new Object[] {
                "ZZZ", "ZQZ", "ZZZ",
                ('Z'), ModItems.compressedPlants,
                ('Q'), Items.water_bucket
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.smallTank), new Object[] {
                " Z ", "Z Z", " Z ",
                ('Z'), Blocks.glass
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.termalDispenser), new Object[] {
                " A ", "GZG", " Z ",
                ('Z'), ModItems.copperIgnot,
                ('G'), Blocks.iron_bars,
                ('A'), Items.redstone
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.CoolantBlock), new Object[] {
                "ZZZ", "ZGZ", "ABA",
                ('Z'), Items.snowball,
                ('G'), ModItems.IronRedstoneGear,
                ('B'), Blocks.chest,
                ('A'), ModItems.smallIronPlate
        });

        /* RegisterHelper.addRecipe(new ItemStack(ModItems.pressureRegulator), new Object[] {
                " A ", "ZGZ", "BZB",
                ('A'), Blocks.lever,
                ('G'), ModItems.IronRedstoneGear,
                ('Z'), ModBlocks.HermeticPipe,
                ('B'), ModItems.smallIronPlate
                });

        RegisterHelper.addRecipe(new ItemStack(ModItems.pressureTank), new Object[] {
                " A ", "GZG", " A ",
                ('Z'), ModBlocks.HermeticPipe,
                ('G'), ModItems.smallIronPlate,
                ('A'), Blocks.glass
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.scythe), new Object[] {
                " A ", " Z ", " Z ",
                ('A'), ModItems.scytheBlade,
                ('Z'), Items.stick
        }); */

        RegisterHelper.addRecipe(new ItemStack(ModItems.GoldGear), new Object[] {
                " Z ", "Z Z", " Z ",
                ('Z'), Items.gold_ingot
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.IronGear), new Object[] {
                " Z ", "Z Z", " Z ",
                ('Z'), Items.iron_ingot
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.GoldRedstoneGear), new Object[] {
                " Z ", "ZAZ", " Z ",
                ('A'), ModItems.GoldGear,
                ('Z'), Items.redstone
        });

        RegisterHelper.addRecipe(new ItemStack(ModItems.IronRedstoneGear), new Object[] {
                " Z ", "ZAZ", " Z ",
                ('A'), ModItems.IronGear,
                ('Z'), Items.redstone
        });

        /* RegisterHelper.addRecipe(new ItemStack(ModItems.Hammer), new Object[] {
                " B ", " A ", " A ",
                ('A'), Items.stick,
        ('B'), Items.iron_ingot
        });

		RegisterHelper.addRecipe(new ItemStack(ModItems.smallIronPlate), new Object[] {
			"BA",
            ('A'), Items.iron_ingot,
            ('B'), ModItems.Hammer
        }); */

        /**
         * Blocks
         */
        RegisterHelper.addRecipe(new ItemStack(ModBlocks.digaBlock), new Object[] {
                "ZZZ", "ZZZ", "ZZZ",
                ('Z'), ModItems.digaingot,
        } );

        /* RegisterHelper.addRecipe(new ItemStack(ModBlocks.rollingmachine), new Object[] {
                "AWA", "E S", "ADA",
                ('A'), ModItems.IronRedstoneGear,
                ('W'), Items.redstone,
                ('E'), ModItems.Rollers,
                ('S'), ModItems.Press,
                ('D'), Blocks.piston
        }); */

        /**
         * Furnace
         */
        GameRegistry.addSmelting(ModBlocks.digaOre, new ItemStack(ModItems.digaingot), 0.6F);
    }

}
