package me.core.stickhello.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.core.stickhello.Main;

public class HelloListener implements Listener{

	private Main plugin;
	
	public HelloListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void stickEvent(PlayerInteractEvent  e) {
		
		Player p = e.getPlayer();
		Material mat = e.getItem().getType();
		if(mat == Material.DIRT)
		p.sendMessage("Hello my Friend i am a Dirt!!");
		
	   }
