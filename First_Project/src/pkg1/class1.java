package pkg1;

public class class1 {
	public class1() {
		this(2,5);
		System.out.println("Default parent");
	}
	public class1(int a) {
		this();
		System.out.println("first parent");
	}
	public class1(int a, int b) {
		System.out.println("second parent");
	}
	public static void main(String[] args) {
		class1 obj =new class1();
	}
}
