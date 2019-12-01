package priaetwo;

public class Priaetwo {

    public static void main(String[] args) 
    {       
        int total = 0;
               
        TenRectangle tt[] = new TenRectangle[10];
        
        for(int i = 0;i <tt.length;i++)
        {
            tt[i] = new TenRectangle((int)(Math.random()*100+1),(int)(Math.random()*100+1));
        }
        for(int i = 0;i <tt.length;i++)
        {
            System.out.println(tt[i].show());
            total += tt[i].area();
        }
        System.out.println("total area: "+total);
    }
}
class TenRectangle
{
    int l,w;
    
    TenRectangle()
    {
        
    }
    TenRectangle(int ll,int ww)
    {
        this.l = ll;
        this.w = ww;
    }
    public int area()
    {
        return l*w;
    }
    public String show()
    {
        return "l: "+l+" w: "+w+" area: "+area();
    }
}
