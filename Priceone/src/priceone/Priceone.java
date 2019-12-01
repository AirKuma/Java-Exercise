package priceone;

public class Priceone {

    public static void main(String[] args) 
    {
         MyKitchen a = new MyKitchen ();
         a.raising();
    }
}
interface Edible
{
    public abstract String howToCook();
}
abstract class Animal
{
      private double weight=0.0;
      private boolean isDangerous=false;
      private boolean meatEater=false;

public Animal() 
{

}

public Animal(double weight)
{
	this.weight = weight;
}
public void setMeatEater(boolean meatEater)
{
    this.meatEater=meatEater;
}
public void setWeight(double weight)
{
	this.weight = weight;
}
private void setIsDangerous()
{
    if ((this.weight > 100) && (meatEater==true)) 
            this.isDangerous=true;
}
public boolean getMeatEater()
{
    return meatEater;
}
public boolean getIsDangerous()
{
    return isDangerous;
}
public double getWeight()
{
    return weight;
}
public void makeNoise()
{
	System.out.println("Mmmm...");
} 
public abstract void raising();
}

class Cow extends Animal implements Edible
{
      private boolean milking = false;
      private char gender;
      
    public Cow()
    {
        
    }
    public Cow(char gender)
    {
        this.gender = gender;              
    }
    public String howToCook()
    {
         return "BBQ it and make the beef steak!";
    }
    public void makeNoise()
    {
        System.out.println("Mooo..");
    }
    public void produce()
    {
        if (milking == true)
            System.out.println("This is an animal who can produce MILK!!");
        else
            System.out.println("This is an animal who produce MEAT");
    }
  
    public void raising() 
    {
      if (milking == true)
            System.out.println("feed much clean grass and listen to fine  music");
       else
            System.out.println("feed corn and massage");
    } 
}

class Sheep extends Animal implements Edible
{
     public Sheep()
     {
        
     }
    public String howToCook()
    {
        return "Make the lamb chop!";
    }
     public void makeNoise()
     {
         System.out.println("Baa...");
     }
     public void isAfraidOf()
     {
         System.out.println("It is afraid of DOG!!");
     }
     
     public void raising() 
     {
        System.out.println("keep away from dogs!!");
     }
}

class MyKitchen 
{
    Object obj[] = {new Cow(),new Sheep()};
    public void raising() 
    {
        for(int i = 0;i < obj.length;i++)
        {
            System.out.println(((Edible)obj[i]).howToCook());
        }
    }   
}
