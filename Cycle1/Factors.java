import java.util.*;
 class Factors
 {
    public static void main(String args [])
    {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        System.out.println("The factors of "+n+" are : ");
        for(i=1;i<=n;i++)
            if(n%i==0)
                System.out.println("\n"+i);
    }
    
}
