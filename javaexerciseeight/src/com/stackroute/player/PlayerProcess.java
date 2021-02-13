package com.stackroute.player;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.player.model.Player;
import com.stackroute.player.repo.PlayerRepo;
import com.stackroute.player.repo.PlayerSource;
import com.stackroute.player.service.PlayerInput;
import com.stackroute.player.service.PlayerOutput;
import com.stackroute.player.service.iPlayerRead;
import com.stackroute.player.service.iPlayerWrite;

public class PlayerProcess {

	public static void main(String[] args) throws Exception {

		InputStreamReader inputs = new InputStreamReader(System.in);
		BufferedReader bread = new BufferedReader(inputs);
		List<Player> pexist = new ArrayList<Player>();
		List<Player> players = new ArrayList<Player>();
		PlayerSource playsource;

		int ans = 0;
		while (ans == 0) {
			System.out.println("enter choice 1 - store, 2 -display");
			int choice = Integer.parseInt(bread.readLine());
			try {
				//playsource = new PlayerSource("mynew2.dat");
				PlayerRepo repo = new PlayerSource("mynew2.dat");
				
				repo.getData();
				pexist = PlayerRepo.playerslist;
				System.out.println(pexist); 
			} catch (Exception e) {
				System.out.println("Exception raised" + e);
			}
			// pexist=playerrepo.players;
			// pexist=playsource.pexist;
			switch (choice) {
			case 1: {
				iPlayerWrite playwrite = new PlayerOutput("mynew2.dat");
				System.out.println("Enter playername and country");
				String playname = bread.readLine();
				String country = bread.readLine();
				Player player = new Player(playname, country);
				if (pexist != null) {
					pexist.add(player);
					players = pexist;
				} else
					players.add(player);
				playwrite.storePlayer(players);
				break;
			}
			case 2: {
				//iPlayerRead playread=new PlayerInput("mynew2.dat");
				   List<Player> playersList=pexist;
				for ( Player playerobj : playersList)
				{
					System.out.println(playerobj);
				}
				break;
			}
		}
			System.out.println("\nWnat to continue 0-yes , 1 -no");
			ans = Integer.parseInt(bread.readLine());
		}

	}
}
