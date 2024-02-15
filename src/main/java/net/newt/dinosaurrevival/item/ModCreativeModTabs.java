package net.newt.dinosaurrevival.item;

import net.newt.dinosaurrevival.DinosaurRevival;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DinosaurRevival.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DINOSAUR_REVIVAL = CREATIVE_MODE_TABS.register("dinosaur_revival",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DINO_FOSSIL_CLEAN.get()))
                    .title(Component.translatable("creativetab.dinosaur_revival"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DINO_FOSSIL.get());
                        pOutput.accept(ModItems.PLANT_FOSSIL.get());
                        pOutput.accept(ModItems.DINO_FOSSIL_CLEAN.get());
                        pOutput.accept(ModItems.CLEAN_PLANT_FOSSIL.get());
                        pOutput.accept(ModItems.TRILOBITE_SPAWN.get());
                        pOutput.accept(ModItems.HYBRID_HEART.get());
                        pOutput.accept(ModItems.THYLA_PLACENTA.get());
                        pOutput.accept(ModItems.HORSETAIL_SEEDS.get());
                        pOutput.accept(ModItems.SMALL_MEAT.get());
                        pOutput.accept(ModItems.MEDIUM_MEAT.get());
                        pOutput.accept(ModItems.LARGE_MEAT.get());
                        pOutput.accept(ModItems.COOKED_SMALL_MEAT.get());
                        pOutput.accept(ModItems.COOKED_MEDIUM_MEAT.get());
                        pOutput.accept(ModItems.COOKED_LARGE_MEAT.get());




                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MACHINERY = CREATIVE_MODE_TABS.register("machinery",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FAN.get()))
                    .title(Component.translatable("creativetab.machinery"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FAN.get());
                        pOutput.accept(ModItems.MOTHERBOARD.get());
                        pOutput.accept(ModItems.WIRES.get());




                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}