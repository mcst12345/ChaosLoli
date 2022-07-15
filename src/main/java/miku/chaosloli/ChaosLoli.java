package miku.chaosloli;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = ChaosLoli.MOD_ID,
        name = ChaosLoli.MOD_NAME,
        version = ChaosLoli.VERSION
)
public class ChaosLoli {
    public static final String MOD_ID = "chaosloli";
    public static final String MOD_NAME = "ChaosLoli";
    public static final String VERSION = "1.0-pre1";

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Loader());
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
