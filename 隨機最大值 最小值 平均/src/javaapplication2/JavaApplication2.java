package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args)
    {
        int max = 0,min = 101,sum = 0;
        double average = 0;
        
        for(int i = 0;i < 10;i++)
        {
           int score = (int)(Math.random()*101);
           sum += score;
           System.out.println(score); 
           max = Math.max(max, score);
           min = Math.min(min, score);
        }
        average = sum / 10.0;
        System.out.println("max = "+max); 
        System.out.println("min = "+min); 
        System.out.println("average = "+average); 
}
}