package daythree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Customer implements IBanking{
	
	String customerName;
	String depositType;
	int baseAmount;
	
	public Customer(String name,String type,int amt){
		this.customerName = name;
		this.depositType = type;
		this.baseAmount = amt;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDepositType() {
		return depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public int getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(int baseAmount) {
		this.baseAmount = baseAmount;
	}
	
	@Override
	public String toString() {
		return "[customerName=" + customerName + ", depositType=" + depositType + ", baseAmount=" + baseAmount + "]" ;
	}

	public int deposit(int amt) {
		int total=0;
		total = baseAmount + amt;
		System.out.println("\nAvailable Balance : " +baseAmount);
		System.out.println("Deposit Amount : " +amt);
		System.out.println("Total Balance : " +total);
		this.baseAmount = total;
		return total;
	} 
	
	public int withdraw(int amt) {
		int total=0;

//		if(baseAmount > 0 && baseAmount > amt) {
//		total = baseAmount - amt;
//		return total;
//		} else {
//		    System.out.println("\nAvailable Balance : " +baseAmount);
//		    System.out.println("Withdrawal Amount : " +amt);
//			System.out.println("No Sufficient Balance");
//		    this.baseAmount = baseAmount;
//		    return total;
//		}
		
		total = baseAmount - amt;
		System.out.println("\nAvailable Balance : " +baseAmount);
		System.out.println("Withdrawal Amount : " +amt);
		System.out.println("Total Balance : " +total);
		this.baseAmount = total;
		return total;
	} 
	
}

public class CustomerProcess {
	
	public static void depositProcess() {
		System.out.println("Deposit Process Going On");
	}
	
	public static void withdrawaltProcess() {
		System.out.println("Withdrawal Process Going On");
	}

	public static void main(String[] args) {

		Customer token1 = new Customer("Hero","Savings",5000);
		Customer token2 = new Customer("Villan","Current",1000);
				
		List creditList = new ArrayList<>();
		
		creditList.add(token1);
		creditList.add(token2);
			
		ListIterator litr = creditList.listIterator();
		
		 while(litr.hasNext()){
		       Object obj = litr.next();
		       Customer one = (Customer) obj;
		     
		      int interest= one.deposit(1000);
		      System.out.println("Annual Interest Added " + one.customerName + " - Total Balance :" + interest);
		      
		      int charges = one.withdraw(500);
		      System.out.println("Annual Charges Deducted " + one.customerName + " - Total Balance :" + charges);
		    }
		
	}

}

