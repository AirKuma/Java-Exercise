package q401401099;
import java.util.Scanner; 

public class Q401401099 {

    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       double amount;
       int cents, dollars,dimes,nickels,pennies;
       
       System.out.print("Enter the amount :");
       amount = input.nextDouble();
       
      cents = (int)(amount*100);
      dollars = cents/100;
      dimes = cents%100/25;
      nickels = cents%100%25/10;
      pennies = cents%100%25%10;
       
      System.out.printf("The %d cents = %d dollars %d dimes %d nickels %d pennies\n",cents,dollars,dimes,nickels,pennies);
      System.out.println("The "+cents+" cents = "+dollars+" dollars "+dimes+" dimes "+ nickels+" nickels "+pennies+" pennies");
       
    }
}
