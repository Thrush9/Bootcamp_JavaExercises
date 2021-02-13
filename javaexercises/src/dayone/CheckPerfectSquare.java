package dayone;

import java.util.Scanner;

public class CheckPerfectSquare {

	public static void main(String[] args) {

		double num, check;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number");
		num = scan.nextInt();

		check = Math.sqrt(num);

		if ((check - Math.floor(check)) == 0)
			System.out.print("Yes,Input is Perfect Square");
		else
			System.out.print("No,Input is not Perfect Square");
	}

}
