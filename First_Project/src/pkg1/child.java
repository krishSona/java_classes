package pkg1;

public class child extends parent {
	public child(int a,int b,int c) {
		super(1,2);
		System.out.println("Child 3 parameterized constructor");
	}
	public child() {
		this(1,2,3);
		System.out.println("Child default constructor");
	}
	public child(int a) {
		this();
		System.out.println("Child 1 parameterized constructor");
	}
	public child(int a,int b, int c, int d) {
		this(1);
		System.out.println("Child 4 parameterized constructor");
	}
	public child(int a,int b) {
		this(1,2,3,4);
		System.out.println("Child 2 parameterized constructor");
	}
	public static void main(String[] args) {
		child obj =new child(5,2);
	}
}
