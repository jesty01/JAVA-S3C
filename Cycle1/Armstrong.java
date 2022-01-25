import java.util.*;
class Armstrong 
{
    public static void main (String args [])
    {
        int s=0,rem,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        i=n;
        while(n!=0)
        {
            rem=n%10;
            s=s+rem*rem*rem;
            n=n/10;
        }
        if(s==i)
            System.out.println("The number is an armstrong number");
        else
            System.out.println("The number is not an armstrong number");
    }
    
}



