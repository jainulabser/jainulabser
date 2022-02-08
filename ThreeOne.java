package challenge;

import java.util.Scanner;

public class ThreeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Values to perform Swapping ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println("Before Swapping a = " + a + " b = " + b);
		int temp = a;
		a = a + b - a;
		b = temp + b - b;
		System.out.println("After Swapping a = " + a + " b = " + b);

	}

}
