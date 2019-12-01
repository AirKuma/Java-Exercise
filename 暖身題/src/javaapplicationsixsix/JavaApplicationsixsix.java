package javaapplicationsixsix;

public class JavaApplicationsixsix {

    public static void main(String[] args)
    {
        int a[] = new int[1000];
        int s1 = 0,s2 = 0,s3 = 0,s4 = 0,s5 = 0,s6 = 0;
        
        for(int i = 0;i < a.length;i++)
        {
            a[i] = (int)(Math.random() * 6 + 1);
            if(a[i] == 1)
                s1++;
            else if(a[i] == 2)
                s2++;
            else if(a[i] == 3)
                s3++;
            else if(a[i] == 4)
                s4++;
            else if(a[i] == 5)
                s5++; 
            else
                s6++;         
        }
        for(int i = 0;i < s1 / 10;i++)
        {
            System.out.print("*");
        }
        System.out.println(s1+" "+s1 / 10.0);
        System.out.println(s2+" "+s2 / 10.0);
        System.out.println(s3+" "+s3 / 10.0);
        System.out.println(s4+" "+s4 / 10.0);
        System.out.println(s5+" "+s5 / 10.0);
        System.out.println(s6+" "+s6 / 10.0);
    }
}
