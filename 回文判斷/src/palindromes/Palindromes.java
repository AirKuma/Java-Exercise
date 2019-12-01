package palindromes;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();            
                 
        if(ispalindrome(s))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");         
    }
    public static boolean ispalindrome(String s)
    {
        int l = 0;
        int h = s.length() - 1;
        
        while(l < h)
        {
            if(s.charAt(l) != s.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    }
}
