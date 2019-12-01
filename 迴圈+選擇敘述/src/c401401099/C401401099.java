package c401401099;

import java.util.Scanner;


public class C401401099 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int number,i = 1,a = 0,b = 0,c = 0 ,d = 0 ;
        System.out.println("小明為1號");
        System.out.println("小華為2號");
        System.out.println("小張為3號\n");
        
        while(i <= 10)
        {
             System.out.print("請輸入候選人號碼: ");
             number = input.nextInt();
             i++;
            
            switch(number)
            {
                case 1:System.out.println("小明 + 1 票");
                       a +=1;
                       break;
                case 2:System.out.println("小華 + 1 票");
                       b +=1;
                       break;
                case 3:System.out.println("小張 + 1 票");
                       c +=1;
                       break;
                default:System.out.println("廢票 + 1 票");
                        d += 1;
                
             }
          System.out.println("小明 "+a+" 票");
          System.out.println("小華 "+b+" 票");
          System.out.println("小張 "+c+" 票");
          System.out.println("廢票 "+d+" 票");
         }
        
        
  }
}
