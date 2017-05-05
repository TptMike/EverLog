package com.everneth.everlog;
import org.bukkit.plugin.java.JavaPlugin;

import com.everneth.commands.MainCommand;

public class EverLog extends JavaPlugin 
{
	
	@Override
	public void onEnable()
	{
		getCommand("everlog").setExecutor(new MainCommand(this));
		
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	/**
	 *  Load our config
	 */
	public void loadConfig() {
		final EverLogConfig elc = new EverLogConfig(this);
		
	}
}
