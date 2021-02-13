package dayone;

public class LongestString {

	public static void main(String args[]) {
		
		String input = "Honesty is the best policy";
		String[] arr = input.split(" ");
		int longest = arr[0].length();
		String result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (longest < arr[i].length()) {
				longest = arr[i].length();
				result = arr[i];
			}
		}
		
		System.out.println("Longest Word in the Input String is '" + result + "'");
	}
}
