package challenge;

import java.util.Scanner;

public class FiveFive {
	public static int isPrime(int n) {
		if (n == 1)
			return 0;

		else if ((n % 5 != 0) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5)))
			return 1;

		return 0;
	}

	public static int isArmstrong(int n) {
		int num = n;
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
		return (tot == num) ? 1 : 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to check it Armstrong or Prime");
		int num = sc.nextInt();
		int pcount = isPrime(num);
		int acount = isArmstrong(num);
		sc.close();
		if (pcount == 1) {
			if (acount == 1)
				System.out.print("Both Prime and Armstrong");
			else
				System.out.print("Prime");
		} else if (acount == 1)
			System.out.print("Armstrong");
		else
			System.out.print("Both not");

	}

}
