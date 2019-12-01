package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {
 
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        
       int num[] = new int [100];
       num = random100(num);
       printf_num(num);
       printf_odd_numbers(num);
       print_even_numbers(num);
    }
    //1.1
    private static int[] random100(int arr[])
    {
        for(int i = 0;i < arr.length;i++)
            arr[i] = 1 +(int)(Math.random()*200);
        return arr;
    }
    //1.2(和1.1一樣)
    private static int random100(int arr)
    {
        for(int i = 0;i < arr;i++)
            arr = 1 +(int)(Math.random()*200);
        return arr;
    }

    private static void printf_num(int[]arr) 
    {     
        for(int i = 0;i < arr.length;i++)
        {
            System.out.printf("%-5d", arr[i]);
            if((i+1) % 10 == 0)
                System.out.println();         
        }
    }

    private static void printf_odd_numbers(int[] arr) 
    {
       int sum1 = 0;
       for(int i = 0;i < arr.length ;i++)
            if(arr[i] % 2 == 0)
               sum1 ++;
        System.out.println("偶數個數有 "+sum1+" 個");
    }

    private static void print_even_numbers(int[] arr)
    {
       int sum2 = 0;
       for(int i = 0;i < arr.length ;i++)
            if(arr[i] % 2 != 0)
               sum2 ++;
        System.out.println("奇數個數有 "+sum2+" 個");
    }
    
}
