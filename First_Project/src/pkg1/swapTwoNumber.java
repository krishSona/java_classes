package pkg1;

import java.util.Scanner;

public class swapTwoNumber {
	
	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Please enter a and b value");
		Scanner ref = new Scanner(System.in);
		a = ref.nextInt();
		b = ref.nextInt();
		System.out.println("Before Swapping\na = "+a+"\nb = "+b);
		//System.out.println("swapping two number\na = ");
		temp = a;
		a = b;
		b = temp;
		System.out.println("swapped number \na = "+a+"\nb = "+b);
	}
}
//Facebook account detail
//krishan.gaur@goibibo.com
//password.sendKeys("gaur@1234Krishan");