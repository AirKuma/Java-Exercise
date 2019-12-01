package stringcom;

public class Stringcom {

    public static void main(String[] args) 
    {
        String s1 = "Welcome to java";
        String s2 = s1;
        String s3 = new String("Welcome to java");
        String s4 = "Welcome to java";
        
        System.out.println("s1 == s2 "+(s1 == s2));
        System.out.println("s2 == s3 "+(s3 == s2));
        System.out.println("s1.equals(s2) "+(s1.equals(s2)));
        System.out.println("s2.equals(s3) "+(s2.equals(s3))); 
        System.out.println("s1.compareTo(s2) "+(s1.compareTo(s2)));
        System.out.println("s2.compareTo(s3) "+(s2.compareTo(s3)));
        System.out.println("s1 == s4 "+(s1 == s4));
        System.out.println("s1.charAt(0) "+(s1.charAt(0)));
        System.out.println("s1.indexOf('j') "+(s1.indexOf('j')));
        System.out.println("s1.indexOf(to) "+(s1.indexOf("to")));   
        System.out.println("s1.lastindexOf('a') "+(s1.lastIndexOf('a')));
        System.out.println("s1.lastindexOf(0,15) "+(s1.lastIndexOf("o",15)));
        System.out.println("s1.length() "+(s1.length()));
        System.out.println("s1.substring(5) "+(s1.substring(5)));
        System.out.println("s1.substring(5,11) "+(s1.substring(5,11)));
        System.out.println("s1.substring(5) "+(s1.substring(5)));
        System.out.println("s1.startsWith(Wel) "+(s1.startsWith("Wel")));
        System.out.println("s1.endsWith(Java) "+(s1.startsWith("Java\0")));
        System.out.println("(s1.toLowerCase() "+(s1.toLowerCase()));
        System.out.println("(s1.toUpperCase() "+(s1.toUpperCase()));
        System.out.println("(Welcome .trim() "+("Welcome ".trim()));
        System.out.println("(s1.replace('o', 'T') "+(s1.replace('o', 'T')));
        System.out.println("(s1.replaceAll(o, T) "+(s1.replaceAll("o", "T")));
        System.out.println("(s1.replaceFirst(o, T) "+(s1.replaceFirst("o", "T")));
        System.out.println("s1.toCharArray() "+(s1.toCharArray()));
        
       
    }
}
