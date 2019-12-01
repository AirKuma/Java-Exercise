package javaapplication2;

import java.util.Random;

public class JavaApplication2 {

    public static void main(String[] args)
    {
        Random rand = new Random();
       //隨機 -4 ~ 8
        System.out.println((int)(-5+Math.random() * 14));
       
        //隨機 -4 、-1、 2、 5、 8
        //-4:最小值  3:公差  5:五個數
        System.out.println(-4 + 3*rand.nextInt(5));
    }
}
