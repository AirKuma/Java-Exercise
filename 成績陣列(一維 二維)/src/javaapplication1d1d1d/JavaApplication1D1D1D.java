package javaapplication1d1d1d;

import java.util.Scanner;

public class JavaApplication1D1D1D {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // 1 維陣列       
        double scores[] = new double[5];
        scores[3] =0;
            
        for(int i = 0;i < scores.length - 2;i++)
        {
            System.out.print("請輸入第 "+(i + 1)+" 個分數: ");
            scores[i] = input.nextDouble();
            scores[3] += scores[i];
        }
        scores[4] = scores[3] / 3.0; 
        System.out.println("國文分數 = "+scores[0]);
        System.out.println("英文分數 = "+scores[1]);
        System.out.println("數學分數 = "+scores[2]);
        System.out.println("總分 = "+scores[3]);
        System.out.println("平均 = "+scores[4]);
        
        // 2 維陣列
    	//double Math, English, Chinese, total, average;
    	double score[][] = new double [3][5];   	
    	for(int i = 0; i < score.length; i++)
    	{
    	   int total = 0;
    	   for(int j = 0; j < score[i].length - 2; j++)
    	   {
    	      System.out.printf("請輸入第 %d 個學生第 %d 個成績: ", (i+1), (j+1));
    	      score[i][j] = input.nextDouble();
    	      total += score[i][j];
    	   }
    	   score[i][score[i].length - 2] = total;
    	   score[i][score[i].length - 1] = total / 3.0;
        }
    	for(int i = 0; i < score.length; i++)
    	{
    	   System.out.printf("第 %d 個學生成績、總分、平均: ", (i+1));
    	   for(int j = 0; j < score[i].length; j++)
    	   {
    	      System.out.printf("%.1f  ", score[i][j]);
    	   }
    	   System.out.println();
        }
        // 2 維陣列 + 方法
        //double Math, English, Chinese, total, average;
        double scoreS[][] = new double [2][5];

    	input_score(scoreS);
    	printf_score(scoreS);
    }
    // 2 維陣列 + 方法(方法)
    public static void printf_score(double arr[][])
    {
	 for(int i = 0; i < arr.length; i++)
    	 {
    	    System.out.printf("第 %d 個學生成績、總分、平均: ", (i+1));
    	    for(int j = 0; j < arr[i].length; j++)
    	    {
    	        System.out.printf("%.1f  ", arr[i][j]);
    	    }
    	    System.out.println();
    	}
   }
   public static void input_score(double arr[][])
   {
	 Scanner input = new Scanner(System.in);
	 for(int i = 0; i < arr.length; i++)
    	 {
    	    int total = 0;
    	    for(int j = 0; j < arr[i].length-2; j++)
    	    {
    	       System.out.printf("請輸入第 %d 個學生第 %d 個成績: ", (i+1), (j+1));
    	       arr[i][j] = input.nextDouble();
    	       total += arr[i][j];
    	    }
    	    arr[i][arr[i].length - 2] = total;
    	    arr[i][arr[i].length - 1] = total / 3.0;
    	}
   }
}
