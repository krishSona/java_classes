package pkg1;

public class expression {
	int a, b, c;
	public int sum(int a, int b) {
		int c= a+b;
		return c;
	}
	public int sub(int a, int b) {
		int c= a-b;
		return c;
	}
	public void div(int a, int b) {
		int c= a/b;
		System.out.println("result of expression - "+ c);
	}
	public int mul(int a, int b) {
		int c= a*b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Solve expression - ((((10+2)+2)-2)*2)/2)");
		expression result = new expression();
		int sum_result = result.sum(10, 2);
		int sum_result1 = result.sum(sum_result, 2);
		int subResult = result.sub(sum_result1, 2);
		int mul_result = result.mul(subResult, 2);
		result.div(mul_result, 2);
	}

}
