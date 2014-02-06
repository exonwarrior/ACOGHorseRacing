package com.abercog.minecraft.acoghorseracing;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ACOGHorseRacing extends JavaPlugin {

	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
	}
 
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("createtrack")){
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
				return false;
			} else {
				Player player = (Player) sender;
				if(player.hasPermission("acoghorseracing.createtrack")) {
					if (args.length > 3) {
				           sender.sendMessage("Too many arguments!");
				           return false;
			        }
			        if (args.length < 2) {
			           sender.sendMessage("Not enough arguments! Please specify the track name and track type!");
			           return false;
				    }
			        
			        RaceTrack raceTrack = new RaceTrack(args[0]);
			        
			        if(args[1].equalsIgnoreCase("line")){
			        	
			        	sender.sendMessage("Please select starting line!");
			        	int x1,y1,z1 = 0;
				        int x2,y2,z2 = 0;
				        /*
				         * TODO: Code to set x1/y1/z1 to first block selected, then x2/y2/z2 to second block selected and create start line
				         */
				        
				        sender.sendMessage("Start line created! Now set starting points!");
				        
				        /*
				         * TODO: Code for creating start points. Have user select starting point by clicking blocks, then run command /ahr createstartpoint
				         */
				        
				        //In a loop
				        sender.sendMessage("Start point created!");
				        
				        //Once all start points have been created
				        sender.sendMessage("Please select finish line!");
				        /*
				         * TODO: Code to set x1/y1/z1 to first block selected, then x2/y2/z2 to second block selected and create finish line
				         */
				        sender.sendMessage("Finish line created! Creation of race track " + args[0] + " finished!");
			        } else if(args[1].equalsIgnoreCase("gate")){
			        	
			        	sender.sendMessage("Please select starting gates!");
			        	int x1,y1,z1 = 0;
				        int x2,y2,z2 = 0;
				        /*
				         * TODO: Code to set x1/y1/z1 to first block selected, then x2/y2/z2 to second block selected and create a single gate.
				         * User then runs command /ahr createstartgate
				         */
				        
				        //in a loop
				        sender.sendMessage("Starting gate created!");
				        
				        //Once all starting gates have been created
				        sender.sendMessage("Please select finish line!");
				        /*
				         * TODO: Code to set x1/y1/z1 to first block selected, then x2/y2/z2 to second block selected and create finish line
				         */
				        sender.sendMessage("Finish line created! Creation of race track " + args[0] + " finished!");
			        	
			        } else {
			        	sender.sendMessage("Unrecognized race track type! Available types are 'line' and 'gate'!");
			        }
			        
				}else{
				   sender.sendMessage("You don't have permission to run this command!");
				}
			}
		}
		return false;
	}

}
