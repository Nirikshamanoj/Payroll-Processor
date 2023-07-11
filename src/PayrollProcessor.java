import java.util.*;
public class PayrollProcessor
{
    static void calculatePay(String name,double salaryPerDay)
    {
        double salary=salaryPerDay*30;
        System.out.println("Salaried Employee");
        System.out.println("Name:"+name+"Salary:"+salary);
    }
    static void calculatePay(String name,double hourlyRate,double hoursWorked)
    {
        double salary=hourlyRate*hoursWorked;
        System.out.println("Hourly Employee");
        System.out.println("Name:"+name+"Salary:"+salary);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int salaryPerDay=scanner.nextInt();
        String name=scanner.next();
        double hourlyRate=scanner.nextDouble();
        double hoursWorked=scanner.nextDouble();
        calculatePay(name,salaryPerDay);
        calculatePay(name,hourlyRate,hoursWorked);
    }
}

