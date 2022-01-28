import java.util.*;
 public class Employee 
{   
    
    public static void main(String[] args)
    {
        int i;
        Scanner ob = new Scanner(System.in);
        System.out.println("No.of Employees");
        int n=ob.nextInt();
            for(i=0;i<n;i++)
        {
            System.out.println("Enter Employee No : ");
            int code=ob.nextInt();
            System.out.println("Enter Employee name : ");
            String str=ob.nextLine();
            System.out.println("Enter Employee Phone No :");
            long ph=ob.nextInt();
            Employee l=new Employee();
             l.printfn(code,str,ph,n);
        }
         
    }
    
    void printfn(int code,String str,long ph,int n)
    {
        int i;
            for(i=0;i<n;i++)
            {
                System.out.println("Employee no :"+code);
                System.out.println("Employee name ; "+str);
                System.out.println("Phone number : "+ph);
         
            }
    }
        
    
    

}

