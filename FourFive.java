package challenge;

import java.util.Scanner;

public class FourFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer");
		int i = sc.nextInt();
		sc.close();
		int count = 0;
		while (i != 0) {
			i /= 10;
			count++;
		}
		System.out.print(count);
	
	}

}
