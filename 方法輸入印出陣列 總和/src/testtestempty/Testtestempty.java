package testtestempty;

import java.util.Scanner;

public class Testtestempty {

   
    public static void main(String[] args) 
    {
          Scanner input = new Scanner(System.in);
          
          int a[] = sum();
          pr(a);
          System.out.println("sum = "+sum(a));
        
      
         
         
      
    }
    public static int[] sum()
    {
        Scanner input = new Scanner(System.in);
        
        int a[] = new int[10];
        for(int i = 0;i < a.length;i++)
            a[i] = input.nextInt();       
        return a;
    }
    public static void pr(int c[])
    {
        for(int i = 0;i < c.length;i++)
            System.out.print(c[i]+" ");
    }
    public static int sum(int b[])
    {
        int sum = 0;
        for(int i = 0;i < b.length;i++)
            sum += b[i];
        return sum;
    }
    
    
}
