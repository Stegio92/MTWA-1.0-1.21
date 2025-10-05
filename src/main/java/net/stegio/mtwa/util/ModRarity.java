package net.stegio.mtwa.util;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class ModRarity {
    private final String name;
    private final Formatting formatting;

    public ModRarity(String name, Formatting formatting) {
        this.name = name;
        this.formatting = formatting;
    }
    public Text formatName(Text baseName) {
        return baseName.copy().styled(style -> style.withColor(formatting));
    }
    public String getName() {
        return name;
    }
    public Formatting getFormatting(){
        return formatting;
    }
    public static final ModRarity LEGENDARY = new ModRarity("legendary", Formatting.DARK_PURPLE);
    public static final ModRarity MYTHIC = new ModRarity("mythic", Formatting.DARK_RED);
    public static final ModRarity DIVINE = new ModRarity("divine", Formatting.GOLD);
}
