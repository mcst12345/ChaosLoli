package miku.chaosloli;

import com.anotherstar.client.model.ModelLoli;
import miku.chaosloli.Entity.ChaosLoli;
import miku.chaosloli.Render.RenderChaosLoli;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Loader {
    @SubscribeEvent
    public void registerEntity(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().register(EntityEntryBuilder.create().entity(ChaosLoli.class).id(new ResourceLocation("chaosloli", "loli"), 219).name("ChaosLoli").tracker(800, 3, false).build());
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModel(ModelRegistryEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ChaosLoli.class, manager -> new RenderChaosLoli(manager, new ModelLoli(), 0.0f));
    }
}
