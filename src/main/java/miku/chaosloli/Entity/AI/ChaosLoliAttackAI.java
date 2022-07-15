package miku.chaosloli.Entity.AI;

import com.anotherstar.common.config.ConfigLoader;
import com.anotherstar.util.LoliPickaxeUtil;
import miku.utils.Have_Miku;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.Loader;

public class ChaosLoliAttackAI extends EntityAIAttackMelee {
    public ChaosLoliAttackAI(EntityCreature entity){
        super(entity, 1.0, false);
    }

    @Override
    public boolean shouldExecute() {
        EntityLivingBase target = attacker.getAttackTarget();
        if (target == null) {
            return false;
        }
        if(Loader.isModLoaded("miku")){
            if(Have_Miku.invHaveMiku(target))return false;
        }
        attacker.dismountRidingEntity();
        attacker.setLocationAndAngles(target.posX, target.posY, target.posZ, target.rotationYaw, target.rotationPitch);
        return true;
    }

    @Override
    public boolean shouldContinueExecuting() {
        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
        if(Loader.isModLoaded("miku")){
            if(Have_Miku.invHaveMiku(entitylivingbase))return false;
        }
        return entitylivingbase != null;
    }

    @Override
    public void resetTask() {
        EntityLivingBase entity = this.attacker.getAttackTarget();
        if (Loader.isModLoaded("miku")) {
            if(Have_Miku.invHaveMiku(entity))this.attacker.setAttackTarget(null);
        }
        this.attacker.getNavigator().clearPath();
    }

    @Override
    protected void checkAndPerformAttack(EntityLivingBase entity, double distance) {
        double d = this.getAttackReachSqr(entity);
        if (distance <= d && this.attackTick <= 0) {
            this.attackTick = 5;
            this.attacker.swingArm(EnumHand.MAIN_HAND);
            this.attacker.attackEntityAsMob(entity);
        }
    }
}
