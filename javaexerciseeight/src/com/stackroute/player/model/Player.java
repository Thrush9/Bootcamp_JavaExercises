package com.stackroute.player.model;

import java.io.Serializable;

public class Player  implements Serializable{
	String playername;
	
	public Player(String pname,String cntry)
	{
		this.playername=pname;
		this.country=cntry;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	String country;
	
	public String toString()
	{
		return "Player name is " + playername + "  country is  " + country;
	}

}
