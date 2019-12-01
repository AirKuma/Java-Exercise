package comparableclass;

public class Comparableclass {

    public static void main(String[] args) 
    {
        ComparableRectangle[] Rectangles = 
        {
            new ComparableRectangle(3.4,5.4),
            new ComparableRectangle(13.24,55.4),
            new ComparableRectangle(7.4,35.4),
            new ComparableRectangle(1.4,25.4)
        };
        System.out.println(Rectangles[0].compareTo(Rectangles[1]));
        System.out.println(Rectangles[2].compareTo(Rectangles[3]));
        
        java.util.Arrays.sort(Rectangles);
        for(Rectangle rectangle: Rectangles)
        {
            System.out.println(rectangle+" ");
        }
        System.out.println(Rectangles[0].compareTo(Rectangles[1]));
        System.out.println(Rectangles[2].compareTo(Rectangles[3]));
    }
}
class Rectangle
{
    double w,h;
    
    Rectangle()
    {
        
    }
    Rectangle(double w,double h)
    {
        this.h = h;
        this.w = w;
    }
    double getarea()
    {
        return h * w;
    }
    public String toString()
    {
        return "width: "+w+" height: "+h;
    }
}
class ComparableRectangle extends Rectangle implements Comparable< ComparableRectangle>
{
    public  ComparableRectangle(double w,double h)
    {
        super(w,h);
    }
    @Override
    public int compareTo(ComparableRectangle o) 
    {
        if(getarea() > o.getarea())
            return 1;
        else if(getarea() < o.getarea())
            return -1;
        else 
            return 0;
    }
    public String toString()
    {
        return super.toString()+" area: "+getarea();
    }
}