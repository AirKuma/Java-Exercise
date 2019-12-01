package testtwoclass;

public class Testtwoclass {

    public static void main(String[] args) 
    {
        Secircle c1 = new  Secircle();
        System.out.println("radius = "+c1.r+" area = "+c1.area()+" perimeter = "+c1.perimeter());
        
        Secircle c2 = new  Secircle(25,25);
        System.out.println("radius = "+c2.r+" area = "+c2.area()+" perimeter = "+c2.perimeter());
        
        c2.r = 100;
        System.out.println("radius = "+c2.r+" area = "+c2.area()+" perimeter = "+c2.perimeter());
        
        c2.setr(125,10);
        System.out.println("radius = "+c2.r+" area = "+c2.area()+" perimeter = "+c2.perimeter()); 
    }
}
class Secircle
{
    double r ,w;
    Secircle()
    {
        r = 1;
        w = 1;
    }
    Secircle(double newr ,double neww)
    {
        r = newr;
        w = neww;
    }
    double area()
    {
        return r * r *  Math.PI + w;
    }
    double perimeter()
    {
        return 2 * r * Math.PI + w;
    }
    void setr(double newr,double neww)
    {
        r = newr;
        w = neww;
    }
}