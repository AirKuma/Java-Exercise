package onlyoneclass;

public class Onlyoneclass {
  
    public static void main(String[] args) 
    {
        Onlyoneclass c1 = new  Onlyoneclass();
        System.out.println("radius = "+c1.r+" area = "+c1.area()+" perimeter = "+c1.perimeter());
        
        Onlyoneclass c2 = new  Onlyoneclass(25,25);
        System.out.println("radius = "+c2.r+" area = "+c2.area()+" perimeter = "+c2.perimeter());
        
        c2.r = 100 ;
        c2.w = 100;
        System.out.println("radius = "+c2.r+" area = "+c2.area()+" perimeter = "+c2.perimeter());
        
        c2.setr(125,10);
        System.out.println("radius = "+c2.r+" area = "+c2.area()+" perimeter = "+c2.perimeter()); 
    }
    
    double r ,w;
    Onlyoneclass()
    {
        r = 1;
        w = 1;
    }
    Onlyoneclass(double newr ,double neww)
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
