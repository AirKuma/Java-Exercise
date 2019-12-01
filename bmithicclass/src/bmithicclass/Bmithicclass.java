package bmithicclass;

public class Bmithicclass {

    public static void main(String[] args)
    {
       BMI bmi1 = new BMI("yoi",18,145,70);
       System.out.println("The BMI for "+bmi1.getname()+" is "+bmi1.getBMI()+"  "+bmi1.getstatus());
       
       BMI bmi2 = new BMI("dfsf",215,70);
       System.out.println("The BMI for "+bmi2.getname()+" is "+bmi2.getBMI()+"  "+bmi2.getstatus());
    }
}
class BMI
{
    private String name;
    private int age;
    private double w;
    private double h;
    public static final double k_to_p = 0.45359237;
    public static final double m_to_in = 0.0254;
    
    public BMI(String name,int age,double w,double h)
    {
         this.name = name;
         this.age = age;
         this.w = w;
         this.h = h;
    }
    public BMI(String name,double w,double h)
    {
        this(name,20,w,h);
    }
    public double getBMI()
    {
        double bmi = w * k_to_p / ((h * m_to_in) * (h * m_to_in));
        return (int)(bmi * 100) / 100.0;     
    }
    public String getstatus()
    {
        double bmi = getBMI();
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Overweight";
        else 
            return "Obese";
    }
    public String getname()
    {
       return name;
    }
    public int getage()
    {
       return age;
    }
    public double getw()
    {
       return w;
    }
    public double geth()
    {
       return h;
    }
}