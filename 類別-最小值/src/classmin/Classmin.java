package classmin;

import java.util.Scanner;

public class Classmin {

    public static void main(String[] args) 
    {     
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        AMin m = new AMin();
        m.getnumber();
        System.out.println("The min number is: "+m.min());
        
        AMin m2 = new AMin(5,7);
        m2.getnumber();
        System.out.println("The min number is: "+m2.min());
        
        AMin m3 = new AMin(a,b);
        m3.getnumber();
        System.out.println("The min number is: "+m3.min());
             
        reset(m3);
        m3.getnumber();
        System.out.println("The min number is: "+m3.min());     
    }
    public static void reset(AMin m30)
    {
          Scanner input = new Scanner(System.in);
            
          System.out.print("Enter two number: ");
          int a = input.nextInt();
          int b = input.nextInt();
          m30.setnumber(a, b);
    } 
}
class AMin
{
    private int x,y;
    
    AMin()
    {
        x = 0;
        y = 0;
    }
    AMin(int a,int b)
    {
        x = a;
        y = b;
    }
    public void getnumber()
    {
        System.out.println("a = "+x+" b = "+y);
    }
    public void setnumber(int a,int b)
    {
        x = a;
        y = b;
    }
    public int min()
    {
        if(x < y)
            return x;
        else
            return y;                    
    }
}
