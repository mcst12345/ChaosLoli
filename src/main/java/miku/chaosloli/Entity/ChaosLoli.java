package miku.chaosloli.Entity;

import com.anotherstar.common.entity.IEntityLoli;
import com.chaoswither.entity.EntityChaosWither;
import miku.chaosloli.Util.Killer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    public void KilledByMiku() {
        this.isDead=true;
        this.isDead1=true;
    }

    @Override
    public void onKillCommand(){}

    @Override
    protected void setSize(float width, float height){}

    @Override
    public void setPosition(double x, double y, double z){}

    @Override
    public void onEntityUpdate()
    {
        this.world.profiler.startSection("entityBaseTick");

    }

    @Override
    public void dismountRidingEntity()
    {
        if (this.getRidingEntity() != null)
        {
            Entity entity = this.getRidingEntity();
            Killer.Kill(entity);
        }
    }

    @Override
    protected void addPassenger(Entity passenger) {}

    @Override
    protected void removePassenger(Entity passenger) {Killer.Kill(passenger);}

    @Override
    protected boolean canFitPassenger(Entity passenger){return false;}

    @Override
    public float getCollisionBorderSize()
    {
        return 100.0F;
    }

    @Override
    public void setPortal(BlockPos pos){}

    @Override
    public int getPortalCooldown()
    {
        return Integer.MAX_VALUE;
    }

    @Override
    public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack) {}

    @Override
    public boolean isBurning() {return false;}

    @Override
    public boolean isRiding(){return false;}

    @Override
    public boolean isBeingRidden(){return false;}

    @Override
    public boolean isSneaking(){return false;}

    @Override
    public void setSneaking(boolean sneaking){}

    @Override
    public boolean isSprinting(){return true;}

    @Override
    public void setSprinting(boolean sprinting){}

    @Override
    public boolean isGlowing(){return true;}

    @Override
    public void setGlowing(boolean glowingIn){}

    @Override
    public boolean isInvisible(){return false;}

    @SideOnly(Side.CLIENT)
    public boolean isInvisibleToPlayer(EntityPlayer player) {return false;}

    @Override
    public void setInvisible(boolean invisible){}

    @Override
    public void setAir(int air){}

    @Override
    public int getAir(){return Integer.MAX_VALUE;}

    @Override
    protected void setFlag(int flag, boolean set){}

    @Override
    public void onStruckByLightning(EntityLightningBolt lightningBolt) {}

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn)
    {
        Killer.Kill(entityLivingIn);
    }

    @Override
    public void setInWeb() {}

    @Override
    public String getName() {return "";}

    @Override
    public boolean isEntityEqual(Entity entityIn){return false;}

    @Override
    public boolean canBeAttackedWithItem(){return false;}

    @Override
    public boolean hitByEntity(Entity entityIn)
    {
        Killer.Kill(entityIn); return false;
    }

    @Override
    public String toString() {return "";}

    @Override
    public boolean isEntityInvulnerable(DamageSource source) {return true;}

    @Override
    public boolean getIsInvulnerable(){return true;}

    @Override
    public void setEntityInvulnerable(boolean isInvulnerable){}

    @Override
    public boolean isNonBoss(){return false;}

    @Override
    public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn) {return Float.MAX_VALUE;}

    public boolean canExplosionDestroyBlock(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn, float p_174816_5_) {return true;}

    @Override
    public void addEntityCrashInfo(CrashReportCategory category) {}

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canRenderOnFire(){return false;}

    @Override
    public boolean isPushedByWater(){return false;}

    @Override
    public void setCustomNameTag(String name){}




}
