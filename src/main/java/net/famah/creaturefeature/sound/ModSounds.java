package net.famah.creaturefeature.sound;

import net.famah.creaturefeature.CreatureFeature;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreatureFeature.MOD_ID);



    public static final RegistryObject<SoundEvent> RADIO_VIDEO = registerSoundEvents("radio_video");
    public static final RegistryObject<SoundEvent> THC = registerSoundEvents("thc");




     public static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(CreatureFeature.MOD_ID, name)));
     }
     public static void register(IEventBus eventBus) {SOUND_EVENTS.register(eventBus);}
}
