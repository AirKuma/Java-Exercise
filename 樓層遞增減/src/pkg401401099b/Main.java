package pkg401401099b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x,y = (int)(Math.random()*10+1);
        
        System.out.println("目前樓層: "+y); 
        
        System.out.print("請輸入目標樓層: ");
        x = input.nextInt();
        
        while(y != x)
        {
            if(x > y)
                y++;
            else
                y--;
            
            System.out.println(y); 
        }
   }
}
