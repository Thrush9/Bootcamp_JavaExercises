package com.stackroute.lamda.vehicle;

public class VehicleTaxationProcess {
	
	public static int processTax(Vehicle veh,iShowTax showtax) {
		return showtax.findTax(veh.getPrice());
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("4-wheeler", "Honda", 45000);
		int taxAmt = processTax(car,(amt) -> {
			 if(car.getPrice() > 50000)
				 return car.getPrice()*24/100;
			 else
				 return car.getPrice()*10/100;
		});
		System.out.println("Taxable Amount : " + taxAmt);
	}

}
