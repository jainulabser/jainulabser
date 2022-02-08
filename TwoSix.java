package challenge;

import java.util.Scanner;

public class TwoSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.km to miles \n2.Centigrate to Farenheat\n3.sqft to acre");
		System.out.println("Select above options");
		switch (sc.nextInt()) {
		case 1:
			System.out.print("Give km value to find miles");
			System.out.print(sc.nextFloat() / 1.6 + " Miles");
			break;

		case 2:
			System.out.print("Give Centigrate value to find Farenheat");
			System.out.print(sc.nextFloat() * 1.8 + 32 + " F");
			break;

		case 3:
			System.out.print("Give Sqft value to find Acre");
			System.out.print(sc.nextFloat() / 43560 + " Acre");
			sc.close();
			break;

		default:
			System.out.print("Enter above options only");
		}

	}

}
