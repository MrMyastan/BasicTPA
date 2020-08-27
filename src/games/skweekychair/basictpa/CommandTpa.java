package games.skweekychair.basictpa;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandTpa implements CommandExecutor {
    // This method is called, when somebody uses our command
	
	TeleportQueue tpQueue = TeleportQueue.INSTANCE;
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player = (Player) sender;
        	Player receiver = Bukkit.getPlayerExact(args[0]);
        	tpQueue.TELEPORT_REQUESTS.put(receiver, new TeleportRequest(player, false));
        	receiver.sendMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.GOLD + " has requested to teleport to you! use /tpaccept to accept!");
        	return true;
        }
        
    	return false;
    }
}
