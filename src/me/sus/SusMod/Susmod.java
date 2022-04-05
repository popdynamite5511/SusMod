package me.sus.SusMod;

import org.bukkit.plugin.java.JavaPlugin;

import me.sus.SusMod.commands.CreeperCommand;

public class Susmod extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("SusMod has initialised and has successfully loaded into your server.");
		System.out.println("Found glitches in the plugin? Report them on the GitHub page.");
	}
}
