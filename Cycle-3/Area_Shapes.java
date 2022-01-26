import java.util.*;
class Area_Shapes
{
    public static void main(String[] args) 
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("\n");
       System.out.println(" Choose shape whose area is to be found");
      
       System.out.println("     1.Circle");
       System.out.println("     2.Rectangle");
       System.out.println("     3.Triangle");
       System.out.println("Give your choice");
       int n=obj.nextInt();
       Area_Shapes obj1=new Area_Shapes();
       if(n==1)
        {
            System.out.println("Enter the radius of the circle in m" );
            int r=obj.nextInt();
            obj1.area(r);
        }
        
        else if(n==2)
        {
            System.out.println("Enter the base length and breadth of the rectangle in m");
            int l=obj.nextInt();
            int b=obj.nextInt();
            obj1.area(l,b);
        }
         
         else if(n==3)
         {
             System.out.println("Enter the base length and height of the triangle in m");
             int bs=obj.nextInt();
             int h=obj.nextInt();
             obj1.area(bs,h,0.5);
          }
        
        else
        System.out.println("Invalid Choice");
 
    }
    void area(int r)
    {
        
        System.out.println("The area of given circle is " +(3.14*r*r)+" sq m");
    }
    void area(int b,int l)
    {
        System.out.println("The area of given rectangle is " +(l*b)+" sq m");
    }
    void area(int bs,int h,double a)
    {
        System.out.println("The area of given triangle is " +(a*bs*h)+" sq m");
    }
}
