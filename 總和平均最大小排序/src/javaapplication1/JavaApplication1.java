package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int a[] = new int[10];
        int sum = 0,max = 0,min = 101;
        
        for(int i = 0;i < a.length;i++)
        {
            a[i] = (int)(Math.random() * 100 + 1);
            System.out.print(a[i]+" ");
            sum += a[i];
            
            if(a[i] > max)
                max = a[i];        
            
            if(a[i] < min)
                min = a[i];
        }
        System.out.println();
        for(int i = 0;i < a.length;i++)
        {
            for(int j = i + 1;j < a.length;j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0;i < a.length;i++)      
             System.out.print(a[i]+" ");
        System.out.println();
                  
        double ave = sum / 10.0;
        System.out.println("sum  = "+sum);
        System.out.println("ave  = "+ave);
        System.out.println("max  = "+max);
        System.out.println("min  = "+min);
                
   
   
    }
}
