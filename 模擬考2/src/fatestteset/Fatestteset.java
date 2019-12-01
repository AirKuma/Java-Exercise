package fatestteset;

import java.util.Scanner;

public class Fatestteset {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // 1
        System.out.print("請輸入一個數值n: ");
        int n = input.nextInt();
        
        int n1 = 1;
        for(int i = 1;i <= n;i++)
            n1 *= i;
        
        System.out.println("n! = "+n1);
        
        // 2
        System.out.print("Enter an integer between 10 and 9999: ");
        int dig = input.nextInt();
        
        int p = 1, b = 1;
        int pro = 0,pro1 = 0;
        
        for(int q = 1;q <= dig;q *= 10)
        {    
            pro = (int) (dig % Math.pow(10,b));
            pro1 =(int) (pro / Math.pow(10,b - 1));
            p *=  pro1;      
            b++;
        }             
        System.out.println("The product of the digits is "+p);
        
         //3
         int ram[] = new int[10];
         
         System.out.printf("The random generated values are: ");
        
         for(int i = 0;i < ram.length;i++)
         {
              ram[i] = (int)(Math.random()*101);
              System.out.print(ram[i]+" ");
         }
         System.out.println();
         System.out.print("Original order is: ");
              for(int k : ram)
         System.out.printf("%d ", k);       
         System.out.println();
         
          for(int i = 0;i < ram.length;i++)
          {                 
              for(int j = i + 1;j < ram.length;j++)
              {                                    
                  if(ram[i] > ram[j])
                  {   
                      int temp = ram[i];  
                      ram[i] = ram[j];  
                      ram[j] = temp;                              
                  }                 
              }                        
          }  
          System.out.print("after sort: ");
                for(int k : ram)
      	  System.out.printf("%d ", k);
          System.out.println();
          
         //4
         System.out.print("Enter two number: ");
         int a = input.nextInt();
         int a2 = input.nextInt();
       
         int k = 2,gcd = 1;
         while(k <= a && k <= a2)
         {
             if(a % k == 0 && a2 % k == 0)
                 gcd = k;
             k++;
         }
         System.out.println("最大公因數：　"+gcd);
         
         int lcm = a * a2 / gcd;
         System.out.println("最小公倍數：　"+lcm);
         
       //5
       int arr1[] = new int[5];
       int arr2[] = new int[5];
       int mul[] = new int[5];
       int total = 0;
       
       for(int i = 0;i <arr1.length;i++)
       {
            arr1[i] = (int)(Math.random()*11);  
            arr2[i] = (int)(Math.random()*11);
            mul[i] =  arr1[i] *  arr2[i];
            total += mul[i];
       }
       System.out.print("Arrar1: ");
       for(int k1 : arr1)
      	  System.out.printf("[%d] ", k1);
       System.out.println();
       
       System.out.print("Arrar2: ");
       for(int k2 : arr2)
      	  System.out.printf("[%d] ", k2);
       System.out.println();
       
       System.out.print("相乘後: ");
       for(int k3 : mul)
      	  System.out.printf("[%d] ", k3);
       System.out.println();
       
       System.out.println("Total = "+total);
       
         //6
         double pt = 1,pq,amo = 0;
         
         while(pt != 0)
         {
             System.out.print("Please select the product type(1, 2, 3, 4, 5, 0 will stop this shopping)： ");
             pt = input.nextDouble();   
             
             if(pt == 0)
                 break;
             
             System.out.print("Please input the purchasing quantity:  ");
             pq = input.nextDouble();   
             
             if(pt == 1)
                 amo += pq * 2.982;
             else if(pt == 2)
                 amo += pq * 4.503;
             else if(pt == 3)
                 amo += pq * 9.983;
             else if(pt == 4)
                 amo += pq * 4.492;
             else
                 amo += pq * 6.874;
         }
         System.out.printf("Total amount is %.2f\n",amo);
         
         // 7
         System.out.print("The number of star: ");
         int star = input.nextInt();
         
         star(star);
         mul99();
         star(star);
         
          // 8         
          System.out.print("Inter a value: ");
          int va = input.nextInt();
          System.out.print("The Prime number within "+va+" are: ");
          prime(va);
    }
    // 7
     public static void star(int star)
     {
          for(int i = 1;i <= star;i++)
              System.out.print("*");
           System.out.println();
     }
     public static void mul99()
     {
         for(int i = 1;i <= 9;i++)
         {
             for(int j = 1;j <= 9;j++) 
                 System.out.printf("%d * %d = %2d   ",j,i,i * j);           
             System.out.println();
         }
     }
     // 8
     public static void prime(int val)
     {
          for(int i = 2;i <= val;i++)
          {
              boolean isp = true;
              for(int j = 2;j <= Math.pow(i,0.5);j++)
              {
                  if(i % j == 0)
                  {
                      isp = false;
                      break;
                  }
              }
              if(isp)
                  System.out.print(i+" ");            
          }
     }
}
