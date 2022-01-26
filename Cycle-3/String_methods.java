import java.util.*;
public class String_methods {
    String str;

    void Frequency()
    {
        Scanner obj1=new Scanner(System.in);
        int i,l=0,len;
        
        System.out.println("Enter the string");
        String str=obj1.nextLine();
        len=str.length();
        char a[]=new char[len+1];
        for(i=0;i<len;i++)
            a[i]=str.charAt(i);
        System.out.println("Enter character whose frequency is to be determined ");
      
        char k=obj1.next().charAt(0);
       for(i=0;i<len;i++)
        {
            if(str.charAt(i)==k)
            {
                l++;
            }
        }
     
        System.out.println("The frequency of "+k+" is "+l);
         
        
        String_methods r1=new String_methods();
        r1.reverse(str);
    }
            
    void reverse(String str)
    {
        int i,j=0,len;
        String rev="";
        len=str.length();
        char a[]=new char[len+1];
        for(i=0;i<len;i++)
            a[i]=str.charAt(i);
        for(i=len-1;i>=0;i--)
        rev+=a[i];
        System.out.println("Reversed string is "+rev);
    }
    public static void main(String args [])
    {
        String_methods r=new String_methods();
        r.Frequency();
        
    }
    
    
}
