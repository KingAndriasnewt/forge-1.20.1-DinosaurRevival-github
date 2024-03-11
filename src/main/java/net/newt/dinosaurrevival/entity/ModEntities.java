package net.newt.dinosaurrevival.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.newt.dinosaurrevival.DinosaurRevival;
import net.newt.dinosaurrevival.entity.custom.PsitacosaurusEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DinosaurRevival.MOD_ID);

    public static final RegistryObject<EntityType<PsitacosaurusEntity>> PSITACOSAURUS =
            ENTITY_TYPES.register("psitacosaurus",
                    () -> EntityType.Builder.of(PsitacosaurusEntity::new, MobCategory.CREATURE)
                            .sized(0.7f,0.7f)
                            .build(new ResourceLocation(DinosaurRevival.MOD_ID, "psitacosaurus").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
