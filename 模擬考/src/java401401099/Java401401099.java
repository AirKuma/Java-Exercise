package java401401099;

import java.util.Scanner;

public class Java401401099 {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //1
       System.out.println(1);
       int a = (int)(Math.random()*101),b = (int)(Math.random()*101),answer;
       
       System.out.print("What is the sum of "+a+" and "+b+" ?");
       answer = input.nextInt();
       
       if(answer == a+b)
           System.out.println("Your answer is correct!");
           else
               System.out.println("Your answer is wrong!");
        System.out.println();    
        
        //2
        System.out.println(2);          
        int coin = (int)(Math.random()*2),guess;
        
        System.out.print("Please guess the head or tail of a coin. If that is head enter 0 else enter 1: ");
        guess = input.nextInt();
        
        if(guess == coin)
            System.out.println("You are correct!");
            else
                System.out.println("You are wrong!");
        System.out.println();   
        
        //4
      System.out.println(4);       
      
      int f,c,i ;
      double F,C,I;
      
      while(true)
      {
      System.out.print("請輸入華氏或攝氏(華氏輸入1攝氏輸入2): ");
      i = input.nextInt();
      
        if(i == 1 || i == 2)
             break;
        else 
            System.out.println("請輸入1或2");
      }
      if(i == 1)
      {
          System.out.print("請輸入華氏溫度: ");
          F = input.nextDouble();
          C = 5.0 / 9 * (F - 32); 
          System.out.println("攝氏溫度= "+C);
      }
          else
          {
                System.out.print("請輸入攝氏溫度: ");
                C = input.nextDouble();
                F = C * 9.0 / 5 + 32;
                System.out.println("華氏溫度= "+F);
          }
       System.out.println();    
       
       //5
      System.out.println(5);    
      int day;
      
      System.out.print("Please enter the day: ");
      day = input.nextInt();
      
      switch(day)
      {
          case 1:System.out.println("今天要上班");
                 break;
          case 2:System.out.println("今天要上班");
                 break;
          case 3:System.out.println("今天要上班");
                 break;
          case 4:System.out.println("今天要上班");
                 break;     
          case 5:System.out.println("今天要上班");
                 break;
          case 6:System.out.println("今天休息");
                 break;
          case 7:System.out.println("今天休息");
                 break;
          default:System.out.println("輸入錯誤");
      }
    }
}
