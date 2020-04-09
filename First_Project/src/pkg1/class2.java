package pkg1;

public class class2 extends class1 {
	public class2() {
		this(2);
		System.out.println("Default child");
	}
	public class2(int a) {
		super(5);
		System.out.println("first child");
	}
	public class2(int a, int b) {
		this();
		System.out.println("second child");
	}
	public static void main(String[] args) {
		class2 obj = new class2(2,5);
	}
}
