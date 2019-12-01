package  mytest;
import java.util.Random;
import java.util.Scanner;
public class MyTest {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      
      //boolean hasWinner = false;
      int you = -1;   // -1給一ㄍ初始值，無意義
      int com = -1;
      do{
     
      System.out.print("1.剪刀\t2.石頭\t3.布: ");
      you = input.nextInt();
      
      com = 1 + 1*rand.nextInt(3); // 1+(int)(Math.random()*3)
       
      if(you == 1)
           System.out.println("剪刀");
           else if(you == 2)
                System.out.println("石頭");
                 else
                    System.out.println("布");
       
      switch(com)
      {
          case 1: System.out.println("剪刀");
                  break;
          case 2: System.out.println("石頭");
                  break;
          case 3: System.out.println("布");
                  break;   
      }
      if(you == com)
           System.out.println("平手");
           else if((you == 1 && com == 3) || (you == 2 && com == 1 ) || ((you == 3 && com == 2 )))
                  System.out.println("你贏ㄌ");
                  else
                       System.out.println("你輸ㄌ");
               
      }
      while(you == com);
   }
}