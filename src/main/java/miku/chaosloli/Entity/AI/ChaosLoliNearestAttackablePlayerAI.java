package miku.chaosloli.Entity.AI;

import miku.utils.Have_Miku;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Loader;

public class ChaosLoliNearestAttackablePlayerAI extends EntityAINearestAttackableTarget<EntityPlayer> {
    public ChaosLoliNearestAttackablePlayerAI(EntityCreature creature) {
        super(creature, EntityPlayer.class, false);
    }
    public boolean shouldExecute() {
            targetEntity = null;
            double min = Double.MAX_VALUE;
            for (EntityPlayer player : taskOwner.world.playerEntities) {
                if(Loader.isModLoaded("miku")){
                    if(!Have_Miku.invHaveMiku(player)){
                        double d = player.getDistanceSq(taskOwner);
                        if (d < min && d < getTargetDistance()) {
                            min = d;
                            targetEntity = player;
                        }
                    }
                } else {
                    double d = player.getDistanceSq(taskOwner);
                    if (d < min && d < getTargetDistance()) {
                        min = d;
                        targetEntity = player;
                    }
                }
            }
            return targetEntity != null;
    }
}
