package challenge;

import java.util.Scanner;

public class FiveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong or Not");
		int num = sc.nextInt();
		int arm = num;
		int num_of_digits = 0;
		int tot = 0;
		sc.close();
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
		System.out.print((tot == num) ? "Armstrong number" : "not Armstrong");
	}
}
