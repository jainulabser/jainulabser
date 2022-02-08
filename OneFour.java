package challenge;
import java.util.Scanner;
import java.lang.Math;
public class OneFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give radius and height to find area of cylinter");
		System.out.println("Radius");
		float radius=sc.nextFloat();
		System.out.println("Height");
		float height=sc.nextFloat();
		double area=(2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
		System.out.print(area);
		sc.close();
	}
}
