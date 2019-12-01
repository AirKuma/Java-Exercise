package areaclass;

public class Areaclass {

    public static void main(String[] args) 
    {
       CTrapezoid obj = new CTrapezoid(6,10,8);
       obj.show();
       System.out.println("梯形面積為: " + obj.area());
    }
    
}
class CTrapezoid
{
    int upper;
    int base;
    int height;
    
    public CTrapezoid()
    {
         upper = 1 ;
         base = 1 ;
         height = 1 ;
    }
            
    public CTrapezoid(int u,int b,int h)
    {
         upper = u ;
         base = b ;
         height = h ;
    }
    double area()
    {
        return (upper + base) * height / 2;
    }
    public void show()
    {
        System.out.printf("upper: %d, base: %d, height: %d\n", upper, base, height);
    }

}
