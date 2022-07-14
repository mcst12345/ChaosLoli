package miku.chaosloli.Entity;

import com.anotherstar.common.entity.IEntityLoli;
import com.chaoswither.entity.EntityChaosWither;
import miku.chaosloli.Util.Killer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandResultStats;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;

public class ChaosLoli extends EntityChaosWither implements IEntityLoli {
    @Override
    public void setDispersal(boolean var1) {
    }

    public ChaosLoli(World worldIn) {
        super(worldIn);
        this.isDead = false;
        this.isDead1 = false;
        this.setHealth(Float.MAX_VALUE);
        this.setSize(0, 0);
        this.isImmuneToFire = true;
        this.noClip = false;
        this.experienceValue = Integer.MAX_VALUE;
    }

    @Override
    protected void entityInit()
    {}

    @Override
    protected void initEntityAI()
    {
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
    public void setSwingingArms(boolean swingingArms) {
    }

    @Override
    public void setHealth(float health) {
    }

    @Override
    public void setDead() {
    }

    @Override
    public void onLivingUpdate() {
    }

    @Override
    public void updateAITasks() {
    }

    @Override
    public void onDeath(DamageSource p_70645_1_) {
    }

    public void KilledByMiku() {
        this.isDead = true;
        this.isDead1 = true;
    }

    @Override
    public void onKillCommand() {
    }

    @Override
    protected void setSize(float width, float height) {
    }

    @Override
    public void setPosition(double x, double y, double z) {
    }

    @Override
    public void onEntityUpdate() {
        this.world.profiler.startSection("entityBaseTick");

    }

    @Override
    public void dismountRidingEntity() {
        if (this.getRidingEntity() != null) {
            Entity entity = this.getRidingEntity();
            Killer.Kill(entity);
        }
    }

    @Override
    protected void addPassenger(Entity passenger) {
    }

    @Override
    protected void removePassenger(Entity passenger) {
        Killer.Kill(passenger);
    }

    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return false;
    }

    @Override
    public float getCollisionBorderSize() {
        return 100.0F;
    }

    @Override
    public void setPortal(BlockPos pos) {
    }

    @Override
    public int getPortalCooldown() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack) {
    }

    @Override
    public boolean isBurning() {
        return false;
    }

    @Override
    public boolean isRiding() {
        return false;
    }

    @Override
    public boolean isBeingRidden() {
        return false;
    }

    @Override
    public boolean isSneaking() {
        return false;
    }

    @Override
    public void setSneaking(boolean sneaking) {
    }

    @Override
    public boolean isSprinting() {
        return true;
    }

    @Override
    public void setSprinting(boolean sprinting) {
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public void setGlowing(boolean glowingIn) {
    }

    @Override
    public boolean isInvisible() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean isInvisibleToPlayer(EntityPlayer player) {
        return false;
    }

    @Override
    public void setInvisible(boolean invisible) {
    }

    @Override
    public void setAir(int air) {
    }

    @Override
    public int getAir() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected void setFlag(int flag, boolean set) {
    }

    @Override
    public void onStruckByLightning(EntityLightningBolt lightningBolt) {
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        Killer.Kill(entityLivingIn);
    }

    @Override
    public void setInWeb() {
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isEntityEqual(Entity entityIn) {
        return false;
    }

    @Override
    public boolean canBeAttackedWithItem() {
        return false;
    }

    @Override
    public boolean hitByEntity(Entity entityIn) {
        Killer.Kill(entityIn);
        return false;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean isEntityInvulnerable(DamageSource source) {
        return true;
    }

    @Override
    public boolean getIsInvulnerable() {
        return true;
    }

    @Override
    public void setEntityInvulnerable(boolean isInvulnerable) {
    }

    @Override
    public boolean isNonBoss() {
        return false;
    }

    @Override
    public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn) {
        return Float.MAX_VALUE;
    }

    public boolean canExplosionDestroyBlock(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn, float p_174816_5_) {
        return true;
    }

    @Override
    public void addEntityCrashInfo(CrashReportCategory category) {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canRenderOnFire() {
        return false;
    }

    @Override
    public boolean isPushedByWater() {
        return false;
    }

    @Override
    public void setCustomNameTag(String name) {
    }

    @Override
    public boolean hasCustomName() {
        return true;
    }

    @Override
    public void setAlwaysRenderNameTag(boolean alwaysRenderNameTag) {
    }

    @Override
    public boolean getAlwaysRenderNameTag() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean getAlwaysRenderNameTagForRender() {
        return true;
    }

    @Override
    public boolean isSpectatedByPlayer(EntityPlayerMP player) {
        return false;
    }

    @Override
    public boolean replaceItemInInventory(int inventorySlot, ItemStack itemStackIn) {
        return true;
    }

    @Override
    public boolean canUseCommand(int permLevel, String commandName) {
        return true;
    }

    @Override
    public Entity getCommandSenderEntity() {
        return null;
    }

    @Override
    public void setCommandStat(CommandResultStats.Type type, int amount) {
    }

    @Override
    public void setCommandStats(Entity entityIn) {
    }

    @Override
    public EnumActionResult applyPlayerInteraction(EntityPlayer player, Vec3d vec, EnumHand hand) {
        return EnumActionResult.FAIL;
    }

    @Override
    public boolean isImmuneToExplosions() {
        return true;
    }

    @Override
    public boolean isCreatureType(EnumCreatureType type, boolean forSpawnCount) {
        return false;
    }

    @Override
    public boolean canRiderInteract() {
        return false;
    }

    @Override
    public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, @Nullable net.minecraft.util.EnumFacing facing) {
        return true;
    }

    @Override
    public boolean isPassenger(Entity entityIn) {
        return false;
    }

    @Override
    protected void outOfWorld() {
        this.posY = 256;
    }

    @Override
    public boolean isEntityAlive() {
        return true;
    }

    @Override
    public void updateRidden() {
        Entity entity = this.getRidingEntity();
        Killer.Kill(entity);
    }

    @Override
    public void heal(float healAmount) {
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return false;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    protected void onDeathUpdate() {
    }

    @Override
    protected boolean canDropLoot() {
        return false;
    }

    @Override
    protected int decreaseAirSupply(int air) {
        return 0;
    }

    @Override
    protected boolean isPlayer() {
        return true;
    }

    @Override
    public void setLastAttackedEntity(Entity entityIn) {
    }

    @Override
    public int getIdleTime() {
        return 0;
    }

    @Override
    protected void playEquipSound(ItemStack stack) {
    }

    @Override
    protected void updatePotionEffects() {
    }

    @Override
    protected void updatePotionMetadata() {
    }

    @Override
    protected void resetPotionEffectMetadata() {
    }

    @Override
    public void clearActivePotions() {
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        return null;
    }

    @Override
    public Map<Potion, PotionEffect> getActivePotionMap() {
        return null;
    }

    @Override
    public boolean isPotionActive(Potion potionIn) {
        return false;
    }

    @Override
    @Nullable
    public PotionEffect getActivePotionEffect(Potion potionIn) {
        return null;
    }

    @Override
    public void addPotionEffect(PotionEffect potioneffectIn) {
    }

    @Override
    public boolean isPotionApplicable(PotionEffect potioneffectIn) {
        return false;
    }

    @Override
    public boolean isEntityUndead() {
        return true;
    }

    @Override
    @Nullable
    public PotionEffect removeActivePotionEffect(@Nullable Potion potioneffectin) {
        return null;
    }

    @Override
    public void removePotionEffect(Potion potionIn) {
    }

    @Override
    protected void onNewPotionEffect(PotionEffect id) {
    }

    @Override
    protected void onChangedPotionEffect(PotionEffect id, boolean p_70695_2_) {
    }

    @Override
    protected void onFinishedPotionEffect(PotionEffect effect) {
    }

    @Override
    @Nullable
    public DamageSource getLastDamageSource() {
        return null;
    }

    @Override
    protected void playHurtSound(DamageSource source) {
    }

    @Override
    public void renderBrokenItemStack(ItemStack stack) {}

    @Override
    protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source) {}

    @Override
    protected void dropEquipment(boolean wasRecentlyHit, int lootingModifier) {}

    @Override
    public void knockBack(Entity entityIn, float strength, double xRatio, double zRatio) {}

    @Override
    @Nullable
    protected SoundEvent getHurtSound(DamageSource damageSourceIn){return null;}

    @Override
    @Nullable
    protected SoundEvent getDeathSound() {return null;}

    @Override
    protected SoundEvent getFallSound(int heightIn) {return null;}

    @Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {}

    @Override
    public boolean isOnLadder() {return false;}

    @Override
    @SideOnly(Side.CLIENT)
    public void performHurtAnimation() {}

    @Override
    public int getTotalArmorValue() {return Integer.MAX_VALUE;}

    @Override
    protected void damageArmor(float damage) {}

    @Override
    protected void damageShield(float damage) {}

    @Override
    protected float applyArmorCalculations(DamageSource source, float damage) {return 0;}

    @Override
    protected float applyPotionDamageCalculations(DamageSource source, float damage) {return 0;}

    @Override
    protected void damageEntity(DamageSource damageSrc, float damageAmount){}

    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    @Override
    public ItemStack getHeldItemMainhand(){return ItemStack.EMPTY;}

    @Override
    public ItemStack getHeldItemOffhand(){return ItemStack.EMPTY;}

    @Override
    public ItemStack getHeldItem(EnumHand hand){return ItemStack.EMPTY;}

    @Override
    public boolean hasItemInSlot(EntityEquipmentSlot p_190630_1_){return false;}

    @Override
    public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn){return ItemStack.EMPTY;};

    @Override
    protected float getSoundVolume(){return 0.0F;}

    @Override
    protected boolean isMovementBlocked(){return false;}

    @Override
    protected float getSoundPitch() {return 0.0F;}

    @Override
    protected float getWaterSlowDown(){return -10.0F;}

    @Override
    public void setAIMoveSpeed(float speedIn){}

    @Override
    public float getAIMoveSpeed(){return Float.MAX_VALUE;}

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {Killer.Kill(entityIn); return false;}

    @Override
    public boolean isPlayerSleeping()
    {
        return false;
    }

    @Override
    public void onUpdate()
    {
        if (net.minecraftforge.common.ForgeHooks.onLivingUpdate(this)) return;
        super.onUpdate();
        this.updateActiveHand();
        this.isDead1=false;
        this.isDead=false;
    }

    @Override
    protected void collideWithNearbyEntities() {}

    @Override
    protected void collideWithEntity(Entity entityIn){Killer.Kill(entityIn);}

    @Override
    public void onItemPickup(Entity entityIn, int quantity) {Killer.Kill(entityIn);}

    @Override
    public boolean canEntityBeSeen(Entity entityIn) {return true;}

    @Override
    public boolean canBeCollidedWith(){return false;}

    @Override
    public boolean canBePushed(){return false;}

    @Override
    protected void markVelocityChanged() {}

    @Override
    public void curePotionEffects(ItemStack curativeItem) {}

    @Override
    public boolean shouldRiderFaceForward(EntityPlayer player) {return false;}

    @Override
    public boolean isElytraFlying(){return false;}

    @Override
    @SideOnly(Side.CLIENT)
    public int getTicksElytraFlying(){return 0;}

    @Override
    public boolean attemptTeleport(double x, double y, double z){return false;}

    @Override
    public boolean canBeHitWithPotion(){return false;}

    @Override
    public boolean attackable(){return false;}

    @Override
    public void playLivingSound(){}

    @Override
    public void spawnExplosionParticle() {}

    @Override
    @Nullable
    protected Item getDropItem()
    {
        if(Loader.isModLoaded("miku"))return miku.miku.Loader.MIKU;
        return null;
    }

    @Override
    protected void updateEquipmentIfNeeded(EntityItem itemEntity){}

    @Override
    protected boolean canDespawn(){return false;}

    @Override
    protected void despawnEntity(){}

    @Override
    public boolean getCanSpawnHere(){return true;}

    @Override
    public boolean isNotColliding(){return true;}

    @Override
    public int getMaxSpawnedInChunk(){return Integer.MAX_VALUE;}

    @Override
    public int getMaxFallHeight(){return Integer.MAX_VALUE;}













}
