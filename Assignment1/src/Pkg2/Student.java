package Pkg2;

public class Student 
{
	int roll_no; // Create var 
	int age;
	
	public void display1() // create method
	{
		System.out.println("Welcom to all of you");	
	}
	 public void display2() // Create method
	 {
		 System.out.println("Automation is easy");
	 }
	 
	 public static void main(String[] args)  //Create main method
	 { 
		Student snehal= new Student(); // object creation
		
		snehal.display1();
		snehal.display2();
		
		snehal.roll_no=5;
		
		snehal.age= 27;
		
		System.out.println("Snehal roll no is " +snehal.roll_no);
		System.out.println("Snehal age is " +snehal.age);
	}
}

