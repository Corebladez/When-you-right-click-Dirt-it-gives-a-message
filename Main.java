package me.core.stickhello;

import org.bukkit.plugin.java.JavaPlugin;

import me.core.stickhello.listeners.HelloListener;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() { 
		new HelloListener(this);
	}
}
