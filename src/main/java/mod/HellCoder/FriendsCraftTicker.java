package mod.HellCoder;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class FriendsCraftTicker
{
    private Minecraft      mcClient;
    private static boolean isRegistered = false;
    
    public FriendsCraftTicker()
    {
        mcClient = FMLClientHandler.instance().getClient();
        isRegistered = true;
    }
   /*
    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event)
    {
        boolean keepTicking = !(mcClient != null && mcClient.thePlayer != null && mcClient.theWorld != null);

    } */
}