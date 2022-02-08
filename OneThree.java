package challenge;
import java.util.Scanner;
public class OneThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give width and height to find area of square");
		System.out.println("Width");
		int width=sc.nextInt();
		System.out.println("Height");
		int height=sc.nextInt();
		System.out.print(width*height);
		sc.close();
	}
}
