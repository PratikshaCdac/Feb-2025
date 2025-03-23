class Box{
int height;
int width;
int breadth;
public Box(int height, int width, int breadth)
{
this.height=height;
this.width=width;
this.breadth=breadth;
}
public int getVolume() 
{
return height*width*breadth;
}
public int  getArea() {
return 2 * (height * width + width * breadth + height * breadth);
}
}

public class main1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        
        // Input dimensions for the first box
        System.out.println("Enter the dimensions for Box 1:");
        System.out.print("Enter height: ");
        int height1 = sc.nextInt();
        System.out.print("Enter width: ");
        int width1 = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth1 = sc.nextInt();
        
        // Create the first box object using the user input
        Box box1 = new Box(height1, width1, breadth1);

        // Display the volume and surface area of the first box
        System.out.println("\nBox 1:");
        System.out.println("Volume: " + box1.getVolume() + " cubic units");
        System.out.println("Surface Area: " + box1.getArea() + " square units");

        System.out.println("\nEnter the dimensions for Box 2:");
        System.out.print("Enter height: ");
        int height2 = sc.nextInt();
        System.out.print("Enter width: ");
        int width2 = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth2 = sc.nextInt();
        Box box2 = new Box(height2, width2, breadth2);
        System.out.println("\nBox 2:");
        System.out.println("Volume: " + box2.getVolume() + " cubic units");
        System.out.println("Surface Area: " + box2.getArea() + " square units");
        
	}
	
}