import java.util.*;
public class Factorial {
 
    public static void main(String args [])
    {
        int i,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
            fact=fact*i;
        System.out.println("The factorial of "+n+" is "+fact);    

    }
}
