package mod.HellCoder.Things.Items;

import mod.HellCoder.Things.Items.tools.DevTool;
import mod.HellCoder.Things.Items.tools.Nagibator;
import mod.HellCoder.Things.Items.tools.Scythe;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {

    public static Item diga;
    public static Item digaingot;
    public static Item NagibatorSword;
    public static Item HCHelmet;
    public static Item HCChest;
    public static Item HCLegs;
    public static Item HCBoots;
    public static Item IronGear;
    public static Item GoldGear;
    public static Item IronRedstoneGear;
    public static Item GoldRedstoneGear;
    public static Item CoolantBlock;
    public static Item HighTemperaturePlate;
    public static Item Insulator;
    public static Item MeltingForm;
    public static Item Press;
    public static Item Rollers;
    public static Item scythe;
    public static Item ironPlate;
    public static Item smallIronPlate;
    public static Item compressedPlants;
    public static Item smallTank;
    public static Item scytheBlade;
    public static Item scissors;
    public static Item termalDispenser;
    public static Item pressureRegulator;
    public static Item pressureTank;
    public static Item rawOrganicMaterial;
    public static Item copperIgnot;
    public static Item devTool;
   // public static Item Hammer;

    public static void loadItems() {

        //items
        diga = new HCItem("diga");
        digaingot = new HCItem("digaingot");
        IronGear = new HCItem("IronGear");
        GoldGear = new HCItem("GoldGear");
        IronRedstoneGear = new HCItem("IronRedstoneGear");
        GoldRedstoneGear = new HCItem("GoldRedstoneGear");
        CoolantBlock = new HCItem("CoolantBlock");
        HighTemperaturePlate = new HCItem("HighTemperaturePlate");
        MeltingForm = new HCItem("MeltingForm");
        Press = new HCItem("Press");
        Rollers = new HCItem("Rollers");
        Insulator = new HCItem("Insulator");
        ironPlate = new HCItem("IronPlate");
        smallIronPlate = new HCItem("SmallIronPlate");
        compressedPlants = new HCItem("CompressedPlants");
        smallTank = new HCItem("SmallTank");
        scytheBlade = new HCItem("ScytheBlade");
        scissors = new HCItem("Scissors");
        termalDispenser = new HCItem("TermalDispenser");
        pressureRegulator = new HCItem("PressureRegulator");
        pressureTank = new HCItem("PressureTank");
        rawOrganicMaterial = new HCItem("Raw_Organic_Material");
        copperIgnot = new HCItem("ingotCopper");
        devTool = new DevTool("DevTool");

        //armor
        HCHelmet = new HCArmor( 0, 0, "HCHelmet");
        HCChest = new HCArmor(0, 1, "HCChest");
        HCLegs = new HCArmor(0, 2, "HCLegs");
        HCBoots = new HCArmor(0, 3, "HCBoots");

        //tools
        scythe = new Scythe("scythe");
        NagibatorSword = new Nagibator("Nagibator");

        //ore dict
        OreDictionary.registerOre("gearIron", IronGear);
        OreDictionary.registerOre("gearGold", GoldGear);
        OreDictionary.registerOre("plateIron", smallIronPlate);
        OreDictionary.registerOre("ingotCopper", copperIgnot);

        /**
         * register only for special items
         * because method registerItem is located
         * in item classes
         */
    }
}
