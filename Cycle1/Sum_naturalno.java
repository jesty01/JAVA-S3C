import java.util.*;
class Sum_naturalno 
{
    public static void main(String args [])
    {
        int sum=0,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
            sum=sum+i;
         System.out.println("The sum of "+n+" natural number is "+sum);   
    }
    
}
