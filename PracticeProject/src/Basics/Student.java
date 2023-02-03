package Basics;

public class Student {
	int age, rollno;
	public void display1()
	{
		System.out.println("Welcome to all of you.");
	}
	public void display2()
	{
		System.out.println("Automation is very easy.");
	}
	
	public static void main(String[] args) {
		Student Junka = new Student();
		Junka.display1();
		Junka.display2();
		Junka.age = 28;
		Junka.rollno = 30;
		System.out.println("Student age is:" + Junka.age);
		System.out.println("Student roll number is:" + Junka.rollno);
	}
}
