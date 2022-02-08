package challenge;

import java.util.Scanner;

public class SixZero {
	public static void binaryToDecimal(long num) {
		long n = num;
		int decimal = 0;
		short count = 0;
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
		if (decimal != 0)
			System.out.print("Decimal value of " + num + " is " + decimal);
	}

	public static void decimalToBinary(int num) {
		int size = num / 5 + 3;
		int n = num;
		int i;
		int arr[] = new int[size];
		for (i = 0; n != 0; i++) {
			if (n == 1) {
				arr[i] = 1;
				break;
			}
			arr[i] = n % 2;
			n /= 2;
		}
		while (i >= 0) {
			System.out.print(arr[i]);
			i--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Binary to Decimal");
		System.out.println("2.Decimal to Binary");
		System.out.println("pick any options");
		if (sc.nextInt() == 1) {
			System.out.println("Enter Binay Value");
			binaryToDecimal(sc.nextLong());
		} else {
			System.out.println("Enter Decimal Value");
			decimalToBinary(sc.nextInt());
			sc.close();
		}

	}
}