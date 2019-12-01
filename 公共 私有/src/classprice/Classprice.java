package classprice;

public class Classprice {

    public static void main(String[] args) 
    {
       //CCircle cir2 = new CCircle();    //error
       CCircle cir1 = new CCircle("Blue",2);
       cir1.show();      
    }
}
class CCircle
{
    private String color;
    private double pi = 3.14;
    private double radius;
    
    private CCircle()                                          //private 類別外無法存取
    {
        System.out.println("pruvate constructor called");       
    }
    public CCircle(String str,double r)
    {
        this();
        color = str;
        radius = r;
    }
    public void show()
    {
        System.out.println("color = "+color+" radius = "+radius);
        System.out.println("area = "+pi * radius * radius);
    }
}

  

    

