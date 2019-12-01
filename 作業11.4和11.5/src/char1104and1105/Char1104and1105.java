package char1104and1105;

import java.util.Scanner;

public class Char1104and1105 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
                
        //11.4
        int i;
        int ar[] = new int[100];
        
       for(i = 0;i < ar.length;i++)
       {
           System.out.print("Enter a number: ");
           ar[i] = input.nextInt();
           
           if(ar[i] == 0)
               break;
       }
       if(max(ar) == 0)
           System.out.println("max is null");
       else
           System.out.println("max is: "+max(ar));
    }
     
    //11.4
    public static int max(int a[])
    {
        int max = a[0];
        
        for(int i = 1;i < a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }
}
//11.5
class ArrayList
{
    private String name;
    private String[] students = new String[100];
    private int numstudent;
    
    public ArrayList(String name)
    {
        this.name = name;
    }
    public void addstudent(String student)
    {
        students[numstudent] = student;
        numstudent++;
    }
    public String[] getString()
    {
        return students;
    }
    public int getnumstudent()
    {
        return numstudent;
    }
    public String getname()
    {
        return name;
    }
}
