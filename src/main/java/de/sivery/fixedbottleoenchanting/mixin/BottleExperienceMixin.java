package de.sivery.fixedbottleoenchanting.mixin;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ExperienceBottleEntity.class)
public abstract class BottleExperienceMixin {

    @Inject(method = "onCollision", at = @At("HEAD"), cancellable = true)
    private void modifyExperienceOnCollision(CallbackInfo ci) {

        ExperienceBottleEntity bottleEntity = (ExperienceBottleEntity) (Object) this;
        if (bottleEntity.getWorld() instanceof ServerWorld serverWorld) {
            Vec3d position = bottleEntity.getPos();

            // Custom logic for experience amount
            int customExperienceAmount = 10; // todo: MathHelper.nextInt(bottleEntity.getRandom(), 10, 20);

            while (customExperienceAmount > 0) {
                int orbAmount = ExperienceOrbEntity.roundToOrbSize(customExperienceAmount);
                customExperienceAmount -= orbAmount;
                serverWorld.spawnEntity(new ExperienceOrbEntity(serverWorld, position.x, position.y, position.z, orbAmount));
            }

            bottleEntity.discard(); // Remove the bottle entity after handling the collision
            ci.cancel(); // Prevent the original method from executing
        }
    }
}