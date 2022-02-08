package challenge;

import java.util.Scanner;

public class TwoSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give Year for Check this leap year or not");
		short year = sc.nextShort();
		sc.close();
		if (year % 4 == 0) {
			if (year % 100.0 == 0 && year % 400.0 != 0) {
				System.out.print("Not Leap ");
			}

			else {
				System.out.print("Leap");
			}
		} 
		else
			System.out.print("Not Leap");
	}

}
