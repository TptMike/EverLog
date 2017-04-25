package com.everneth.everlog;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils
{
	// Common strings I've used while developing other plugins
	public static String inGame = "&cThis command is for in-game use.";
	public static String syntax = "&cIncorrect Syntax&f: &7&o";
	
	/**
	 * Used to convert color codes to a colored message
	 * @param color Takes in a string to convert color codes into color.
	 * @return Returns the string in colored format.
	 */
	public static String color(String color)
	{	
		return ChatColor.translateAlternateColorCodes('&', color);
	}
	
	/**
	 * Used for squashing bugs
	 * @param message Takes in a message to display in chat with the tag [BugTest]
	 */
	public static void bugTest(String message)
	{
		Bukkit.broadcastMessage(Utils.color("&8[&4BugTest&8]" + "&7 " + message));
	}
	
	/**
	 * Used for squashing bugs
	 * @param message Takes in a int to display in chat with the tag [BugTest]
	 */
	public static void bugTest(int message)
	{
		Bukkit.broadcastMessage(Utils.color("&8[&4BugTest&8]" + "&7 " + message));
	}
}
