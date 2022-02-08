package challenge;
import java.util.Scanner;
public class OneSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give a number for perform unary operations");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Given Value is "   + num);
		System.out.println("Unary minus"   + -(num));
		System.out.println("Increment"   + ++num);
		System.out.println("Decrement" + --num);
		System.out.println("Bitwise component"   + ~num);
	sc.close();
	
	}
}
