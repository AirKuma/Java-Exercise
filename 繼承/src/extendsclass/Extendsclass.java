package extendsclass;

public class Extendsclass {

    public static void main(String[] args) 
    {
       Circle c = new Circle(1);
       System.out.println("A circle "+c.toString());
       System.out.println("color is: "+c.getcolor());
       System.out.println("r is: "+c.getr());
       System.out.println("area is: "+c.getarea());
       System.out.println("diameter is: "+c.getdiameter());
       System.out.println();
       
       Rectangle re = new Rectangle(2,4);
       System.out.println("A Rectangle "+re.toString());
       System.out.println("area is "+re.getarea());
       System.out.println("perimeter is "+re.getperimeter());
       System.out.println();
       
       display(new Circle(1,"red",false));
       display(new Rectangle(1,1,"black",true));
    }
    public static void display(Simple object)
    {
        System.out.println("created on "+object.getdate()+" color is "+object.getcolor()+" Is filled?: "+object.isfill());
    }
}
class Simple
{
    private String color = "white";
    private boolean fill;
    private java.util.Date date;
    
    public Simple()
    {
        date = new java.util.Date();
    }
     public Simple(String color,boolean fill)
     {
          date = new java.util.Date();
          this.color = color;
          this.fill = fill;
     }
     public String getcolor()
     {
         return color;
     }
     public void setcolor(String color)
     {
         this.color = color;
     }
     public boolean isfill()
     {
         return fill;
     }
     public void setfill(boolean fill)
     {
         this.fill = fill;
     }
     public java.util.Date getdate()
     {
         return date;
     }
     public String toString()
     {
         return "created on " + date + "\ncolor: " + color + " and filled: " + fill;
     }
}
class Circle extends Simple
{
    private double r;
    
    public Circle()
    {
        
    }
    public Circle(double r)
    {
        this.r = r;
    }
    public Circle(double r,String color,boolean fill)
    {
        this.r = r;
        setcolor(color);
        setfill(fill);
    }
    public double getr()
    {
        return r;
    }
    public void setr(double r)
    {
        this.r = r;
    }
    public double getarea()
    {
        return r * r * Math.PI;
    }
    public double getdiameter()
    {
        return 2 * r;
    }
    public double getperimeter()
    {
        return 2 * r * Math.PI;
    }
    public void print()
    {
        System.out.println("created on: "+getdate()+" and r is: "+r);
    }
}
class Rectangle extends Simple
{
    private double w;
    private double h;
    
    public Rectangle()
    {
        
    }
    public Rectangle(double w,double h)
    {
        this.w = w;
        this.h = h;
    }
    public Rectangle(double w,double h,String color,boolean fill)
    {
        this.w = w;
        this.h = h;
        setcolor(color);
        setfill(fill);
    }
    public double getw()
    {
        return w;
    }
    public void setw(double w)
    {
        this.w = w;
    }
    public double geth()
    {
        return h;
    }
    public void seth(double h)
    {
        this.h = h;
    }
    public double getarea()
    {
        return w * h;
    }
    public double getperimeter()
    {
        return 2 * (w + h);
    }
}