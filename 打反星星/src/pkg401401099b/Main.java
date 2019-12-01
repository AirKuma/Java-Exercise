package pkg401401099b;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("請輸入星星欄數: ");
        int line = input.nextInt();
        
        for(int i =1;i <= line;i++)
        {
            for(int j = line - i;j > 0;j-- )
            System.out.print(" "); 
            
            for(int j = 1;j <= i;j++)
            System.out.print("*"); 
            
            System.out.println();
        }
   }
}
