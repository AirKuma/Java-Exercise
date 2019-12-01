package a401401099;
import java.util.Scanner;

public class A401401099 
{

   
    public static void main(String[] args)
    {
       //建立 Scanner物件
        Scanner input = new Scanner(System.in);
        
        double Math,English,Chinese,total,average;
        
        
        System.out.print("請輸入 Math:");
        Math = input.nextInt();     
        System.out.print("請輸入 English:");
        English= input.nextFloat();  
        System.out.print("請輸入 Chinese :");
        Chinese = input.nextDouble();
        System.out.println();
        
        total =  Math + English + Chinese;
        average = total/3;
       
        System.out.println("輸入的English: "+English);
        System.out.println("輸入的Math: "+Math);
        System.out.println("輸入的,Chinese: "+Chinese);
        
        System.out.println(" total: "+ total);
        System.out.println(" average: "+ average);
        
        
        
        
    }
}
