package javaapplication125;


public class JavaApplication125 {

    public static void main(String[] args) 
    {
        int num[] = {3,8,2,7,12};
        printf_max(num);
        printf_min(num);
    }

    private static void printf_max(int[] arr) 
    {
        int max = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("max: "+max);
    }

    private static void printf_min(int[] arr) 
    {
         int min = 99999;
         for(int i = 0;i < arr.length;i++)
         {
             if(arr[i] < min)
                 min = arr[i];
         }
         System.out.println("min: "+min);     
    }
}
