package com.stackroute.player.service;

import java.io.IOException;
import java.util.List;

import com.stackroute.player.model.Player;

public interface iPlayerWrite {
	public void storePlayer(List<Player> player) throws IOException;
}
