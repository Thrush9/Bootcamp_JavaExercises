package com.stackroute.player.service;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.player.model.Player;

public class PlayerInput implements iPlayerRead {

	FileInputStream fileinput = null;
	ObjectInputStream objectinput = null;
	public static List<Player> players = null;

	public PlayerInput(String filename) throws Exception {
		players = new ArrayList<Player>();
		fileinput = new FileInputStream(filename);
		objectinput = new ObjectInputStream(fileinput);
	}

	public List<Player> getPlayerData() throws Exception {
		try {
			players = (List<Player>) objectinput.readObject();
			// System.out.println(players);
			// objectinput.close();
		} catch (Exception e) {
			System.out.println("exception while read" + e);
			// objectinput.close();
		} finally {
			objectinput.close();
		}
		return players;
	}
}
