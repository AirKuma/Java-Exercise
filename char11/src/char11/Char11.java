package char11;

import java.util.Scanner;

public class Char11 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //1
        Triangle t = new Triangle();
        
        System.out.println(t.toString());
        System.out.println("area is: "+t.getarea());
        System.out.println("perimeter is: "+t.getperimeter());
        System.out.println("color is: "+t.getColor());
        System.out.println("filled is: "+t.isFilled());
        System.out.println();
        
        //2
        Triangle t2 = new Triangle(3,4,5);
        t2.setColor("red");
        t2.setFilled(true);
             
        System.out.println(t2.toString());
        System.out.println("area is: "+t2.getarea());
        System.out.println("perimeter is: "+t2.getperimeter());
        System.out.println("color is: "+t2.getColor());
        System.out.println("filled is: "+t2.isFilled());
        System.out.println();
        
        //3
        System.out.print("Enter three sides: ");
        double a1 = input.nextDouble();
        double a2 = input.nextDouble();
        double a3 = input.nextDouble();
        System.out.print("Enter color: ");
        String colors = input.next();
        System.out.print("Whether the teiangle is filled?: ");
        boolean filled = input.nextBoolean();
        
        Triangle t3 = new Triangle(a1,a2,a3);
        t3.setColor(colors);
        t3.setFilled(filled);
        
        System.out.println(t3.toString());
        System.out.println("area is: "+t3.getarea());
        System.out.println("perimeter is: "+t3.getperimeter());
        System.out.println("color is: "+t3.getColor());
        System.out.println("filled is: "+t3.isFilled());
        
    }
}
class GeometricObject
{
    private String color;
    private boolean filled;

    public GeometricObject()
    {
       
    }
    public GeometricObject(String color, boolean filled) 
    {
	this.color = color;
	this.filled = filled;
    }
    public String getColor() 
    {
	return color;
    }
    public void setColor(String color) 
    {
	this.color = color;
    }
    public boolean isFilled() 
    {
	return filled;
    }
    public void setFilled(boolean filled) 
    {
	this.filled = filled;
    }
    public String toString() 
    {
	return "Color: " + color + "and filled: " + filled;
    }
}
class Triangle extends GeometricObject
{
    private double side1 = 1,side2 = 1,side3 = 1;
    
    public Triangle()
    {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    public Triangle(double s1,double s2,double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public double getside1()
    {
        return side1;
    }
    public void setside1(double side1)
    {
        this.side1 = side1;
    }
    public double getside2()
    {
        return side2;
    }
    public void setside2(double side2)
    {
        this.side2 = side2;
    }
     public double getside3()
    {
        return side3;
    }
    public void setside3(double side3)
    {
        this.side3 = side3;
    }
    public double getarea()
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
    public double getperimeter()
    {
        return side1 + side2 + side3;
    }
    public String toString()
    {
         return "Triangle side1 is: " + side1 + " side2 is : " + side2 + " side3 is : " + side3;
    }
}