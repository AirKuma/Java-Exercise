package totalarea;

public class Totalarea {

    public static void main(String[] args) 
    {
        Circ[] carr;
        carr = creatcarr();
        
        print(carr);
        
    }
    public static Circ[] creatcarr()
    {
         Circ[] carr = new  Circ[5];
         
         for(int i = 0;i < carr.length;i++)
         {
             carr[i] = new  Circ(i);
         }
         
         return carr;
    }
    public static void print(Circ[] arr)
    {
        System.out.println("r                           area");
        
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i].getr()+"                      "+arr[i].getarea());
        }
    }
}
class Circ
{
    private double r = 1;
    private static int numob = 0;
    
    public Circ()
    {
        numob++;
    }
    public Circ(double nr)
    {
        r = nr;
        numob++;
    }
    public double getr()
    {
        return r;
    }
    public void setr(double nr)
    {
        r = (nr >= 0) ? nr : 0;
    }
    public static int getnumob()
    {
        return numob;
    }
    public double getarea()
    {
        return r * r *Math.PI; 
    }
}

