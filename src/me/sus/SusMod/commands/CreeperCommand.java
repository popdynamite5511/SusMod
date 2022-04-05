package me.sus.SusMod.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import me.sus.SusMod.Susmod;

public class CreeperCommand implements CommandExecutor {
	private Susmod plugin;
	
	public CreeperCommand(Susmod plugin) {
		this.plugin = plugin;
		plugin.getCommand("killme").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    Player p = (Player)	sender;
	    Location loc = p.getLocation();
	    World w = p.getWorld();
	    w.spawnEntity(loc, EntityType.CREEPER);
	    for(int i = 0; i < 10; i++) {
	    	
	    }
		
		return false;
	}
}
