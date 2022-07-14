package miku.chaosloli.Render;

import com.anotherstar.client.model.ModelLoli;
import miku.chaosloli.Entity.ChaosLoli;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChaosLoli extends RenderLiving<ChaosLoli> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("miku", "textures/entities/miku.png");

    private final ModelLoli loli = new ModelLoli();
    public RenderChaosLoli(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    @Override
    public void doRender(ChaosLoli entity, double x, double y, double z, float entityYaw, float partialTicks) {
        mainModel = loli;
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
    @Override
    protected ResourceLocation getEntityTexture(ChaosLoli entity) {
        return TEXTURE;
    }
}
