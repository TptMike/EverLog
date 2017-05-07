package com.everneth.everlog.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.everneth.everlog.EverLog;
import com.everneth.everlog.Utils;

public class MainCommand implements CommandExecutor
{
	static EverLog plugin;
	
	public MainCommand(EverLog pl)
	{
		plugin = pl;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if(command.getName().equalsIgnoreCase("everlog"))
		{
			// Tests to see if the player is in-game and not in console
			if(!(sender instanceof Player))
			{
				sender.sendMessage(Utils.color(Utils.inGame));
				return false;
			}
			
			// Tests to see if the player put another argument after the command: /command <argument>
			if(args.length < 1)
			{
				sender.sendMessage(Utils.color(Utils.syntax + "/everlog <list commands here>"));
				return false;
			}
			
			// String to hold the first argument
			String commandAction = args[0];
			
			// If/Else statements for each command
			if(commandAction.equalsIgnoreCase("lookup") || commandAction.equalsIgnoreCase("lu"))
			{
				LookupCommand.lookup();
			}
			else if(commandAction.equalsIgnoreCase("rollback") || commandAction.equalsIgnoreCase("rb"))
			{
				RollbackCommand.rollback();
			}
			else if(commandAction.equalsIgnoreCase("restore") || commandAction.equalsIgnoreCase("rs"))
			{
				RestoreCommand.restore();
			}
			else
			{
				sender.sendMessage(Utils.color(Utils.syntax + "/everlog <list commands here>"));
				return false;
			}
		}
		
		return false;
	}
	
}
