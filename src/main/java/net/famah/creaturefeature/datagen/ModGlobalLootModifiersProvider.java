package net.famah.creaturefeature.datagen;

import net.famah.creaturefeature.CreatureFeature;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, CreatureFeature.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
