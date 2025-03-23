class Box{
private double height;
private double width;
private double breadth;
public Box(double height,double width,double breadth)
{
this.height=height;
this.width=width;
this.breadth=breadth;
}
public double getVolume() {
return height*width*breadth;
}
public double getArea(){
return 2 * (height * width + width * breadth + height * breadth);
}
public static void main(String[] args)
{
Box b1=new Box(12.0,3.0,4.0);
Box b2=new Box(12.0,32.0,4.0);
System.out.println("Volume of the box is: "+b1.getVolume());
System.out.println("Area of the box is: "+b1.getArea());
}
}