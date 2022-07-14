package miku.chaosloli.Entity;

import com.anotherstar.common.entity.IEntityLoli;
import com.chaoswither.entity.EntityChaosWither;
import miku.chaosloli.Util.Killer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ChaosLoli extends EntityChaosWither implements IEntityLoli {
    @Override
    public void setDispersal(boolean var1){}
    public ChaosLoli(World worldIn) {
        super(worldIn);
        this.isDead=false;
        this.isDead1=false;
        this.setHealth(Float.MAX_VALUE);
        this.setSize(0,0);
        this.isImmuneToFire=true;
        this.noClip=false;
        this.experienceValue=Integer.MAX_VALUE;
    }
    @Override
    protected void applyEntityAttributes() {
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.LUCK).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(Double.MAX_VALUE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
    }

    @Override
    public boolean isDispersal() {
        return false;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
        Killer.Kill(target);
        Killer.RangeKill(target, (int) distanceFactor);
    }

    @Override
    public void setSwingingArms(boolean swingingArms) {}

    @Override
    public void setHealth(float health) {}

    @Override
    public void setDead() {}

    @Override
    public void onLivingUpdate() {}

    @Override
    public void updateAITasks() {}

    @Override
    public void onDeath(DamageSource p_70645_1_) {}


}
