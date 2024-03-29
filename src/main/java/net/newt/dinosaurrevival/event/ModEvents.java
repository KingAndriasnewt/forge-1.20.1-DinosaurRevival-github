package net.newt.dinosaurrevival.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.newt.dinosaurrevival.DinosaurRevival;
import net.newt.dinosaurrevival.entity.ModEntities;
import net.newt.dinosaurrevival.entity.custom.PsitacosaurusEntity;

@Mod.EventBusSubscriber(modid = DinosaurRevival.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PSITACOSAURUS.get(), PsitacosaurusEntity.setAttributes());
    }

}
