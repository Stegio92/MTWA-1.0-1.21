package net.stegio.mtwa.stat;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.StatType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.minecraft.stat.Stats.CUSTOM;

public class ModStats {

    public static final Identifier INTERACT_WITH_SUN_FURNACE = register("interact_with_sun_furnace", StatFormatter.DEFAULT);

    private static Identifier register(String id, StatFormatter formatter) {
        Identifier identifier = Identifier.ofVanilla(id);
        Registry.register(Registries.CUSTOM_STAT, id, identifier);
        CUSTOM.getOrCreateStat(identifier, formatter);
        return identifier;
    }

    private static <T> StatType<T> registerType(String id, Registry<T> registry) {
        Text text = Text.translatable("stat_type.minecraft." + id);
        return Registry.register(Registries.STAT_TYPE, id, new StatType<>(registry, text));
    }
}

