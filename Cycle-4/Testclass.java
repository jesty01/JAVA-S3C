import java.util.*; 
class Employee 
{
  void method ()
  {    
  
        Scanner obj=new Scanner(System.in);
        System.out.println("Name :");
        char [] name=obj.next().toCharArray();
        System.out.println("Age :");
        int age=obj.nextInt();
        System.out.println("Phone number :");
        
        long ph_no=obj.nextInt();    
        System.out.println("Address :");
        char [] address=obj.next().toCharArray();

        System.out.println("Salary :");
        int salary=obj.nextInt();
        Manager o3=new Manager();
        Officer o4=new Officer();
        
        o4.printfn1(String name,int age,long ph_no,String address);
        o4.print_salary(salary);
        o3.printfn2(String name,int age,long ph_no,String address);
        o3.print_salary(salary);
  }
    
    int print_salary(int salary)
    {
      Scanner r=new Scanner(System.in);
        System.out.println("Salary = Rs "+salary);
       return 0;
    }
  }

class Officer extends Employee
{ 
  void method1()
  {
    Scanner obj1=new Scanner(System.in);
     System.out.println("Specialization of Officer : ");
    char [] specialization=obj1.next().toCharArray();
    
  
  }
  void printfn1(String name,int age,long ph_no,String address)
  {
    System.out.println("Name :"+name);
    System.out.println("Age : "+age);
    System.out.println("Phone Number : "+ph_no);
    System.out.println("Address : "+address);
    System.out.println("Specialization of Officer : "+specialization);
    
  }

}
class Manager extends Employee
{
  void method2()
  {

    Scanner obj2=new Scanner(System.in);
    System.out.println("Department of Manager: ");
    char [] department=obj2.next().toCharArray();
   
  }
  void printfn2(String name,int age,long ph_no,String address)
  {
    System.out.println("Name :"+name);
    System.out.println("Age : "+age);
    System.out.println("Phone Number : "+ph_no);
    System.out.println("Address : "+address);
    System.out.println("Department of the manager : "+department);
  }

  
}
public class testclass
{
  public static void main(String args [])
  {
    
    Manager o2=new Manager();
    Officer o1=new Officer();
    o1.method();
    
    o2.method();
   
    
  }
}
