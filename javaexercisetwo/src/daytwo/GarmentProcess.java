package daytwo;

class Garment {
	String gname;
	String gowner;

	Garment() {
		this.gname = "Shirt";
		this.gowner = "Puma";
	}

	Garment(String name, String owner) {
		this.gname = name;
		this.gowner = owner;
	}

	public void showDetails() {
		System.out.println("Garment Name : " + gname + " and Garment Owner : " + gowner);
	}

	public void productionProcess() {
		showDetails();
		System.out.println("Production is under process - No Thread or Dye provided!");
	}

	public void productionProcess(String thread) {
		showDetails();
		System.out.println("Production is under process - Selected Thread : " + thread);
		
	}

	public void productionProcess(String dye, String thread) {
		showDetails();
		System.out.println("Production is under process - Selected Thread : " + thread + " and Dye : " + dye);
	}
}

public class GarmentProcess {

	public static void main(String[] args) {

		Garment piece1 = new Garment();
		piece1.productionProcess();

		Garment piece2 = new Garment("Jeans", "Pepe");
		piece2.productionProcess("Cotton");
		
		Garment piece3 = new Garment("Suit", "Raymonds");
		piece3.productionProcess("White","Cotton");
		
	}
}
