package mytest;

import java.util.Scanner;

public class MyTest {

    public static void main(String[] args) 
    {      
        Scanner input = new Scanner(System.in);
        
        //11.1
        System.out.print("Enter three sides: ");
        double a1 = input.nextDouble();
        double a2 = input.nextDouble();
        double a3 = input.nextDouble();
        System.out.print("Enter color: ");
        String colors = input.next();
        System.out.print("Whether the teiangle is filled?: ");
        boolean filled = input.nextBoolean();
        
        Triangle t3 = new Triangle(a1,a2,a3);
        t3.setColor(colors);
        t3.setFilled(filled);
        
        System.out.println(t3.toString());
        System.out.println("area is: "+t3.getarea());
        System.out.println("perimeter is: "+t3.getperimeter());
        System.out.println("color is: "+t3.getColor());
        System.out.println("filled is: "+t3.isFilled());
        
        //11.2
        Person pe = new Person("Lily");
        System.out.println(pe.tostring());
        
        Student st = new Student("John");
        System.out.println(st.tostring());
           
        Employee em = new Employee("Henry");
        System.out.println(em.tostring());     
        
        Faculty fa = new Faculty("Marry");
        System.out.println(fa.tostring());   
        
        Staff sta = new Staff("star","Tina");
        System.out.println(sta.tostring());
        System.out.println();
        
       //11.3
       Account a = new Account(1122,20000,0.45); 
       a.withdraw(2500);
       a.deposit(3000);
       System.out.println(a.tostring());
       double save = a.getbalance();
       
       CheckingAccount c = new CheckingAccount();
       System.out.println(c.tostring());
       
       SavingAccount s = new SavingAccount(save,0.45);
       System.out.println(s.tostring());
    }
}
//11.1
class GeometricObject
{
    private String color;
    private boolean filled;

    public GeometricObject()
    {
       
    }
    public GeometricObject(String color, boolean filled) 
    {
	this.color = color;
	this.filled = filled;
    }
    public String getColor() 
    {
	return color;
    }
    public void setColor(String color) 
    {
	this.color = color;
    }
    public boolean isFilled() 
    {
	return filled;
    }
    public void setFilled(boolean filled) 
    {
	this.filled = filled;
    }
    public String toString() 
    {
	return "Color: " + color + "and filled: " + filled;
    }
}
class Triangle extends GeometricObject
{
    private double side1 = 1,side2 = 1,side3 = 1;
    
    public Triangle()
    {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    public Triangle(double s1,double s2,double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public double getside1()
    {
        return side1;
    }
    public void setside1(double side1)
    {
        this.side1 = side1;
    }
    public double getside2()
    {
        return side2;
    }
    public void setside2(double side2)
    {
        this.side2 = side2;
    }
     public double getside3()
    {
        return side3;
    }
    public void setside3(double side3)
    {
        this.side3 = side3;
    }
    public double getarea()
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
    public double getperimeter()
    {
        return side1 + side2 + side3;
    }
    public String toString()
    {
         return "Triangle side1 is: " + side1 + " side2 is : " + side2 + " side3 is : " + side3;
    }
}
//11.2
class Person
{
    protected String name;
    String address;
    String phone;
    String email;
    
    Person()
    {
        
    }
    Person(String name,String address,String phone, String email)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    Person(String name)
    {
        setname(name);
    }
    String  getname()
    {
        return name;
    }
    void setname(String name)
    {
        this.name = name;
    }
    String  getaddress()
    {
        return address;
    }
    void setaddress(String address)
    {
        this.address = address;
    }
    String  getphone()
    {
        return phone;
    }
    void setphone(String phone)
    {
        this.phone = phone;
    }
    String  geemail()
    {
        return email;
    }
    void setemail(String email)
    {
        this.email = email;
    }
    String tostring()
    {
        return "class name: "+getClass().getName()+" name is "+getname();
    }
}
class Student extends Person
{
    int status;
    
    Student()
    {
        
    }
    Student(int status)
    {
        this.status = status;
    }
    Student(String name)
    {
        super(name);
    }
    String getstatus()
    {
        if(status == 0)
            return "freshman";
        else if(status == 1)
            return "sophomore";
        else if(status == 2)
            return "junior";
        else 
            return "senior"; 
    }
    String tostring()
    {
        return "class name: "+getClass().getName()+" name is "+getname();
    }
}
class Employee extends Person
{
    MyDate a = new MyDate(1992,5,12);
    String office;
    double salary;
    int date = a.getyear();
    int date2 = a.getmonth();;
    int date3 = a.day;
    
    Employee()
    {
        
    }
    Employee(String office,double salary)
    {
        this.office = office;
        this.salary = salary;
    }
    Employee(String name)
    {
        super(name);
    }
    String getoffice()
    {
        return office;
    }
    void setoffice(String office)
    {
        this.office = office;
    }
    double getsalary()
    {
        return salary;
    }
    void salary(double salary)
    {
        this.salary = salary;
    }
    String tostring()
    {
        return "class name: "+getClass().getName()+" name is "+getname();
    }
    
}
class MyDate
{
    int year;
    int month;
    int day;
    
    MyDate(int year,int month,int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    int getyear()
    {
        return year;
    }
    int getmonth()
    {
        return month;
    }
    int getday()
    {
        return day;
    }
}
class Faculty extends Employee
{
    String officehours;
    int rank;
    
    Faculty()
    {
        
    }
    Faculty(String officehours,int rank)
    {
        this.officehours = officehours;
        this.rank = rank;
    }
    Faculty(String name)
    {
        super(name);
    }
    String getofficehours()
    {
        return officehours;
    }
    void setofficehours(String officehours)
    {
        this.officehours = officehours;
    }
    int getrank()
    {
        return rank;
    }
    void setrank(int rank)
    {
        this.rank = rank;
    }
    String tostring()
    {
        return "class name: "+getClass().getName()+" name is "+getname();
    }
}
class Staff extends Employee
{
    String title;
    
    Staff()
    {
        
    }
    Staff(String title,String name)
    {
        super(name);
        this.title = title; 
    }
    String gettitle()
    {
        return title;
    }
    void settitle(String title)
    {
        this.title = title;
    }
    String tostring()
    {
        return "class name: "+getClass().getName()+" name is "+getname();
    }
}
//11.3
class Account
{
    private int id;
    private double balance;
    private double annualinterestrate;
    private java.util.Date datacreat;
    
    Account()
    {
        id = 0;
        balance = 0;
        annualinterestrate = 0;
        this.datacreat = new java.util.Date();
    }
    Account(int id,double balance,double annualinterestrate)
    {
        this.id = id;
        this.balance = balance;
        this.annualinterestrate = annualinterestrate;
        this.datacreat = new java.util.Date();
    }
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id = id;
    }
    public double getbalance()
    {
        return balance;
    }
    public void setbalance(double balance)
    {
        this.balance = balance;
    }
    public double getannualinterestrate()
    {
        return annualinterestrate;
    }
    public void setannualinterestrate(double annualinterestrate)
    {
        this.annualinterestrate = annualinterestrate;
    }
    public java.util.Date getdatacreat()
    {
        return datacreat;
    }
    public double getmonthlyinterestrate()
    {
        return balance * (annualinterestrate / 12);
    }
    public void withdraw(double w)
    {
         balance =  balance - w;
    }
    public void deposit(double d)
    {
         balance =  balance + d;
    }
    public String tostring()
    {
        return"Created on: "+getdatacreat()+" id: "+getid()+" monthlyinterestrate: "+getmonthlyinterestrate()+" balance: "+getbalance();
    }
}
class CheckingAccount extends Account
{
    boolean isoverdra;
    
    public boolean overdra()
    {
        if(getbalance() < 0)
            return true;
        return false;
    }
    public String tostring()
    {
        return "Do it overdraft ? "+overdra();
    }
}
class SavingAccount extends Account
{
    double saving;
    double annualinterestrate;
    
    SavingAccount()
    {
        
    }
    SavingAccount(double saving,double annualinterestrate)
    {
        this.saving = saving;
        this.annualinterestrate = annualinterestrate;
    }
    public double save()
    {
        return  saving + (saving * annualinterestrate / 12);
    }
    public String tostring()
    {
       return "Saving: "+save();
    }
}
