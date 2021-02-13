package com.stackroute.player.repo;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.player.model.Player;

public interface PlayerRepo {
	
	public  final List<Player> playerslist = PlayerSource.pexist;
	
	public void getData();
}
