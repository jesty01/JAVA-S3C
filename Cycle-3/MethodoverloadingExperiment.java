import java.util.*;
class methodoverloading_experiment
{
    public static void main (String args[])
    {
       String a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter numbers to be concatenated");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        System.out.println("Enter the first string " );
        a= obj.nextLine();
        System.out.println("Enter the second string " );
        b= obj.nextLine();
        methodoverloading_experiment o=new methodoverloading_experiment();
        o.concatenate(n1, n2);
        o.concatenate(a,b);

    }
    void concatenate(int a,int b)
    {
        System.out.println("The numbers after concatenation is "+a+b);
    }
    void concatenate(String a,String b)
    {
        System.out.println("The strings after concatenation is "+a+b);
    }
    

}
