package g596565656;

import java.util.Scanner;


public class G596565656 {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
      
       int i,sum = 0,j = 2,k = 1,sum2 = 0 ;
      
       System.out.print("請輸入一個數: ");
       i = input.nextInt();
      
    
      while(j <= i)
      {
         sum += j;
         j += 2;
      }
      
      do
      {
         sum2 +=k;
          k += 2;
      }
         while(k <= i);
              System.out.println("偶數Sum = "+sum);
              System.out.println("奇數Sum = "+sum2);
    }
              
      
}

