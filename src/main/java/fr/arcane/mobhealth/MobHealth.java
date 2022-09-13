package fr.arcane.mobhealth;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobHealth extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[MobHealth] Initializing...");

        getCommand("resethealth").setExecutor(new ResetHealthCommand(this));

        Bukkit.getServer().getPluginManager().registerEvents(new MobHealthEvent(), (Plugin) this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
