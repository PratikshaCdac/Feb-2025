public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    
    public static void main(String[] args) { 
        Main obj = new Main();  // Create an instance of Main class
        obj.display();          // Call the non-static display() method
        obj.display(5);         // Call the non-static display(int) method
    } 
}