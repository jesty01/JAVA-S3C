import java.util.*;
public class Primenumber 
{
    public static void main (String args [])
    {
        int i,flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(n==1)
            System.out.println("1 is neither prime nor composite");
        else
            if(flag==0) 
                System.out.println("The number is a prime number");
            else
                System.out.println("The number is not a prime number");
           
    }
}
