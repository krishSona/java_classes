package pkg1;

import java.util.Scanner;

public class latest {
	public static void main(String[] args) {
		System.out.println("please enter the number");
		Scanner ref = new Scanner(System.in);
		int a=ref.nextInt();
		if(a%2==0)  {
			System.out.println("Even number");
		}
		else {
		System.out.println("this is odd number");
		}
	}
}  
