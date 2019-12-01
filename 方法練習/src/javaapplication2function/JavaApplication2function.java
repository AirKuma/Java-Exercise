package javaapplication2function;

public class JavaApplication2function {
  
    public static void main(String[] args) 
    {
       int i1 = 3, j1 = 4;
       int r1 = 3;
		    
       System.out.println("area: " + area(r1));     
       System.out.println("area: " + area(i1, j1));
    }   
    
    public static double area(double r)
    {
	double pi = 3.14;
	return r * pi;
    }
	
    public static double area(int i, int j)
    {
	return i * j;
    }
}
