package aa401401099;
import java.util.Scanner;
public class AA401401099 {

   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       double high,weight,BMI;
       
       System.out.print("請輸入身高(cm):");
       high = input.nextDouble()*0.01;
       System.out.print("請輸入體重(kg):");
       weight = input.nextDouble();
       
       BMI = weight / (high*high);
       System.out.println("BMI: "+BMI);
       
       if(BMI < 18.5)
           System.out.println("體重過輕");
       else if(18.5<=BMI && BMI<24)
           System.out.println("正常範圍");
       else if(24 <=BMI && BMI <27)
           System.out.println("過重");
       else if(27 <=BMI && BMI <30)
           System.out.println("輕度肥胖");
       else if(30 <=BMI && BMI <35)
           System.out.println("中度肥胖");
       else if(35 <=BMI )
           System.out.println("重度肥胖");
    }
}
