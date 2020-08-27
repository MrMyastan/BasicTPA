package games.skweekychair.basictpa;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicTpaPlugin extends JavaPlugin {
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
        // Register our commands (set an instance of your command class as executor)
        this.getCommand("tprequest").setExecutor(new CommandTpa());
        this.getCommand("tpaccept").setExecutor(new CommandTpaccept());
        this.getCommand("tpdeny").setExecutor(new CommandTpdeny());
        this.getCommand("tphere").setExecutor(new CommandTphere());
        this.getCommand("tpback").setExecutor(new CommandBack());
        this.getCommand("tpview").setExecutor(new CommandView());
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}
