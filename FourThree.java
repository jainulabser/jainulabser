package challenge;

import java.util.Scanner;

public class FourThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Value to find LCM");
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		int a = first, b = second;
		if (!(a > b)) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			int c;
			c = a % b;
			a = b;
			b = c;
		}
		System.out.println((first * second) / a);

	}

}
