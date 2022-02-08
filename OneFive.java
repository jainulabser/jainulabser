package challenge;
import java.util.Scanner;
import java.lang.Math;
public class OneFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a  b  c to find x");
		System.out.print("a :");
		double a=sc.nextDouble();
		System.out.print("b :");
		double b=sc.nextDouble();
		System.out.print("c :");
		double sq=(b*b)-(4.0*a*(sc.nextDouble()));
		sc.close();
		double xp=(-b+Math.sqrt(sq))/(2.0*a);
		double xn=(-b-Math.sqrt(sq))/(2.0*a);
		System.out.println(xp);
		System.out.println(xn);
		
	}
}