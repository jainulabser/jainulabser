package challenge;

import java.util.Scanner;

public class ThreeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number to check Odd or Even");
		System.out.print(sc.nextInt() % 2 == 0 ? "Even" : "Odd");
		sc.close();
	}

}
