package javaapplication1array;

import java.util.Arrays;

public class JavaApplication1array {
  
    public static void main(String[] args) 
    {
       
       int arr[] = {13, 26, 2, 64, 34, 45, 21, 42};
		
       System.out.print("before sort: ");
       for(int k : arr)
            System.out.printf("%d ", k);       
       System.out.println();
       
       
       for(int i = 0;i < arr.length;i++)
       {   
           for(int j = i + 1;j < arr.length;j++)
           {              
               if(arr[i] > arr[j])
               {   
                  int temp = arr[i];  
                  arr[i] = arr[j];  
                  arr[j] = temp;                              
               }  
          }   
       }  
       
       // = Arrays.sort(arr);
       
       System.out.print("after sort: ");
       for(int k : arr)
      	     System.out.printf("%d ", k);
       System.out.println();
    }
}
