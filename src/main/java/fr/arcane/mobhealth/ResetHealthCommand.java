package fr.arcane.mobhealth;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ResetHealthCommand implements CommandExecutor {

    public ResetHealthCommand(MobHealth mobHealth) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args[0].isEmpty()) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes( '&' , "&4[MobHealth] Missing arguments"));
        } else {
            Player target = Bukkit.getPlayer(args[0]);

            if (target != null) {
                target.setMaxHealth(20D);
                target.setHealth(20D);
                sender.sendMessage(ChatColor.translateAlternateColorCodes( '&' , "&a[MobHealth] Reset"));
                target.sendMessage(ChatColor.translateAlternateColorCodes( '&' , "&a[MobHealth] Your health has been reset"));
            }
        }


        return false;
    }
}
