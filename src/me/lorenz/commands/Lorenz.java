package me.lorenz.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Lorenz implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		Player player = (Player) sender;

		float x = (float) 0.01;
		float y = 100;
		float z = (float) 0.01;

		float a = 10;
		float b = 28;
		float c = (float) (5.0 / 3.0);

		boolean run = false;

		if (sender instanceof Player) {

			run = true;
			Bukkit.broadcastMessage("§cLorenz Attractor §ecreated at §6(§c0§6,§c0§6)X");

			for (int i = 0; i < 1000000; i++) {
				// while(run == true){

				float dt = (float) 0.0001;
				float dx = (a * (y - x)) * dt;
				float dy = (x * (b - z) - y) * dt;
				float dz = (x * y - c * z) * dt;

				x = x + dx;
				y = y + dy;
				z = z + dz;

				Location loc = new Location(Bukkit.getWorld("flatroom"), Math.round(x), Math.round(y), Math.round(z));
				loc.getBlock().setType(Material.STONE);
			}

			// }
			/*
			 * for(int i = 0; i < 100; i++){
			 * 
			 * Location loc = new Location(Bukkit.getWorld("world"),i, 100, 1);
			 * loc.getBlock().setType(Material.STONE);
			 * 
			 * }
			 */

		}

		return false;
	}

}
