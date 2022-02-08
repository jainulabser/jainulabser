package challenge;
import java.util.Scanner;

public class SixThree {
	public static String reverseString(String myStr) {
		if (myStr.isEmpty()) {
			return myStr;
		}
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.print("Enter String");
		String myStr=sc.nextLine();
		String reversed = reverseString(myStr);
		System.out.println("The Actual string is: " + myStr);
		System.out.println("The reversed string is: " + reversed);

	}

}
