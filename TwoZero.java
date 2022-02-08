package challenge;
import java.util.Scanner;

public class TwoZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value find the differences of PostFix and PreFix \n");
		int a = sc.nextInt();
		sc.close();
		int b=a;
		System.out.println("PostFix value Printed first then evaluate." + a++);
		System.out.println("PreFix value Evaluate first then Print." + ++b);
	}

}
