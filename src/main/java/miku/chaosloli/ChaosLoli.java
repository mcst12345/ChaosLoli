package miku.chaosloli;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = ChaosLoli.MOD_ID,
        name = ChaosLoli.MOD_NAME,
        version = ChaosLoli.VERSION
)
public class ChaosLoli {
    public static final String MOD_ID = "ChaosLoli";
    public static final String MOD_NAME = "ChaosLoli";
    public static final String VERSION = "1.0-pre1";
    @Mod.Instance(MOD_ID)
    public static ChaosLoli INSTANCE;
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
