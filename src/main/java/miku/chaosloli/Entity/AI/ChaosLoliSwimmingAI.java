package miku.chaosloli.Entity.AI;

import miku.chaosloli.Entity.ChaosLoli;
import net.minecraft.entity.ai.EntityAISwimming;

public class ChaosLoliSwimmingAI extends EntityAISwimming {
    private final ChaosLoli loli;

    public ChaosLoliSwimmingAI(ChaosLoli loli){
        super(loli);
        this.loli=loli;
    }

    public boolean shouldContinueExecuting() {
        return this.shouldExecute();
    }

    @Override
    public void updateTask() {
        if (loli.getNavigator().noPath() && loli.getAttackTarget() == null) {
            super.updateTask();
        }
    }

    @Override
    public void startExecuting() {
    }


}
