import java.util.*;
class sum_digits
{
    public static void main (String args [])
{
    int sum=0,d,orignum;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a number ");
    int n=obj.nextInt();
    orignum=n;
    while(n!=0)
    {
        d=n%10;
        sum=sum+d;
        n=n/10;
    }
    System.out.println("Sum of digits of "+ orignum +" is "+sum);

}
}
