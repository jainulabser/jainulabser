package challenge;

import java.util.Scanner;

public class FourZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number get multiplication table");
		short num = sc.nextShort();
		sc.close();
		for (int i = 1; i <= 10; i++)
			System.out.println(i + "*" + num + "=" + i * num);

	}

}
