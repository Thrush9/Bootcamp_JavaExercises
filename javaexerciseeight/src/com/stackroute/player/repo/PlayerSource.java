package com.stackroute.player.repo;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.player.model.Player;
import com.stackroute.player.service.PlayerInput;
import com.stackroute.player.service.iPlayerRead;

public class PlayerSource implements PlayerRepo {

	public static List<Player> pexist = new ArrayList<>();
	static String filename;
	static iPlayerRead playread;

	public PlayerSource(String fname) throws Exception {
		PlayerSource.filename = fname;
		playread = new PlayerInput(fname);
	}

	public void getData() {
		try {
			pexist = playread.getPlayerData();
         // System.out.println(pexist.size());
//			for (Player playerobj : pexist) {
//				System.out.println(playerobj);
//			}
		} catch (Exception e) {
			System.out.println("excepiton " + e);
		}
		//return pexist;
	}
}
