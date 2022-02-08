package challenge;

import java.util.Scanner;

public class FiveTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number to find all factors");
		int num = sc.nextInt();
		sc.close();
		int sqrt = (int) Math.sqrt(num);
		for (int i = 1; i <= sqrt; i++)
			if (num % i == 0) {
				System.out.print(i + "  ");
				if (i != sqrt)
					System.out.print(num / i + " ");
			}
	}

}
