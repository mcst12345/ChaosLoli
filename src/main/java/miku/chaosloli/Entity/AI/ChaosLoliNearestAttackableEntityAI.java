package miku.chaosloli.Entity.AI;

import com.anotherstar.common.config.ConfigLoader;
import com.anotherstar.common.entity.EntityLoli;
import miku.Entity.Hatsune_Miku;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraftforge.fml.common.Loader;

import java.util.Collections;
import java.util.List;

public class ChaosLoliNearestAttackableEntityAI extends EntityAINearestAttackableTarget<EntityLivingBase> {
    public ChaosLoliNearestAttackableEntityAI(EntityCreature creature) {
        super(creature, EntityLivingBase.class, false);
    }
    public boolean shouldExecute() {
            List<EntityLivingBase> list = taskOwner.world.getEntitiesWithinAABB(this.targetClass, getTargetableArea(getTargetDistance()), targetEntitySelector);
            if(Loader.isModLoaded("miku")){
                list.removeIf(entity -> entity instanceof Hatsune_Miku);
            }
            if (list.isEmpty()) {
                return false;
            } else {
                list.sort(this.sorter);
                targetEntity = list.get(0);
                return true;
            }
    }
}
