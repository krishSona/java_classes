package pkg1;

class example{
	int a,b, total;
	int sum(int a,int b) {
	int	total=a+b;
	return total;
	}
}

public class expression1 {
	int a,b,c,d;
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println("result of expression - "+ c);
	}
	public int div(int a,int b) {
		int c=a/b;
		return c;
	}
	public void boy() {
		int y=10;
		System.out.println("y"+y);
	}
	public static void main(String[] args) {
		example obj=new example();
		obj.a=10;
		obj.b=22;
		int total=obj.sum(10, 22);
		System.out.println("this is the result of example "+total);
		System.out.println("Solve expression - (((10/2)+2)-3)*2)");
		expression1 resOfExpr= new expression1();
		int divResult=resOfExpr.div(10, 2);
		int sumResult=resOfExpr.sum(divResult, 2);
		int subResult=resOfExpr.sub(sumResult, 3);
		resOfExpr.mul(subResult, 2); 
		resOfExpr.boy();
	}

}
