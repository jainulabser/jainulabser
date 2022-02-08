package challenge;
import java.util.Scanner;

public class OneNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Values Perform Bitwise Operations ");
		System.out.print("Enter a :");
		int a=sc.nextInt();
		System.out.print("Enter b :");
		int b=sc.nextInt();
		sc.close();
		System.out.println("Bitwise AND " + (a&b));
		System.out.println("Bitwise OR " + (a|b));
		System.out.println("Bitwise XOR " + (a^b));
		System.out.println("Bitwise Component " + ~(a));
	}
}
