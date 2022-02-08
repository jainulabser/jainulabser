package challenge;

import java.util.Scanner;

public class FiveThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("                 Calculator              ");
		System.out.println(" 1.Add   2.Subtract   3.Multiply   4.Divide\n\n");
		System.out.println("Enter any above options");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Give Two numbers For Addition");
			System.out.print(sc.nextInt() + sc.nextInt());
			break;
		case 2:
			System.out.println("Give Two numbers For Subtraction");
			System.out.print(sc.nextInt() - sc.nextInt());
			break;
		case 3:
			System.out.println("Give Two numbers For Multiply");
			System.out.print(sc.nextInt() * sc.nextInt());
			break;
		case 4:
			System.out.println("Give Two numbers For Divide");
			System.out.print(sc.nextInt() / sc.nextInt());
			sc.close();
			break;
		default:
			System.out.print("Enter Above options only");
		}
	}

}
