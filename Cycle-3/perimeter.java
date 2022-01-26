import java.util.*;
 class perimeter 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println(" Choose the shape whose perimeter is to be found");
      
        System.out.println("     1.Circle");
        System.out.println("     2.Rectangle");
        System.out.println("Give your choice");
       int n=obj.nextInt();
     
       if(n==1)
        {
            System.out.println("Enter the radius of the circle in m" );
            int r=obj.nextInt();
           // obj1.perimeter(r);
            perimeter obj1=new perimeter(r);
        }
        
        else if(n==2)
        {
            System.out.println("Enter the base length and breadth of the rectangle in m");
            int l=obj.nextInt();
            int b=obj.nextInt();
           // obj1.perimeter(l,b);
          perimeter obj1=new perimeter(l,b);
        }
        else
        System.out.println("Invalid Choice");
    }
     perimeter(int r)
    {
        
        System.out.println("The perimeter of given circle is " +(2*3.14*r)+" m");
    }
     perimeter(int b,int l)
    {
        System.out.println("The perimeter of given rectangle is " +(2*(l+b))+" m");
    }
    
}
