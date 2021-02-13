package daytwo;

 class TravellerInfo {

	private int id;
	private String  travelType;
	private double price;
	
	TravellerInfo(){
		this.id = 101;
		this.travelType = "Railways";
		this.price = 500;
	}
	
	TravellerInfo(int id){
		this.id = id;
		this.travelType = "Railways";
		this.price = 500;
	}
	
	TravellerInfo(int id,String type){
		this.id = id;
		this.travelType = type;
		this.price = 500;
	}
	
	TravellerInfo(int id,String type,double cost){
		this.id = id;
		this.travelType = type;
		this.price = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTravelType() {
		return travelType;
	}
	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTravelInfo() {
		String result  = " Id : " + id + " and  TravelType : " + travelType + " and  price : " + price;
		return result;
	}

}
 
 public class Traveller extends TravellerInfo {
	 
	 public static void main(String[] args) {
		 
		 TravellerInfo info = new TravellerInfo();
		 String details = info.getTravelInfo();
		 System.out.println(details);
		 
		 TravellerInfo info1 = new TravellerInfo(102);
		 String details1 = info1.getTravelInfo();
		 System.out.println(details1);
		 
		 TravellerInfo info2 = new TravellerInfo(103,"Roadways");
		 String details2 =  info2.getTravelInfo();
		 System.out.println(details2);
		 
		 TravellerInfo info3 = new TravellerInfo(104,"Airways", 2000);
		 String details3 = info3.getTravelInfo();
		 System.out.println(details3);
	 }
 }
 
