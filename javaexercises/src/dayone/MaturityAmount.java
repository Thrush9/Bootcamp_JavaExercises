package dayone;

import java.util.Scanner;

public class MaturityAmount {

	public static void main(String[] args) {

		int year;
		double principal, inst_amount, mat_amount, rate;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Principal Amount");
		principal = scan.nextDouble();
		System.out.print("Enter the Years");
		year = scan.nextInt();

		if (year < 0 || principal < 0) {
			System.out.print("Enter the Valid Number");
		} else {

			if (year > 15) {
				rate = 12;
			} else {
				rate = 10;
			}

			inst_amount = (principal * year * rate) / 100;
			mat_amount = principal + inst_amount;
			System.out.print("The Maturity Amount is " + mat_amount);
		}
	}
}
