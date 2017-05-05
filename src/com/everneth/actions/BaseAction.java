package com.everneth.actions;

// Java libs
import java.util.Date;
import java.text.DateFormat;

// EverLog libs
import com.everneth.everlog.EverLog;
// TODO: EL DB Libs

// Bukkit libs
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class BaseAction implements ActionHandler {
	
	/* CLASS FIELDS
	 * 
	 */
	protected Plugin plugin;
	
	// TODO: Action type
	
	// COORDS
	protected double x;
	protected double y;
	protected double z;
	
	/*
	 * We're doing things
	 */
	
	//@Override - We will be overriding this later
	public void setPlugin(Plugin plugin)
	{
		this.plugin = plugin;
	}
	
	// TODO: Handler
	
	

}
