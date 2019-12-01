package mytest;

import java.util.Scanner;

public class MyTest {

    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);
         
        //9.1
        System.out.print("Enter a number with the format DD-DDD-DDDD: ");
        String num = input.nextLine();
        
        if(num.matches("\\d{2}-\\d{3}-\\d{4}"))
            System.out.println("It is a valid roll number");
        else
            System.out.println("It is a invalid roll number");
        System.out.println();
        
        //9.3
        System.out.print("Please enter a Password: ");
	String password = input.next();
		
	if (isValid(password)) 
		System.out.println("Valid Password");
	else 
		System.out.println("Invalid Password");
        System.out.println();
        
         //9.7
         System.out.print("Enter a string: ");
         String ch = input.next();
         char c[] = ch.toUpperCase().toCharArray();        
                
         for(int i = 0;i < ch.length();i++)
         {        
             if(Character.isLetter(c[i]))
                 System.out.print(getnum(c[i]));
             else
                 System.out.print((c[i]));
         }
         System.out.println();
         
        //9.8
        System.out.print("Enter a number: ");
        String n = input.next();
        
        System.out.println("The decimal value is "+binarytoaecimal(n));
        System.out.println();
        
        //9.9
        System.out.print("Enter a number: ");
        String number = input.next();
      
        System.out.println("The hex is: "+binaryToHex(number));
        System.out.println();
      
        //9.10
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
      
        System.out.println("The binary is: "+decimalToBinary(number1));
        System.out.println();
       
        //9.12   
        System.out.print("Enter the first string: ");
	String first = input.next();
	
	System.out.print("Enter the second string: ");
	String second = input.next();
		
	System.out.println(first + " and " + second + " is " + 
		(isAnagram(first, second) ? "anagram." : "not anagram."));
        System.out.println();

       
       //9.17
       int cou = 0;
       String cap[][] = {{"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois",
                           "Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
                           "Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","	Ohio",
                           "Oklahoma","Oregon","Pennsylvania","Puerto Rico","Rhode Island","South Carolina","South Dakota","Tennessee","TTexas","Utah",
                           "Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"},
                          {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu",
                           "Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing",
                           "St.Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh",
                           "Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","San Juan","Providence","Columbia","Pierre","Nashville","Austin",
                           "Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"}};
        
       for(int j = 0; j < cap[0].length;j++)
       {
              System.out.print("What is the capital of "+cap[0][j]+" ? ");
              String S = input.next();
                
              if(S.equals(cap[1][j]))
              {
                   System.out.println("Your answer is correct");
                   cou++;
              }
              else
                    System.out.println("The correct answer shouble be "+cap[1][j]);
       }     
       System.out.println("The correct count is "+cou);
    }
    //9.3
    public static boolean isValid(String password) 
    {  
        if (password.length() < 8)    
            return false;  
        else 
        {      
            char c;  
            int count = 1;   
            for (int i = 0; i < password.length() - 1; i++) 
            {  
                c = password.charAt(i);  
                if (!Character.isLetterOrDigit(c))           
                    return false;  
                else if (Character.isDigit(c)) 
                {  
                    count++;  
                    if (count < 2)   
                    {     
                        return false;  
                    }     
                }  
            }  
        }         	
        return true;  
    }  
    // 9.7
    public static int getnum(char uppleter)
    {
        if(uppleter == 'A' || uppleter == 'B' || uppleter == 'C')
            return 2;
        else if(uppleter == 'D' || uppleter == 'E' || uppleter == 'F')
            return 3;   
        else if(uppleter == 'G' || uppleter == 'H' || uppleter == 'I')
            return 4;
        else if(uppleter == 'J' || uppleter == 'K' || uppleter == 'L')
            return 5;
        else if(uppleter == 'M' || uppleter == 'N' || uppleter == 'O')
            return 6;
        else if(uppleter == 'P' || uppleter == 'Q' || uppleter == 'R'|| uppleter == 'S')
            return 7;
        else if(uppleter == 'T' || uppleter == 'U' || uppleter == 'V')
            return 8;
        else 
            return 9;      
    }
    //9.8  
     public static int binarytoaecimal(String bin)
    {     
        int t = 0;
        for(int i = 0;i < bin.length();i++)
        {
             char c = bin.charAt(i);
             int b = c-'0';
             t += b * Math.pow(2,bin.length() - i - 1);
        }       
        return t;
    }
    //9.9
    public static String binaryToHex(String bin)
    {
        String b = Integer.toHexString(Integer.parseInt(bin,2));
        return b;
    }
    //9.10
    public static String decimalToBinary(int value)
    {
         return Integer.toBinaryString(value);
    }
    //9.12
    public static boolean isAnagram(String s1, String s2) 
    {
		
	char[] newS1 = s1.toCharArray();
  	java.util.Arrays.sort(newS1);
  	char[] newS2 = s2.toCharArray();
  	java.util.Arrays.sort(newS2);              
		
	if (newS1.length != newS2.length) 
	    return false;
		
	for (int i = 0; i < newS1.length; i++)
        {
	     if (newS1[i] != newS2[i]) 
	     {
		   return false;
	     }
	}		
	return true;
    }
}
//9.16
class MyString1
{
    char c[] = new char[10];
    
    public MyString1(char[] chars)
    {
        for(int i = 0;i < c.length;i++)
        {
            c[i] = chars[i];
        }
    }
    public char charAt(int indes)
    {
        return c[indes];
    }
    public int length()
    {
        return c.length;
    }
    public MyString1 substring(int begin,int end)
    {       
         char c1[] = new char[10];
         for(int i = begin;i < end;i++)
         {
             c1[i] = c[i];
         }
         c = c1;
         return this;
    }
    public MyString1 toLowerCase()
    {
         c.toString().toLowerCase();
        return this;
    }
    public boolean equals(MyString1 s)
    {
        if(s.equals(c.toString()))
            return true;
        return false;
    }
    public static MyString1 valueOf(int i)
    {
        String s2 = String.valueOf(i); 
        char s[] = new char[10];
       
      for(int ii = 0;ii < 10;ii++)
      {
          s[ii] = s2.charAt(ii);
      }
        
        MyString1 s1  = new MyString1(s);
        return s1;      
    }
}
//9.18
class MyString2
{
    String s2;
    
    public MyString2(String s)
    {
        s2 = s;
    }
    public int compare(String s)
    {
        return s2.compareTo(s);
    }
    public MyString2 substring(int begin)
    {       
         s2.substring(begin);
         return this;
    }
    public MyString2 toLowerCase()
    {
         s2.toLowerCase();
        return this;
    }
    public char[] tochar()
    {
        char[]a = s2.toCharArray();
        return a;
    }
    public static MyString2 valueOf(boolean b)
    {
        String b1 =  String.valueOf(b);
             
        MyString2 s1  = new MyString2(b1);
        return s1;      
    }
}
