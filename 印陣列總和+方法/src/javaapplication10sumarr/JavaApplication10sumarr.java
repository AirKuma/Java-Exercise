package javaapplication10sumarr;

import java.util.Scanner;

public class JavaApplication10sumarr {

   
    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);
         
         //2
         int sarr[] = new int[10],total = 0;
         
         System.out.print("Enter ten number: ");
         for(int i = 0;i < sarr.length;i++)
         {
             sarr[i] = input.nextInt();
             total += sarr[i];
         }
         System.out.println("The array is: ");
         for(int k :sarr)
             System.out.print(k+" ");
         System.out.println();
         
         System.out.println("The total is: "+total);
         
         //2 -2
         int m[] = getarr();      
         print(m);
         System.out.println("The total is: "+total(m));
       
    }
    public static int[] getarr()
    {
        Scanner input = new Scanner(System.in);
        
         int m[] = new int[10];
         System.out.print("Enter ten number: ");
         
         for(int i = 0;i < m.length;i++)        
             m[i] = input.nextInt();
         
         return m;        
    }
    public static void print(int m[])
    {
        System.out.println("The array is: ");
        for(int i = 0;i < m.length;i++)
            System.out.print(m[i]+" ");
        System.out.println();
    }
    public static int total(int m[])
    {
         int total = 0;
         for(int i = 0;i < m.length;i++)               
             total += m[i];
         
         return total;
    }
}
