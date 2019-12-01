package ststictest;

public class Ststictest {

    public static void main(String[] args) 
    {
       System.out.println(Cirstic.getnu());
       System.out.println(Cirstic.numob);
       // System.out.println(Cirstic.r); is wrong is noy static
       
       
       Cirstic c1 = new Cirstic();
       System.out.println("r = "+c1.r+" number: "+c1.getnu()+" area: "+c1.area());
       Cirstic c2 = new Cirstic(2);
       System.out.println("r = "+c2.r+" number: "+c2.numob+" area: "+c2.area());
       Cirstic c3 = new Cirstic(10);
       System.out.println("r = "+c3.r+" number: "+c3.getnu()+" area: "+c3.area());
       
       Cirstic c4 = new Cirstic();
       Cirstic c5 = new Cirstic(10);
       System.out.println(Cirstic.getnu());
       System.out.println(Cirstic.numob);
    }
}
class Cirstic
{
    double r;
    static int numob = 0;
    
    Cirstic()
    {
        r = 1;
        numob++;
    }
    Cirstic(double nci)
    {
        r = nci;
        numob++;
    }
    static int getnu()
    {
        return  numob;      
    }
    double area()
    {
        return r * r * Math.PI;
    }
}
