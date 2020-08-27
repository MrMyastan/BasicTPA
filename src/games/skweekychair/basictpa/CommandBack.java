package games.skweekychair.basictpa;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandBack implements CommandExecutor{

	TeleportQueue tpQueue = TeleportQueue.INSTANCE;
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player = (Player) sender;
        	Location previousLocation = tpQueue.PREVIOUS_LOCATIONS.get(player);
    		player.teleport(previousLocation);
        	return true;
        }
        
    	return false;
    }
}
