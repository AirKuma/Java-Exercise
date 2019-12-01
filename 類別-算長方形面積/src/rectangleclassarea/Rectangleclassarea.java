package rectangleclassarea;

public class Rectangleclassarea {

    public static void main(String[] args) 
    {
          CRectangle obj1 = new CRectangle(3, 8);
          obj1.show();
	  obj1.area();
          
          
          CRectangle obj2 = new CRectangle();
          obj2.show();
	  obj2.area();
    }
}
class CRectangle
{
    protected int length;
    protected int width;

    public CRectangle()
    {
         length = 2;
         width = 2;
    }
    public CRectangle(int l, int w)
    {
          length = l;
          width = w;
    }
    protected void show()
    {
	 System.out.print("length = " + length);
	 System.out.print(", width = " + width);
    }
    public void area()
    {
	 int area = length * width;
	 System.out.println(" area = " + area);
    }
}

