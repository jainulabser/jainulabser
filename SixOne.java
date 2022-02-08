package challenge;

import java.util.Scanner;

public class SixOne {
	public static void octalToDecimal(int num) {
		int n = num;
		int decimal = 0;
		short count = 0;
		while (n != 0) {
			short digit = (short) (n % 10);
			if (digit < 8) {
				decimal += digit * Math.pow(8, count++);
				n /= 10;
			} else {
				System.out.println("Give Binary Formal 0's and 1's");
				break;
			}
		}
		if (decimal != 0)
			System.out.print("Decimal value of " + num + " is " + decimal);
	}

	public static void decimalToOctal(int num) {
		int size = 10;
		int n = num;
		int i;
		short arr[] = new short[size];
		for (i = 0; n != 0; i++) {
			if (n == 0) {
				break;
			}
			arr[i] = (short)(n % 8);
			n /= 8;
		}
		while (i >= 0) {
			System.out.print(arr[i]);
			i--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Octal to Decimal");
		System.out.println("2.Decimal to Octal");
		System.out.println("pick any options");
		if (sc.nextInt() == 1) {
			System.out.println("Enter Octal Value");
			octalToDecimal(sc.nextInt());
		} else {
			System.out.println("Enter Decimal Value");
			decimalToOctal(sc.nextInt());
			sc.close();
		}

	}
}