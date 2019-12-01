package scoresdsdsd;

public class Scoresdsdsd {

    public static void main(String[] args)
    {
        int sale1[] = {13,21,17,26,0};
        int sale2[][] =  { {13,21,17,26,0},
                           {8,32,11,17,0} };
        System.out.println("              第一季  第二季  第三季  第四季   總和");
        add_sale(sale2);
        print_sale(sale2);
               
        System.out.println("                        業績 >= 15 換成 99");
        System.out.println("              第一季  第二季  第三季  第四季   總和");
        change_sale_15(sale2);
        add_sale_15(sale2);
        print_sale(sale2);
    }      
    public static void add_sale(int arr[][])
    {
          for(int i = 0;i < arr.length;i++)
          {
              int sum = 0;
              for(int j = 0;j < arr[i].length;j++)
              {
                  sum += arr[i][j];           
              }           
             arr[i][arr[i].length - 1] = sum;
          }         
     }
     public static void print_sale(int arr[][])
     {
         for(int i = 0;i < arr.length;i++)
         {
             System.out.printf("%d 業務的業績為: ",(i+1));
             for(int j = 0;j < arr[i].length;j++)
             {
                 System.out.printf("%-8d",arr[i][j]);            
             }  
             System.out.println();
         }
     }
     public static void change_sale_15(int arr[][])
     {
         for(int i = 0;i < arr.length;i++)
         {
             for(int j = 0;j < arr[i].length - 1;j++)
             {
                 if(arr[i][j] >= 15)
                      arr[i][j] = 99;
             }            
         }        
     }
    public static void add_sale_15(int arr[][])
    {
          for(int i = 0;i < arr.length;i++)
          {
              int sum = 0;
              for(int j = 0;j < arr[i].length -1;j++)
              {
                  sum += arr[i][j];           
              }           
              arr[i][arr[i].length - 1] = sum;
          }         
     }       
       
    
}
