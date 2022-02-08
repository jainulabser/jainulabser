package challenge;

import java.util.Scanner;

public class ThreeSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("give char");
		char c = sc.next().charAt(0);
		sc.close();
		System.out.println(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') ? "alphabet" : "not alphabet");

	}

}
