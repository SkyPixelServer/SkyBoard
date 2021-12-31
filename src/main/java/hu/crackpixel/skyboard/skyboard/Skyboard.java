package hu.crackpixel.skyboard.skyboard;

import org.bukkit.plugin.java.JavaPlugin;

public final class Skyboard extends JavaPlugin {
    private static ScoreboardRenderer renderer;
    @Override
    public void onEnable() {
        renderer = new ScoreboardRenderer();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ScoreboardRenderer getRenderer() {
        return renderer;
    }
}
