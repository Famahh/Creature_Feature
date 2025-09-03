package net.famah.creaturefeature.datagen;

import net.famah.creaturefeature.CreatureFeature;
import net.famah.creaturefeature.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CompletableFuture.completedFuture(null), CreatureFeature.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.THC_MUSIC_DISC.get())
                .add(ModItems.RADIO_VIDEO_MUSIC_DISC.get());



        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.THC_MUSIC_DISC.get())
                .add(ModItems.RADIO_VIDEO_MUSIC_DISC.get());
    }
}
