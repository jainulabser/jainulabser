package challenge;

import java.util.Scanner;

public class ThreeSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check positive or negative");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "Positive" : num == 0 ? "Zero" : "Negative");
		sc.close();

	}

}
