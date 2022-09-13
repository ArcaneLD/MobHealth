package fr.arcane.mobhealth;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobHealthEvent implements Listener {

    @EventHandler
    @SuppressWarnings("deprecated")
    public void EntityKillEvent(EntityDeathEvent event) {
        if (event.getEntity().getKiller().getType() == EntityType.PLAYER) {
            LivingEntity dead = event.getEntity();
            Player killer = dead.getKiller();

            killer.setMaxHealth(dead.getMaxHealth());
            killer.setHealth(dead.getMaxHealth());

            killer.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[MobHealth] Your now have " + dead.getMaxHealth() / 2 + " heart"));
        }
        }
}
