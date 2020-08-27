package games.skweekychair.basictpa;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandTphere implements CommandExecutor {
	
	TeleportQueue tpQueue = TeleportQueue.INSTANCE;
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player = (Player) sender;
        	Player receiver = Bukkit.getPlayerExact(args[0]);
        	tpQueue.TELEPORT_REQUESTS.put(receiver, new TeleportRequest(player, true));
        	receiver.sendMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.GOLD + " has requested you teleport to them! use /tpaccept to accept!");
        	return true;
        }
        return false;
    }
}
