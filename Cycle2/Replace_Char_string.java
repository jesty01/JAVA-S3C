import java.util.*;
public class Replace_Char_string  
{
    public static void main(String args [])
    {
        Scanner obj=new Scanner(System.in);
        int i,flag=0,len;
        System.out.println("Enter the string");
        String str=obj.nextLine();
        len=str.length();
        char a[]=new char[len+1];
        for(i=0;i<len;i++)
            a[i]=str.charAt(i);
        System.out.println("Enter the element to be removed");
        char rem=obj.next().charAt(0);
        System.out.println("Enter element to be placed");
        char added=obj.next().charAt(0);
        for(i=0;i<len;i++)
            if(a[i]==rem)
                a[i]=added;
        System.out.println("Modified String is ");
        for(i=0;i<len;i++)
            System.out.println(a[i]);       
             
    }
    
}
