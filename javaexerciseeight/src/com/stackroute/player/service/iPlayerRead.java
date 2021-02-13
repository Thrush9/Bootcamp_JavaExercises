package com.stackroute.player.service;

import java.util.List;

import com.stackroute.player.model.Player;

public interface iPlayerRead {
	List<Player> getPlayerData() throws Exception;
	public List<Player> players=null;
}
