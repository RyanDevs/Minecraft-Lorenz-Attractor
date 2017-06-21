package me.lorenz;

import org.bukkit.plugin.java.JavaPlugin;

import me.lorenz.commands.Lorenz;

public class Main extends JavaPlugin {

	public void onEnable() {

		registerCMD();
		
	}
	
	public void registerCMD(){
		
		getCommand("lorenz").setExecutor(new Lorenz());
		
	}

}
