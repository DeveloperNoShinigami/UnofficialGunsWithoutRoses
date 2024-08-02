package lykrast.gunswithoutroses.customdamagesource;

import lykrast.gunswithoutroses.entity.BulletEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;


public class IndirectEntityDamageSource extends DamageSource {

    private final Entity indirectEntity;

    public IndirectEntityDamageSource(String arrow, BulletEntity bulletEntity, Entity shooter, Entity indirectEntity) {
        super(arrow);
        this.indirectEntity = indirectEntity;
    }

   // public static DamageSource indirectEntityDamageSource(Level level, ResourceKey<DamageType> key, @Nullable Entity source, @Nullable Entity trueSource) {
   //     return new DamageSource(level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(key), source, trueSource);
    //}
    private void setEntity(Entity source) {
    }

    @Override
    public Entity getDirectEntity() {
        return this.getEntity();
    }

    public DamageSource setProjectile() {

        return null;
    }
//*    public IndirectEntityDamageSource(String arrow, BulletEntity bulletEntity, Entity shooter) {
 //       super(arrow);
   // }
}
