package challenge;

import java.util.Scanner;

public class SixTwo {
	public static void octalToBinary(int num) {
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
		int size = decimal / 5 + 3;
		n = decimal;
		int arr[] = new int[size];
		for (count = 0; n != 0; count++) {
			if (n == 1) {
				arr[count] = 1;
				break;
			}
			arr[count] = n % 2;
			n /= 2;
		}
		while (count >= 0) {
			System.out.print(arr[count]);
			count--;
		}
	}

	public static void binaryToOctal(long num) {
		long n = num;
		int size = 10;
		int decimal = 0;
		short count = 0;
		short arr[] = new short[size];
		while (n != 0) {
			short digit = (short) (n % 10);
			if (digit == 0 || digit == 1) {
				decimal += digit * Math.pow(2, count++);
				n /= 10;
			} else {
				System.out.println("Give Binary Formal 0's and 1's");
				break;
			}
		}
		n = decimal;
		for (count = 0; n != 0; count++) {
			if (n == 1) {
				arr[count] = 1;
				break;
			}
			arr[count] = (short) (n % 8);
			n /= 8;
		}
		while (count >= 0) {
			System.out.print(arr[count]);
			count--;
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
			octalToBinary(sc.nextInt());
		} else {
			System.out.println("Enter Decimal Value");
			binaryToOctal(sc.nextLong());
			sc.close();
		}

	}
}