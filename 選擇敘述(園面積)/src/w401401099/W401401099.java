package w401401099;
import java.util.Scanner; 

public class W401401099 {

    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double radius,area;
       
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        
        if(radius<=0){
      
        System.out.println("Enter error");
     }
        else{
            area = radius*radius*3.1415926;
            System.out.println("Area = "+area);
        }
    }
}
