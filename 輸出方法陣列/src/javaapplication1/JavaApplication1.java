package javaapplication1;


public class JavaApplication1 {

    public static void main(String[] args) 
    {
       int arr[] = {12,25,32,42};
       print_arr(arr);
       
       for(int i = 0;i < arr.length;i++)
           System.out.print(arr[i]+" ");
    }
    public static void print_arr(int n[])
    {  
       for(int i = 0 ;i < n.length;i++)
       {
           System.out.print(n[i]+" ");
           n[i] *= 2;
       }
       System.out.println();
    }
}
