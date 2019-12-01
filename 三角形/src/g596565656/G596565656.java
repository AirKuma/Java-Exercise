package g596565656;

import java.util.Scanner;

public class G596565656 {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
      
      for(int i = 1; i <= 8; i++) 
      {
          for(int j = i; j <= 8; j++)
          {
              System.out.print(" ");
          }
          for(int k = 1; k <= i; k++) 
          {
              System.out.print((int)(Math.pow(2, k))/2 +" ");
          }
          for(int q = i -1; q > 0; q--) 
          {
              System.out.print((int)(Math.pow(2,q))/2 +" "); 
          }
       System.out.println();
     }
 }
}
              
      

