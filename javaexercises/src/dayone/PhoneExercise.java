package dayone;

import java.util.Scanner;

class PhoneNumberValidator {
	String num;

	public String getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String number = scan.nextLine();
		return number;
	}

	public boolean validatePhoneNumber(String number) {
		boolean flag = true;
		int count = 0, count1 = 0;

		char[] x = number.toCharArray();
		if (x.length == 0) {
			count++;
		} else {
			for (int i = 0; i < x.length; i++) {
				if (!Character.isDigit(x[i]) && (x[i] != '-')) {
					count++;
				}
				if (Character.isDigit(x[i])) {
					count1++;
				}
			}
		}
		if (count > 0 || count1 != 10) {
			flag = false;
		}
		return flag;
	}

	public void displayResult(boolean status) {
		if (status) {
			System.out.println("Input is valid phone number");
		} else
			System.out.println("Input is invalid or empty number");
	}
}

public class PhoneExercise {
	public static void main(String[] args) {
		String inputnum;
		Boolean result ;
		PhoneNumberValidator validator = new PhoneNumberValidator();
		inputnum = validator.getInput();
		result = validator.validatePhoneNumber(inputnum);
		validator.displayResult(result);
	}
}
