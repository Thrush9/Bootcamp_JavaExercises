package dayone;

import java.util.Scanner;

public class LowestOfThree {

	public static void main(String[] args) {

		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first number\n");
		num1 = scan.nextInt();
		System.out.print("Enter the second number\n");
		num2 = scan.nextInt();
		System.out.print("Enter the Third number\n");
		num3 = scan.nextInt();

		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1 + " is the smallest number");

		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2 + " is the smallest number");

		} else {
			System.out.println(num3 + " is the smallest number");

		}

	}

}
