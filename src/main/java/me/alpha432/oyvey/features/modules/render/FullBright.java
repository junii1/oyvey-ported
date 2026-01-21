package me.alpha432.oyvey.features.modules.misc;

import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.features.setting.Setting;

public class FullbrightModule extends Module {

    public Setting<Float> gamma = register(new Setting<>("gamma", 1.0f, 0.0f, 10.0f));

    public FullbrightModule() {
        super("Fullbright", "Makes the game brighter", Category.MISC, true, false, false);
    }

    @Override
    public void onEnable() {
        mc.options.gamma = gamma.getValue();
    }

    @Override
    public void onDisable() {
        mc.options.gamma = 1.0f;
    }
}
