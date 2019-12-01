package mytest;

public class MyTest {

    public static void main(String[] args) 
    {
        // 1
        Rectangle tan1 = new Rectangle(4,40);
        System.out.println("width: "+tan1.width+" height: "+tan1.height+" area: "+tan1.getArea()+" preimeter: "+tan1.getPerimeter());
        Rectangle tan2 = new Rectangle(3,35.9);
        System.out.println("width: "+tan2.width+" height: "+tan2.height+" area: "+tan2.getArea()+" preimeter: "+tan2.getPerimeter());
        
        //2
        Stock stock = new Stock("ORCL","Oracle");
        stock.pprice = 34.5;
        stock.cprice = 34.35;
        System.out.println("symbol: "+stock.symbol+" name: "+stock.name+" previous closing price: "+stock.pprice+" current price: "+stock.cprice+" price-change percentagle: "+stock.getChangePrice()+" %");
    }
}
//1
class Rectangle
{
    double width,height;
    
    Rectangle()
    {
        width = 1;
        height = 1;
    }   
    Rectangle(double nw,double nh)
    {
        width = nw;
        height = nh;
    }   
    double getArea()
    {
        return width * height;
    }   
    double getPerimeter()
    {
        return (width + height) * 2;
    }
}
// 2
class Stock
{
    String symbol,name;
    double pprice,cprice;
    
    Stock(String ns,String nn)
    {
        symbol = ns;
        name = nn;
    }
    double getChangePrice()
    {
        return (cprice - pprice) / pprice * 100;
    }
    
}