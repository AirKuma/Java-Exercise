package clonefish;

public class Clonefish {

    public static void main(String[] args) throws CloneNotSupportedException
    {
         Fish fish1=new Fish();
	 fish1.setColor("yellow");
         fish1.setSize("big");
	 fish1.setPersonality("mad");
	 fish1.setStatus(100, 100);
	 fish1.setName("Johnny");
	 fish1.setKind("Piranha");
	 fish1.arr[0] = 1;
	 fish1.arr[1] = 2;
	 fish1.arr[2] = 3;
	 fish1.display();
		  
	  Fish fish2=(Fish)fish1.clone();
	  fish2.setName("Mark");
	  fish2.setSize("medium");
	  fish2.arr[2] = 7777;
          fish2.display();
		  
	  Fish fish3=(Fish)fish1.clone();
	  fish3.setName("Mary");
	  fish3.setColor("red");
	  fish3.arr[1] = 9999;
	  fish3.display();
		  
	  //print
	  System.out.println("\n名字\t類型\t體型\t個性\t生命值\t快樂值\t顏色");
	  fish1.display();		
	  fish2.display();
	  fish3.display();
		  
    }
}
class Fish implements Cloneable
{   
	protected String name;
	protected String kind;
	protected String size;
	protected String personality;
	protected int hp;
	protected int happypoint;
	protected String color;
	int[] arr = new int[3]; 

	public Fish()
        {
		
	}
	//setting
	public void setStatus(int hp,int happypoint)
        {
		this.hp=hp;
		this.happypoint=happypoint;
	}
	public void setKind(String kind)
        {
		this.kind=kind;
	}
	public void setSize(String size)
        {
		this.size=size;
	}
	public void setPersonality(String personality)
        {
		this.personality=personality;
	}
	public void setColor(String color)
        {
		this.color=color;
	}
	public void setName(String inputname)
        {
		name = inputname;
	}
	
									
	public void display()
        {
	      System.out.println(name+"\t"+kind+"\t"+size+"\t"+personality+"\t"+hp+"\t"+happypoint+"\t"+color+"\t"+arr[0]+"\t"+arr[1]+"\t"+arr[2]);
	}	
    
       /*
       //Override 父類別Object的clone方法(淺複製)
	@Override
	public Fish clone()
	{
		Fish fish = null;
		try {
				fish = (Fish) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return fish;
	}
       */

	//還是會進入建構子的clone方法(深複製)
	@Override
	public Object clone()
        {
		Fish x=new Fish();
		x.name=this.name;
		x.kind=this.kind;
		x.size=this.size;
		x.personality=this.personality;
		x.hp=this.hp;
		x.happypoint=this.happypoint;
		x.color=this.color;
		x.arr[0] = this.arr[0];
		x.arr[1] = this.arr[1];
		x.arr[2] = this.arr[2];
		return x;
        }	 
}
