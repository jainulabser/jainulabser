package challenge;

import java.util.Scanner;

public class ThreeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give character to check Vowel or Consonant");
		switch (sc.next().charAt(0)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print("Vowel");
			break;
		default:
			System.out.print("Consonant");
			sc.close();
		}

	}

}
