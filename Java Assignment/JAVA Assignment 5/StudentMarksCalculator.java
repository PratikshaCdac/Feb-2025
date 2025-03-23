import java.util.Scanner;
import java.util.InputMismatchException;

class Student {
    // Instance variables
    private String name;
    private int rollNo;
    private double[] marks = new double[5];
    private double average;
    private char grade;

    // Constructor to initialize student details
    public Student(String name, int rollNo, double[] marks) {
        if (marks.length != 5) {
            throw new IllegalArgumentException("There must be exactly 5 subjects.");
        }

        // Check if any mark is negative or greater than 100
        for (double mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks should be between 0 and 100.");
            }
        }

        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate the average marks
    public void calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        this.average = total / marks.length;
    }

    // Method to calculate grade based on average
    public void calculateGrade() {
        if (average >= 90) {
            this.grade = 'A';
        } else if (average >= 80) {
            this.grade = 'B';
        } else if (average >= 70) {
            this.grade = 'C';
        } else if (average >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }

    // Getter methods
    public double getAverage() {
        return average;
    }

    public char getGrade() {
        return grade;
    }
}

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store student information
        String name = "";
        int rollNo = 0;
        double[] marks = new double[5];

        try {
            // Prompting user for input
            System.out.print("Enter student name: ");
            name = scanner.nextLine();

            System.out.print("Enter student roll number: ");
            rollNo = scanner.nextInt();

            // Prompting for marks for 5 subjects
            System.out.println("Enter marks for 5 subjects (each between 0 and 100): ");
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter mark for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }

            // Create a Student object and calculate average and grade
            Student student = new Student(name, rollNo, marks);
            student.calculateAverage();
            student.calculateGrade();

            // Display student information
            student.displayStudentInfo();

        } catch (InputMismatchException e) {
            // Handle non-numeric input
            System.out.println("Error: Please enter valid numeric values for roll number and marks.");
        } catch (IllegalArgumentException e) {
            // Handle invalid marks (negative or greater than 100)
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected errors
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
