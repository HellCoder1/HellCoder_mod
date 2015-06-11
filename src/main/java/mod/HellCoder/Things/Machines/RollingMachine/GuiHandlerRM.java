package mod.HellCoder.Things.Machines.RollingMachine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * This class is used to get the client and server gui elements when a player opens a gui. There can only be one registered
 *   IGuiHandler instance handler per mod.
 */
public class GuiHandlerRM implements IGuiHandler {
    private static final int Gui_ID = 1;
    public static int getGuiID() {
        return Gui_ID;
    }

    // Gets the server side element for the given gui id this should return a container
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof TileRM) {
            TileRM tile = (TileRM) tileEntity;
            return new ContainerRM(player.inventory, tile);
        }
        return null;
    }

    // Gets the client side element for the given gui id this should return a gui
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos pos = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof TileRM) {
            TileRM tile = (TileRM) tileEntity;
            return new ContainerRM(player.inventory, tile);
        }
        return null;
    }

}
