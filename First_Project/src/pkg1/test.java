package pkg1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int a;
		float rs;
		String ab;
		Scanner krish = new Scanner(System.in);
		System.out.print("enter string ");
		ab=krish.nextLine();
		System.out.println("Find the string "+ab);
		System.out.print("enter integer number ");		
		a=krish.nextInt();
		System.out.println("Find the inter no. "+a);
		System.out.print("please enter a floating number ");
		rs=krish.nextFloat();
		System.out.println("floating number "+rs);
		krish.close();
		}
}
