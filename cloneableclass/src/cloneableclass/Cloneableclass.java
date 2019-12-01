package cloneableclass;

public class Cloneableclass {

    public static void main(String[] args) throws CloneNotSupportedException 
    {
        House h1 = new House(1,45);
        House h2 = h1;
        House h3 =(House) h1.clone();      
        
        System.out.println(h1.compareTo(h2));
        System.out.println(h1.compareTo(h3));
        System.out.println(h1 == h2);
        System.out.println(h1 == h3);
    }   
}
class House implements Cloneable,Comparable< House>
{
    private int id;
    private double area;
    private java.util.Date whenbuilt;
    
    public House(int id,double area)
    {
        this.id = id;
        this.area = area;
        whenbuilt = new java.util.Date();
    }
    public int getid()
    {
        return id;
    }
    public double getarea()
    {
        return area;
    }
    public java.util.Date getwhenbuilt()
    {
        return whenbuilt;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        House h3 = (House)super.clone();
        h3.whenbuilt = (java.util.Date)(whenbuilt.clone());
        return h3;
        //另一方法(一行): return super.clone();
    }
    @Override
    public int compareTo(House o) 
    {
       if(area > o.area)
           return 1;
       else if(area > o.area)
           return -1;
       else
           return 0;
    }   
}
