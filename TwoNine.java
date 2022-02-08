package challenge;

import java.util.Scanner;

public class TwoNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Values to Compute Quotent and Reminder\n");
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		sc.close();
		System.out.print("Quotent :" + val1 / val2 + "\nReminder :" + val1 % val2);

	}

}
