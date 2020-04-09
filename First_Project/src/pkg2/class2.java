package pkg2;

import java.util.Scanner;

public class class2 {
	int a;
	int b;
	public int sum(int a, int b) {
		int result=a+b;
		return result;
	}
	public int sub(int a, int b) {
		int sub_result=a-b;
		return sub_result;
	}
	public int multi(int a, int b) {
		int final_result=a*b;
		return final_result;
	}
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		int a=ref.nextInt();
		System.out.println("ples,,, "+a);
		class2 obj=new class2();
		int sum_result=obj.sum(10,2);
		int sub_result=obj.sub(12,2);
		int final_result=obj.multi(sum_result,sub_result);
		System.out.println("result"+ ' '+final_result);
	}
}