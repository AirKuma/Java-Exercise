package pkg401401099a;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args)
    {
        
        
        String pw = "ives";
        
        for(int i = 0;i < 3;i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("請輸入密碼: ");
          
            
            if(pw.equals(input.next()))
            {
                System.out.println("您已經順利登入成功!!");
                break;
            }
            else if(i == 2)
                System.out.println("錯誤已達三次!! 謝謝再連絡!!");
            else
                System.out.println("密碼錯誤!!請再輸入一遍!!");
       }
}
}
