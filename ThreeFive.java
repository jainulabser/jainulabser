package challenge;

import java.util.Scanner;

public class ThreeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give three values to find roots of Quatratic Equation");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float sqr = b * b - 4 * a * (sc.nextFloat());
		sc.close();

		if (sqr > 0) {
			System.out.print("root 1" + (-b + Math.sqrt(sqr)) / (2.0 * a));
			System.out.print("root 2" + (-b - Math.sqrt(sqr)) / (2.0 * a));
		}

		else if (sqr == 0) {
			System.out.print("root 1" + -b / (2.0 * a));
			System.out.print("root 2" + -b / (2.0 * a));
		}

		else {
			System.out.print("root 1" + -b / (2.0 * a) + "+ " + Math.sqrt(-sqr) / (2.0 * a) + "i");
			System.out.print("root 2" + -b / (2.0 * a) + "- " + Math.sqrt(-sqr) / (2.0 * a) + "i");
		}
	}

}
