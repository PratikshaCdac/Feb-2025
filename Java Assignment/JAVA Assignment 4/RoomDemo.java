import java.util.Scanner;

class Room
{
	int height;
	int width;
	int breadth;
	public Room(int height,int width,int breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	public int volume(){
		return height*width*breadth;
	}
	
}
public class RoomDemo{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int height=sc.nextInt();
            int width=sc.nextInt();
            int breadth=sc.nextInt();
			Room r=new Room(height,width,breadth);
			System.out.println("Volume is"+r.volume());
		}
	}
	
}
