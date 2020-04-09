package pkg1;
import java.util.Scanner;
public class withoutTempVariable {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Please enter a and b value");		
		Scanner ref=new Scanner(System.in);
		a =ref.nextInt();
		b =ref.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("swapped number \na = "+a+"\nb = "+b);
	}
}