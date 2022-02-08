package challenge;

import java.util.Scanner;

public class SevenFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many lines want to print");
		short line = sc.nextShort();
		sc.close();
		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= line; j++) {
				if (j == line - i + 1)
					for (int k = i; k >= 1; k--)
						System.out.print("*" + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
