import java.util.*;
class MethodEx
{
    int i;
    public static void main(String args [])
    {
        int f,s;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        MethodEx obj1=new MethodEx();
        f= obj1.fact(n);
        s=obj1.sum(n);
        System.out.println("The factorial of "+n+" is " +f);
        System.out.println("The sum of digits of "+n+" is " +s);
    }
    int fact(int n)
   {
    int fact=1;
    for(i=1;i<=n;i++)
        fact=fact*i;
     return fact;
    }
    int sum(int n)
    {
        int sum=0,d;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
    return sum;
    }
}
