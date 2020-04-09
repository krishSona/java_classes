package pkg1;
import java.util.Scanner;
public class primeNumber {
	public static void main(String[] args) {
		int a;
		System.out.println("please enter a number");
		Scanner ref=new Scanner(System.in);
		a= ref.nextInt();
		boolean num = false;
		for (int i=2; i<a; i++) {
			if(a%i==0) {
				num=true;
				break;
			}
		}
		if(num==true) {
			System.out.println("This is not prime number");
		}
		else {
			System.out.println("This is prime number");
		}
	}
}