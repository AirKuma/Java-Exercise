package aexception;

import java.util.Scanner;

public class AException {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //1
        System.out.println("1");
        System.out.print("請輸入兩個數: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        try
        {
            if(b == 0)
                throw new ArithmeticException("Divisor cannot by zero");
            System.out.println(a+" / "+b+" = "+a/b);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("除數不可為零");
        }
        
        System.out.println("Exception continues ...");
        
        //2
        System.out.println("2");
        try
        {
	      int value = 30;
              if (value < 40)
	      throw new Exception("value is too small");
        }
        catch (Exception ex) 
        {
	      System.out.println(ex.getMessage());
        }
        
	System.out.println("Continue after the catch block");
        
        //3
        System.out.println("3");
        try 
        {
	        int[] list = new int[10];
	        System.out.println("list[10] is " + list[10]);
	}
	catch (ArithmeticException ex) 
        {
		System.out.println("ArithmeticException");
	}
	catch (RuntimeException ex)
        {
		System.out.println("RuntimeException");
	}
	catch (Exception ex) 
        {
	        System.out.println("Exception");
	}
        
        //4
        System.out.println("4");
        try 
        {
		method();
		System.out.println("After the method call");
	}
	catch (ArithmeticException ex) 
        {
		System.out.println("ArithmeticException");
	}
	catch (RuntimeException ex) 
        {
		System.out.println("RuntimeException");
	}
	catch (Exception e) 
        {
		System.out.println("Exception");
	}
    }
    //4
    static void method() throws Exception
    {
	 System.out.println(1 / 0);
    }
}
