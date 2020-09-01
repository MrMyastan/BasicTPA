package games.skweekychair.basictpa;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandTpdeny implements CommandExecutor {
    
	TeleportQueue tpQueue = TeleportQueue.INSTANCE;
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player = (Player) sender;
        	TeleportRequest tpRequest = tpQueue.TELEPORT_REQUESTS.get(player);
        	if (tpRequest == null) {player.sendMessage(ChatColor.GOLD + "You have no teleport request, sorry!"); return true;}
        	tpRequest.requestee.sendMessage(ChatColor.GOLD + player.getName() + " denied your request and/or doesn't love you, sorry!");
        	tpQueue.TELEPORT_REQUESTS.remove(player);
        	return true;
        }
        
    	return false;
    }
}
