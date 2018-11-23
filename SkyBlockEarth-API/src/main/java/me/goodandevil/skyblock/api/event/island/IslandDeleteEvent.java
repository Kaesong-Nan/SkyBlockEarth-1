package me.goodandevil.skyblock.api.event.island;

import me.goodandevil.skyblock.api.island.Island;

import org.bukkit.event.HandlerList;

public class IslandDeleteEvent extends IslandEvent {
	
	private static final HandlerList HANDLERS = new HandlerList();
	
	public IslandDeleteEvent(Island island) {
		super(island);
	}
    
	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}
	
	public static HandlerList getHandlerList() {
		return HANDLERS;
	}
	
}