package net.famah.creaturefeature.item;

import net.famah.creaturefeature.CreatureFeature;
import net.famah.creaturefeature.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatureFeature.MOD_ID);

    public static final RegistryObject<Item> RADIO_VIDEO_MUSIC_DISC = ITEMS.register("radio_video_music_disc",
            () -> new RecordItem(6, ModSounds.RADIO_VIDEO, new Item.Properties().stacksTo(1), 4980));
    public static final RegistryObject<Item> THC_MUSIC_DISC = ITEMS.register("thc_music_disc",
            () -> new RecordItem(6, ModSounds.THC, new Item.Properties().stacksTo(1), 2660));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
