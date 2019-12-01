package javaapplication2dto;

import java.util.Scanner;

public class JavaApplication2dto {
   
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       int x,y;
       System.out.print("Enter row and column: ");
       x = input.nextInt();       
       y = input.nextInt();
       
       int arr[][] = new int[x][y],tol = 0;
            
       for(int r = 0;r < arr.length;r++)
       {
           for(int c = 0;c < arr[r].length;c++)
           {
               System.out.printf("Enter arr[%d][%d]: ",r,c);
               arr[r][c] = input.nextInt();
               tol += arr[r][c];
           }         
       }       
       System.out.println("Total = "+tol);
    }
}
