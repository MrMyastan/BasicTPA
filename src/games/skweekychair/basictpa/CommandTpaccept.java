package games.skweekychair.basictpa;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandTpaccept implements CommandExecutor {
    
	// Grab singleton instance
	TeleportQueue tpQueue = TeleportQueue.INSTANCE;
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player = (Player) sender;
        	TeleportRequest tpRequest = tpQueue.TELEPORT_REQUESTS.get(player);
        	if (tpRequest == null) {player.sendMessage(ChatColor.GOLD + "You have no teleport request, sorry!"); return true;}
        	if (!tpRequest.isReversed) {
        		System.out.println("!isreversed");
        		tpQueue.PREVIOUS_LOCATIONS.put(tpRequest.requestee, tpRequest.requestee.getLocation());
        		tpRequest.requestee.teleport(player);
        		tpQueue.TELEPORT_REQUESTS.remove(player);
            	return true;
        	} else if (tpRequest.isReversed) {
        		System.out.println("normal isreversed");
        		tpQueue.PREVIOUS_LOCATIONS.put(player, player.getLocation());
        		player.teleport(tpRequest.requestee);
        		tpQueue.TELEPORT_REQUESTS.remove(player);
        		return true;
        	}
        }
    	return false;
    }
}
