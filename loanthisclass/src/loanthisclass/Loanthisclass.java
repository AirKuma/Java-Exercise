package loanthisclass;

import java.util.Scanner;

public class Loanthisclass {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter annual interest rate ex 8.25: ");
       double air = input.nextDouble();
       
       System.out.print("Enter years: ");
       int year = input.nextInt();
       
       System.out.print("Enter loan amount ex 123568.25: ");
       double loans = input.nextDouble();
       
       Loan loan0 = new Loan();
       System.out.println("The loan was created on "+loan0.getloandate());
       System.out.println("The ir "+loan0.getir());
       System.out.println("The year "+loan0.getyear());
       System.out.println("The lones "+loan0.getloans());
       System.out.println("The monthly payment is "+loan0.getmp());
       System.out.println("The total payment is "+loan0.gettp());
       System.out.println();
       
       Loan loan = new Loan(air,year,loans);      
       System.out.println("The loan was created on "+loan.getloandate().toString());
       System.out.println("The ir "+loan.getir());
       System.out.println("The year "+loan.getyear());
       System.out.println("The lones "+loan.getloans());
       System.out.println("The monthly payment is "+loan.getmp());
       System.out.println("The total payment is "+loan.gettp());
    }
}
class Loan
{
    private double ir;
    private int year;
    private double loans;
    private java.util.Date loanDate;
    
    public Loan()
    {
        this(2.5,1,1000);
    }
    public Loan(double ir,int year,double loans)
    {
        this.ir = ir;
        this.year = year;
        this.loans = loans;
        loanDate = new java.util.Date();
    }
    public double getir()
    {
        return ir;
    }
    public void setir(double ir)
    {
        this.ir = ir;
    }
    public int getyear()
    {
        return year;
    }
    public void setyear(int year)
    {
        this.year = year;
    }
    public double getloans()
    {
        return loans;
    }
    public void setloans(double loans)
    {
        this.loans = loans;
    }
    public double getmp()
    {
        double mir = ir / 1200;
        double mp = loans * mir /(1 - (1 / Math.pow(1 + mir, year * 12)));
        
        return mp;
    }
    public double gettp()
    {
         double tp = getmp() * year * 12;
         return tp;
    }
    public java.util.Date getloandate()
    {
        return loanDate;
    }
}
