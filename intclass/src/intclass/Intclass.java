package intclass;

public class Intclass {

    public static void main(String[] args)
    {
        //10.3
        MyInteger n1 = new MyInteger(13);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("13 is prime? " + n1.isPrime());
  
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));
  
        MyInteger n2 = new MyInteger(24);    
        System.out.println("77 is odd? " + n2.isOdd(77));
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 13? " + n1.equals(13));
    }
}
class MyInteger
{   
    int value;
   
    public MyInteger(int newValue)
    {
        value = newValue;
    }  
    public int getValue()
    {
        return value;
    }  
    public boolean isEven()
    {
        if(value % 2 ==0)
            return true;
        return false;
    } 
    public boolean isOdd()
    {      
        if(value % 2 != 0)
            return true;
        return false;
    } 
    public boolean isPrime()
    {
        for(int i = 2; i <= value / 2; i++)
        {
            if(value % i != 0)
                return true;
        }
        return false;
    }
    public static boolean isEven(MyInteger myInteger)
    {
        return myInteger.isEven(myInteger.getValue());
    }   
    public static boolean isOdd(MyInteger myInteger)
    {
        return myInteger.isOdd(myInteger.getValue());
    }  
    public static boolean isPrime(MyInteger myInteger)
    {
        return myInteger.isPrime(myInteger.getValue());
    }  
    public static boolean isEven(int value)
    {
        if(value % 2 == 0)
            return true;
        return false;
    } 
    public static boolean isOdd(int value)
    {
        if(value % 2 != 0)
            return true;
        return false;
    } 
    public static boolean isPrime(int value)
    {
        return isPrime(value);
    }  
    public boolean equals(int intValue)
    {
        return value == intValue;
    }
    public boolean equals(MyInteger myInteger)
    {
        return equals(myInteger.getValue());
    } 
    public static int parseInt(String s)
    {
        return Integer.parseInt(s);
    }
}
