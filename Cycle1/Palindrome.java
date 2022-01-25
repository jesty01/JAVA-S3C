import java.util.*;
class Palindrome
{
    public static void main(String args [])
    {
        int rev=0,rem,n1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        n1=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        if(n1==rev)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome")  ;  

        
    }
    
}
