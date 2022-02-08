package challenge;

import java.util.Scanner;

public class SixFour {
	public static int power(int a, int b) {
		if (b == 0)
			return 1;
		return (power(a, --b) * a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number and power of number");
		System.out.print(power(sc.nextInt(), sc.nextInt()));
		sc.close();

	}

}
