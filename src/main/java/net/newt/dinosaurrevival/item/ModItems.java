package net.newt.dinosaurrevival.item;

import net.newt.dinosaurrevival.DinosaurRevival;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DinosaurRevival.MOD_ID);

    public static final RegistryObject<Item> TRIASSIC_FOSSIL = ITEMS.register("triassic_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JURASSIC_FOSSIL = ITEMS.register("jurassic_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRETACEOUS_FOSSIL = ITEMS.register("cretaceous_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HORSETAIL_SEEDS = ITEMS.register("horsetail_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FAN = ITEMS.register("fan",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOTHERBOARD = ITEMS.register("motherboard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIRES = ITEMS.register("wires",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SMALL_MEAT = ITEMS.register("small_meat",
            () -> new Item(new Item.Properties().food(ModFoods.SMALL_MEAT)));

    public static final RegistryObject<Item> MEDIUM_MEAT = ITEMS.register("medium_meat",
            () -> new Item(new Item.Properties().food(ModFoods.MEDIUM_MEAT)));

    public static final RegistryObject<Item> LARGE_MEAT = ITEMS.register("large_meat",
            () -> new Item(new Item.Properties().food(ModFoods.LARGE_MEAT)));

    public static final RegistryObject<Item> COOKED_SMALL_MEAT = ITEMS.register("cooked_small_meat",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_SMALL_MEAT)));

    public static final RegistryObject<Item> COOKED_MEDIUM_MEAT = ITEMS.register("cooked_medium_meat",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_MEDIUM_MEAT)));

    public static final RegistryObject<Item> COOKED_LARGE_MEAT = ITEMS.register("cooked_large_meat",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_LARGE_MEAT)));

    public static final RegistryObject<Item> THYLA_PLACENTA = ITEMS.register("thyla_placenta",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRILOBITE_SPAWN = ITEMS.register("trilobite_spawn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HYBRID_HEART = ITEMS.register("hybrid_heart",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLACENTA = ITEMS.register("placenta",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUNKY_PLACENTA = ITEMS.register("dunky_placenta",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRUBS = ITEMS.register("grubs",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRILOBITE_HUSK = ITEMS.register("trilobite_husk",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}