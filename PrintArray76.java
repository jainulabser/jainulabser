package challenge;
import java.util.Scanner;
public class PrintArray76 {
	static Scanner sc=new Scanner(System.in);
	int[] s;
	void getElement() {
		System.out.print("Enter how many elements to print");
		s=new int[sc.nextInt()];
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextInt();
		}
	}
	void print(int a[]) {
		for(int s1:a)
		{
			System.out.print(s1 + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintArray76 printArr=new PrintArray76();
		printArr.getElement();
		printArr.print(printArr.s);
		sc.close();

	}

}
