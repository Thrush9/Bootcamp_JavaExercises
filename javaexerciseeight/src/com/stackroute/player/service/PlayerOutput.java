package com.stackroute.player.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.player.model.Player;
import com.stackroute.player.repo.PlayerSource;

public class PlayerOutput implements iPlayerWrite {

	ObjectOutputStream objectoutput = null;
	FileOutputStream fileoutput = null;
	List<Player> players = null;
	PlayerSource playerdata = null;
	PlayerInput playinput = null;
	// playerread=null;

	public PlayerOutput(String filename) throws Exception {
		players = new ArrayList<Player>();
		fileoutput = new FileOutputStream(filename);
		objectoutput = new ObjectOutputStream(fileoutput);
		playinput = new PlayerInput(filename);
		// playerdata=new PlayerSource(filename);
		// playinput=new PlayerInput(filename);
	}

	public void storePlayer(List<Player> players) throws IOException {

//		try {
//			players=playinput.players;
//		    players=pla.players;
//  		players=playinput.getPlayerData();
//			System.out.println("found" + players);
//		} catch (Exception e) {
//			System.out.println("exception" + e);
//		    objectoutput.close(); 
//		}
//          players.add(player);
		try {
			objectoutput.writeObject(players);
		} catch (IOException e) {
		} finally {
			objectoutput.close();
		}

	}
}
