package pkginterface;

public class Interface {

    public static void main(String[] args) 
    {
        Object obj[] = {new Tiger(),new Chicken(),new Apple(),new Orange()};
        
        for(int i = 0;i < obj.length;i++)
        {
            if(obj[i] instanceof Edible)
                System.out.println(((Edible)obj[i]).howToEat());
            
            if(obj[i] instanceof Animal)
                System.out.println(((Animal)obj[i]).sound());
        }
    }
}
interface Edible
{
    public abstract String howToEat();
}
abstract class Animal
{
    public abstract String sound();
}
class Chicken extends Animal implements Edible
{
    @Override
    public String howToEat() 
    {
        return "Chicken: Fry it";
    }      
    @Override
    public String sound() 
    {
        return "Chicken: cock-a-doodle-doo";
    }
}
class Tiger extends Animal
{
    @Override
    public String sound() 
    {
        return "Tiger: RROOOAARR";
    }
}
abstract class Fruit implements Edible
{
    
}
class Apple extends Fruit
{
    @Override
    public String howToEat() 
    {
        return "Apple: make apple pie";
    }      
}
class Orange extends Fruit
{
    @Override
    public String howToEat() 
    {
        return "Orange: make a orange juice";
    }      
}