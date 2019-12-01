package javaapplication2d2d2d;

import java.util.Scanner;


public class JavaApplication2d2d2d {

   
    public static void main(String[] args)
    {
      int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("==高鐵票價查詢系統==");
		System.out.println("0=台北，1=板橋，2=桃園，3=新竹");
		System.out.println("4=台中，5=嘉義，6=台南，7=左營");
		System.out.print("請輸入起站代碼:> ");
		i = sc.nextInt();
		System.out.print("請輸入終站代碼:> ");
		j = sc.nextInt();
		System.out.print("請輸入車廂種類(0 = 標準車廂; 1 = 商務車廂):> ");
		k = sc.nextInt();
                
      int [][] price1 = {{0,40,160,290,100,1080,1350,1490},
	                {205,0,130,260,670,1050,1320,1460},
		        {350,320,0,130,540,920,1190,1330},
	   	        {510,470,320,0,410,790,1060,1200},
	   	        {1000,965,805,655,0,380,650,790},
	   	        {1455,1420,1260,1110,615,0,280,410},
	   	        {1780,1740,1590,1430,940,495,0,140},
	   	        {1950,1910,1760,1600,1110,655,325,0}};
    print_array(price1,i,j,k);
    }
    public static void print_array(int[][] price,int i,int j,int k) 
    {		
		if(k == 0 && i < j)
			System.out.println("票價 = "+price[i][j]);
		else if(k == 1 && i > j)
			System.out.println("票價 = "+price[i][j]);
		else
			System.out.println("票價 = "+price[j][i]);
   }
}
