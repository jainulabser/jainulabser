package challenge;
import java.util.Scanner;
import java.lang.Math;
public class OneSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give radius Outer and Inner Circle");
		System.out.println("Outer");
		float ro=sc.nextFloat();
		System.out.println("Inner");
		float ri=sc.nextFloat();
		double area=(Math.PI*ro*ro)-(Math.PI*ri*ri);
		System.out.print(area);
		sc.close();
	}
}