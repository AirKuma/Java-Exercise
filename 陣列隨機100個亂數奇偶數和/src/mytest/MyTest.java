package mytest;

public class MyTest {
  
    public static void main(String[] args)
    {
        int num[] = new int[100];
        int count = 1,sum1 = 0,sum2 = 0;
        
        for(int i = 0;i < 100 ;i++)
        {
            num[i] = (int)(Math.random()*200+1);
            if(count % 10 == 0)
                System.out.println(num[i]);
            else
                System.out.print(num[i]+" ");
            count++;
            if(num[i] % 2 == 0)
                sum1 += 1;
            else
                sum2 += 1;    
        }
        System.out.println("偶數個數有 "+sum1+" 個");
        System.out.println("奇數個數有 "+sum2+" 個");
    }
}
