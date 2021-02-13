package com.stackroute.lamda.passanger;

import java.util.ArrayList;
import java.util.List;

public class TravelPassengers {
	
	public static List<String> passengerData(List<Passenger> totalList ,iPassengerProcess traveller){
//		List<String> cityWiseList = new ArrayList<>();
//		for (Passenger pass : totalList) {
//			if(pass.getCity().equals("Chennai")) {
//			String name = traveller.showDetails(pass);
//			cityWiseList.add(name);
//		  }
//		}
//		return cityWiseList;	
		return traveller.showDetails(totalList);
	}

	public static void main(String[] args) {
		
		List<Passenger> passengerList = new ArrayList<>(); 	
		passengerList.add(new Passenger(41, "Ramesh", 40, "Mumbai"));
		passengerList.add(new Passenger(42, "Suresh", 70, "Delhi"));
		passengerList.add(new Passenger(43, "Naresh", 54, "Chennai"));
		passengerList.add(new Passenger(44, "Mahesh", 24, "Banglore"));
		passengerList.add(new Passenger(45, "Umesh", 32, "Chennai"));
		
		List<String> cityWiseList = new ArrayList<>();
		passengerData(passengerList,(search)->{
			for (Passenger pass : passengerList) {
				if(pass.getCity().equals("Chennai"))
					cityWiseList.add(pass.getName());
		         }
			    return cityWiseList;
			});	
		System.out.println("Search Based List : ");
		for (String s : cityWiseList) {
			System.out.println(s);
		}
		
		System.out.println("\nCheck Seniority");
		iSeniorProcess findSenior = Passenger::isSenior;
		System.out.println(findSenior.checkSenior(passengerList.get(1).getAge()));
	}

}
