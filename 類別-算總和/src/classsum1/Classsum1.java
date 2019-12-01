package classsum1;

public class Classsum1 {

    public static void main(String[] args) 
    {
        Caaa obj = new Caaa(5,8);
        
        // or
        obj.a = 5;
	obj.b = 8;
	obj.sum = obj.a + obj.b;
        
        System.out.println("a = "+obj.a+" b = "+obj.b+" sum = "+obj.sum());       
    }
}
class Caaa
{
   int a;
   int b;
   int sum;
   
   Caaa()
   {
       a = 1;
       b = 1;
   }
   Caaa(int na,int nb)
   {
       a = na;
       b = nb;
   }
   int sum()
   {
       return a + b;
   }  
}

