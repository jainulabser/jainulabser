package challenge;
import java.util.Scanner;

public class FourSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter number to reverse it");
		int n=sc.nextInt();
		sc.close();
		while(n!=0)
		{
			System.out.print(n%10);
			n/=10;
		}
	}

}
