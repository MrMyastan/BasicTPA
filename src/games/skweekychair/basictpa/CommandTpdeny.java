package games.skweekychair.basictpa;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTpdeny implements CommandExecutor {
    
	TeleportQueue tpQueue = TeleportQueue.INSTANCE;
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player = (Player) sender;
        	tpQueue.TELEPORT_REQUESTS.remove(player);
        	return true;
        }
        
    	return false;
    }
}
