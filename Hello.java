package me.sfl123.Hello;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Hello extends JavaPlugin{
  public static Hello H;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable(){
		this.logger.info("[Hello]" + " has been disabled!");
	}
	
	@Override
	public void onEnable(){
		this.logger.info(ChatColor.RED + "[Hello]" + " Has Been Enabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;//Below is the commands!
		if(commandLabel.equalsIgnoreCase("Hello")){//This command is named Hello!
			if(args.length == 0){
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " is saying hello!");
			}else if(args.length == 1){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " is saying hello to " + targetPlayer.getName());
			}
		}
		if(commandLabel.equalsIgnoreCase("Hi")){/*This command is named Hi!*/
			if(args.length == 0){
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " is saying hi!");
			}else if(args.length == 1){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " is saying hi to " + targetPlayer.getName());
			}
		}
		if(commandLabel.equalsIgnoreCase("Punch")){//This command is named Punch
			if(args.length == 0){	
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " punched him/herself in the face!");
				player.damage(1);
			}else if(args.length == 1){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " has punched " + targetPlayer.getName() + " in the face!");
				targetPlayer.damage(1);
			}
		}
		if(commandLabel.equalsIgnoreCase("Slap")){//This command is named Slap!
			if(args.length == 0){
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " has slapped him/herself in the face!");
				player.damage(1);
			}else if(args.length == 1){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " has slapped " + targetPlayer.getName() + " in the face!");
				targetPlayer.damage(1);
			}
		}if(commandLabel.equalsIgnoreCase("RageQuit")){
			if(args.length == 0){
				Bukkit.broadcastMessage(ChatColor.DARK_RED + player.getName() + " has RageQuit!");
				player.kickPlayer(ChatColor.DARK_RED + "You have RageQuit!");
			}
		}
		if(commandLabel.equalsIgnoreCase("Facepalm")){
			if(args.length == 0){
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " facepalmed!");
				player.damage(1);
			}else if(args.length == 1){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " has facepalmed " + targetPlayer.getName() + "!");
				targetPlayer.damage(1);
			}
		}
		if(commandLabel.equalsIgnoreCase("Facedesk")){
			if(args.length == 0){
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " facedesks!");
				player.damage(1);
			}else if(args.length == 1){
				Player tP = player.getServer().getPlayer(args[0]);
				Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " has facedesked " + tP.getName() + "!");
				tP.damage(1);
			}
		}
		if(commandLabel.equalsIgnoreCase("/Hello")){ 
		player.sendMessage(ChatColor.GOLD + "Commands From Hello:");
		player.sendMessage(ChatColor.YELLOW + "/Hello:" + ChatColor.WHITE + " Sends a message saying Hello!");
		player.sendMessage(ChatColor.YELLOW + "/Hi:" + ChatColor.WHITE + " Sends a message saying Hi!");
		player.sendMessage(ChatColor.YELLOW + "/Punch:" + ChatColor.WHITE + " Punch someone!");
		player.sendMessage(ChatColor.YELLOW + "/Slap:" + ChatColor.WHITE + " Slap Someone!");
		player.sendMessage(ChatColor.YELLOW + "/RageQuit:" + ChatColor.WHITE + " RageQuits the server!");
		player.sendMessage(ChatColor.YELLOW + "/Facepalm:" + ChatColor.WHITE + " Facepalms!");
		player.sendMessage(ChatColor.YELLOW + "/Facedesk" + ChatColor.WHITE + " Facedesks!");
	}
		return false;
}
}
