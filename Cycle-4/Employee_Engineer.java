import java.util.*;
class Employee
{
    void display()
    {
        System.out.println("Name of the class is Employee");
    }

    int calcSalary()
    {
        System.out.println("Salary of employee is 10000");
        return 0;
    }
}

class Engineer extends Employee
{
   
    int calcSalary()
    {
        super.calcSalary();
    System.out.println("Salary of employee is 20000");
    return 0;
    }
}

class Testclass
{
    public static void main(String args [])
    {
        Engineer s=new Engineer();
        s.display();
        s.calcSalary();
     }
}
