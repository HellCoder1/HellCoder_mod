package mod.HellCoder.Utility;

import mod.HellCoder.Things.Machines.RollingMachine.ContainerRM;
import mod.HellCoder.Things.Machines.RollingMachine.GuiRM;
import mod.HellCoder.Things.Machines.RollingMachine.TileRM;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerHC implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x,y,z);
        TileEntity tile_entity = world.getTileEntity(pos);
        switch(id)
        {
            //case 0: return new ContainerFermenter(player.inventory, (TileEntityFermenter) tile_entity);
            case 0: return new ContainerRM(player.inventory, (TileRM) tile_entity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x,y,z);
        TileEntity tile_entity = world.getTileEntity(pos);
        switch(id)
        {
            //case 0: return new GuiFermenter(player.inventory, (TileEntityFermenter) tile_entity);
            case 0: return new GuiRM(player.inventoryContainer);
        }
        return null;
    }
}
