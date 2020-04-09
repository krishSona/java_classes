package pkg1;

public class student {
	int age;	// that is integer variable
	int roll_no;	//  
	public void display()
	{
		System.out.println("Welcome to automation class");
	}
	public void display1()
	{
		System.out.println("This is the first class of java");
	}
	public static void main(String[] args) {
		System.out.println("hello krishan");
		student krishan= new student();		// object creation
		krishan.display();
		krishan.display1();
		System.out.println("hi, all of you. My self krishan");
		krishan.age=11;
		System.out.println("My age "+krishan.age);
		krishan.roll_no=25;
		System.out.println("my roll number is "+krishan.roll_no);
	}

}
