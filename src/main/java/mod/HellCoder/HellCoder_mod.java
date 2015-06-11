package mod.HellCoder;

import mod.HellCoder.Localization.LocalizationHandler;
import mod.HellCoder.Things.Machines.RollingMachine.GuiHandlerRM;
import mod.HellCoder.Things.Machines.RollingMachine.TileRM;
import mod.HellCoder.Utility.GuiHandlerHC;
import mod.HellCoder.Utility.LogHelper;
import mod.HellCoder.Utility.Reference;
import mod.HellCoder.CreativeTab.FCTab;
import mod.HellCoder.Things.Blocks.ModBlocks;
import mod.HellCoder.Things.Items.ModItems;
import mod.HellCoder.Things.Recipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.Mod_id, name = Reference.Modname, version = Reference.Version, acceptedMinecraftVersions = Reference.MinecraftVersion)
public class HellCoder_mod {

	@Mod.Instance(value = Reference.Mod_id)
	public static HellCoder_mod instance;

	@SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.CommonProxy)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsHC = new FCTab(CreativeTabs.getNextID(), Reference.Modname);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LogHelper.info("Starting...");

		//Lang
		LogHelper.info("Load languages");
		LocalizationHandler.loadLanguages();
		LogHelper.info("Languages loaded");
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {

		//Blocks & items
		LogHelper.info("Load blocks");
		ModBlocks.loadBlocks();
		LogHelper.info("Load items");
		ModItems.loadItems();
		LogHelper.info("Load recipes");
		Recipes.loadRecipes();
		LogHelper.info("Loaded!");

		//worldgen
		
		//recipes

		// tile Entity register
		GameRegistry.registerTileEntity(TileRM.class, "HCRM");

		// GuiHandler
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandlerHC());
		//GuiHandlerHC.getInstance().registerGuiHandler(new GuiHandlerRM(), GuiHandlerRM.getGuiID());

        //proxy
		//proxy.RegisterTickHandler();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}