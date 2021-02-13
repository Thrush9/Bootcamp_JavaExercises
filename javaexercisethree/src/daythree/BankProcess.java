package daythree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bank {

	String bankName;
	List<Customer> customers;

	public Bank(String name, List<Customer> list) {
		this.bankName = name;
		this.customers = list;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", customers=" + customers.toString() + "]";
	}

}

public class BankProcess {

	static Bank sbi;
	static Scanner scan = new Scanner(System.in);

	static void addCustomer(Customer person) {

		List<Customer> existingList = sbi.getCustomers();
		existingList.add(person);
		sbi.setCustomers(existingList);
		System.out.println("Added Customer : " + person.customerName);

	}

	static void deleteCustomer(String target) {

		int pos=0;
		List<Customer> existingList = sbi.getCustomers();
		for (Customer person : existingList) {
			if (person.getCustomerName().toLowerCase().equals(target.toLowerCase()))
				pos = existingList.indexOf(person);
		}
		existingList.remove(pos);
		sbi.setCustomers(existingList);
		System.out.println("Deleted Customer : " + target);

	}

	
	static void viewCustomers() {

		List<Customer> existingList = sbi.getCustomers();
		if (!existingList.isEmpty()) {
			for (Customer person : existingList) {
				System.out.println(person.toString());
			}
		} else  {
			System.out.println("The List is empty");
		}

	}

	public static void main(String[] args) {

		Customer token1 = new Customer("Hero", "Savings", 5000);
		Customer token2 = new Customer("Villan", "Current", 1000);

		List<Customer> clist = new ArrayList<>();
		clist.add(token1);
		clist.add(token2);

		sbi = new Bank("SBI", clist);

		int ans = 0;
		while (ans == 0) {
			System.out.println("\n1 - Add Customer \n2 - Delete Customer \n3 - View Customers");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				//Customer token = new Customer("Heroine", "Current", 10000);
				System.out.println("Enter Customer Name");
				String addname = scan.next();
				System.out.println("Enter Customer Type");
				String addtype = scan.next();
				System.out.println("Enter Customer BaseAMount");
				int addamt = scan.nextInt();
				Customer token = new Customer(addname, addtype, addamt);
				addCustomer(token);
				break;
			case 2:
				System.out.println("Enter Customer to be deleted");
				String name = scan.next();
				deleteCustomer(name);
				break;
			case 3:
				viewCustomers();
				break;
			default:
				break;
			} // switch ends
			
			System.out.println("Wnat to continue 0-yes , 1 -no");
			ans = scan.nextInt();
		}
	}
}
