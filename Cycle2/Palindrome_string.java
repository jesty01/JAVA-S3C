import java.util.*;
public class Palindrome_string
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
        for(i=0;a[i]!='\0';i++)
            if(a[i]!=a[len-i-1])
            {
                flag=1;
                break;
            }  
    if(flag==1)
            System.out.println("The string is not a palindrome");
    else
         System.out.println("The string is a palindrome");
    }
}
