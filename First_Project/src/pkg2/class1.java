package pkg2;

public class class1 {
	String name; // that is char variable
	int roll_number; // that is the integer variable 
	public void krishan() {
		System.out.println("this is the first program");
	}
	public void krishana() {
		System.out.println("this is the part of first program");
	}
	public static void main(String[] args) {
		System.out.println("hey ram I miss you");
		class1 obj=new class1();
		obj.krishan();
		obj.name="krish";
		System.out.println(obj.name);
		class1 obj2=new class1();
		obj2.roll_number=11;
		System.out.println("this is the value of a" + ' ' +obj2.roll_number);
	}
}
