package javaapplication1maxcr;

import java.util.Scanner;

public class JavaApplication1maxcr {
  
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //1
        int arr[][] = new int[4][5],sum1 = 0,index = 0,sum2 = 0;
        
        System.out.print("Enter 20 number: ");
        for(int r = 0;r < arr.length;r++)
        {
            for(int c = 0;c < arr[r].length;c++)
                arr[r][c] = input.nextInt();
        }
        
        for(int c = 0;c < arr[0].length;c++)     
           sum1 += arr[0][c];
        
        for(int r = 1;r < arr.length;r++)
        {
            int sum = 0;
            for(int c = 0;c < arr[r].length;c++)
                sum += arr[r][c];  
            
            if(sum1 < sum)
            {
                 sum1 = sum;
                 index = r + 1;
            }               
        }
        System.out.println("Row "+index+" has the maximum sum of "+sum1);
        
        for(int r = 1;r < arr.length;r++)
            sum2 += arr[r][0];
        
        for(int c = 1;c < arr[0].length;c++)
        {
            int sum = 0;
            for(int r = 0;r < arr.length;r++)
                sum += arr[r][c];  
            
            if(sum2 < sum)
            {
                 sum2 = sum;
                 index = c + 1;
            }               
        }
        System.out.println("Row "+index+" has the maximum sum of "+sum2);
        
    }
}
