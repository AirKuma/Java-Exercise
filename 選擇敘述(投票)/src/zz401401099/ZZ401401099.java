package zz401401099;

import java.util.Scanner;
public class ZZ401401099 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter the number: ");
        number = input.nextInt();
        
        switch(number){
            case 1:System.out.println("小明");
                   break;
            case 2:System.out.println("小華");
                      
            case 3:System.out.println("小張");
                   break;
            default:System.out.println("廢票");
                
       }
        
        if(number == 1)
            System.out.println("小明");
        else if(number  == 2)
            System.out.println("小華");
        else if(number  == 3)
            System.out.println("小張");
        else
            System.out.println("廢票");
   }
}
