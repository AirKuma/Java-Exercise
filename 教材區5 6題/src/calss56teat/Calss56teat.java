package calss56teat;

public class Calss56teat {

    public static void main(String[] args) 
    {
        //5
        CData obj1 = new CData(3,8);
	CData obj2 = new CData();
	obj1.area();
	obj2.area();
        System.out.println(obj1.tostring());
        
        //6
        Car t1 = new Truck("Blue", "C2-5678", "Ariel");	
        t1.show();

    }
}
//5
class  CRectangle
{
	 int  length;
	protected  int  width;
        
        CRectangle()
        {
            length = 2;
            width = 2;
        }
        CRectangle(int l, int w)
        {
            length = l;
            width = w;
        }
	 
	protected void show()
	{
            System.out.print("length = "+length);
            System.out.print(", width = "+width);
	}
}
class CData extends CRectangle
{
    CData()
    {
         length = 2;
         width = 2;
    }
    CData(int l, int w)
    {
        super(l,w);
    }
    public void area() 
    {
        int area = super.length * super.width;
        super.show();
        System.out.println(" area: "+area);
    }
    public String tostring()
    {
        return this.getClass().getName()+" length: "+length+"  width: "+ width;
    }
}
//6
class Car
{
	public  String  color;
        
        public  Car(String  str)
        {
            color = str;
        }
        public  void  show()
        {
            System.out.println("車身顏色: " + color);
	}
}
class Truck extends Car
{
    String id;
    String owner;
    
    Truck(String s1, String s2, String s3)
    {
        super(s1);
	id = s2;
	owner = s3;
    }
    public  void  show()
    {
	System.out.println("車主姓名   車牌號碼   車身顏色");
	System.out.println(owner+ "\t    " + id + "\t  " + color);
    }

}