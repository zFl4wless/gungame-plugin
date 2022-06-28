package de.fl4wless.gungameplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class GungamePlugin extends JavaPlugin {
    public static String PREFIX = "§9Gungame§r > ";

    private GungamePlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        log(PREFIX + " Plugin enabeled!");
    }

    @Override
    public void onDisable() {
        log(PREFIX + " Plugin disabled");
    }

    public GungamePlugin getInstance() {
        return instance;
    }

    public void log(String message) {
        Bukkit.getConsoleSender().sendMessage(message);
    }

    private void registerCommands() {

    }

    private void registerListeners() {
        PluginManager pluginManager = Bukkit.getPluginManager();

    }
}
