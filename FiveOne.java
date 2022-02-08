package challenge;

import java.util.Scanner;

public class FiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start to End ArmStrong Numbers list");
		int num = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		for (; num <= end; num++) {
			int arm = num;
			int num_of_digits = 0;
			int tot = 0;

			while (arm != 0) {
				num_of_digits++;
				arm /= 10;
			}
			arm = num;
			while (arm != 0) {
				int digit = arm % 10;
				tot += Math.pow(digit, num_of_digits);
				arm /= 10;
			}
			System.out.print((tot == num) ? (num + " ") : "");
		}
	}

}
