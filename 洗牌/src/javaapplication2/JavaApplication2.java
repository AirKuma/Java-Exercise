package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) 
    {
         int arr[] = new int[42];
         
         for(int i = 0;i < arr.length;i++)
         {
             arr[i] = i + 1;
             System.out.print(arr[i]+" ");
         }
         for(int i = 0;i < arr.length;i++)
         {
             int r = (int)(Math.random() * arr.length);
             int temp = arr[i];
             arr[i] = arr[r];
             arr[r] = temp;
         }
         System.out.println();
         for(int i = 0;i < arr.length;i++)                 
             System.out.print(arr[i]+" ");
         
             
    }
}
