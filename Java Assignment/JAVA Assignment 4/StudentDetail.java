import java.util.Scanner;

class Student
{
	String name;
	int m1;
	int m2;
	int m3;
	public Student(String name, int m1, int m2,int m3)
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	public int total(){
		return m1+m2+m3;
	}
	public double average() {
        return (m1 + m2 + m3) / 3.0;
    }
	public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total());
    }
	
}
public class StudentDetail{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        sc.nextLine(); // To consume the newline character after the integer input

        // Loop through to get student details
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            // Take the student's name as input
            System.out.print("Name: ");
            String name = sc.nextLine();

            // Take marks for three subjects
            System.out.print("Marks in Subject 1: ");
            int m1 = sc.nextInt();
            System.out.print("Marks in Subject 2: ");
            int m2 = sc.nextInt();
            System.out.print("Marks in Subject 3: ");
            int m3 = sc.nextInt();
            sc.nextLine(); // To consume the newline character after the integer input

            // Create a Student object with the provided details
            Student student = new Student(name, m1, m2, m3);

            // Display the student's name and total marks
            student.display();

            // Display the average marks
            System.out.println("Average Marks: " + student.average());
        }
		
		
	}
	
}
