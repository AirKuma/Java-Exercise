package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) 
    {
       //1
        for(int i = 5;i > 0;i--)
       {
           for(int j = 5 - i;j < 5;j++)         
               System.out.print("*");
           
           System.out.println();
       }
       System.out.println("\n");
       
       //2
        for(int i = 1;i <= 5;i++)
       {
           for(int j = 5 - i;j < 5;j++)          
               System.out.print("*");
           
           System.out.println();
       }
        System.out.println("\n");
        
        //3
         for(int i = 5;i > 0;i--)
       {
          for(int k = i ;k < 5;k++)
               System.out.print(" ");
           
           for(int j = 5 - i;j < 5;j++)           
               System.out.print("*");
           
           System.out.println();
       }
       System.out.println("\n");
       
       //4
        for(int i = 1;i <= 5;i++)
       {
           for(int k = i;k < 5;k++)
               System.out.print(" ");
           
           for(int j = 5 - i;j < 5;j++)           
               System.out.print("*");
           
           System.out.println();
       }
       System.out.println("\n");
        
        //5
          for(int i = 5;i > 0;i--)
       {
          for(int k = i ;k < 5;k++)
               System.out.print(" ");
           
           for(int j = 5 - i;j < 5;j++)
               System.out.print("*");
           
           for(int g = 5 - i;g < 4;g++)
               System.out.print("*");
                     
           System.out.println();
       }
       System.out.println("\n");
       
        //6
        for(int i = 1;i <= 5;i++)
       {
           for(int k = i;k < 5;k++)
               System.out.print(" ");
           
           for(int j = 5 - i;j < 5;j++)           
               System.out.print("*"); 
       
           for(int g = 5 - i;g < 4;g++)
               System.out.print("*");
           
           System.out.println();
       }
        System.out.println("\n");
        
        //7
         for(int i = 1;i <= 5;i++)
       {
           for(int k = i;k < 5;k++)
               System.out.print(" ");
           
           for(int j = 5 - i;j < 5;j++)           
               System.out.print("*"); 
       
           for(int g = 5 - i;g < 4;g++)
               System.out.print("*");
           
           System.out.println();
       }
          for(int i = 4;i > 0;i--)
       {
          for(int k = i ;k < 5;k++)
               System.out.print(" ");
           
           for(int j = 4 - i;j < 4;j++)
               System.out.print("*");
           
           for(int g = 4 - i;g < 3;g++)
               System.out.print("*");
                     
           System.out.println();
       }
}
}