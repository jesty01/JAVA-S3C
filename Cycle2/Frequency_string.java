import java.util.*;
class Frequency_string {
    public static void main(String args [])
    {
       // int i;
        Scanner obj1=new Scanner(System.in);
        int i,l=0,len;
        try 
        {
        System.out.println("Enter the string");
        String str=obj1.nextLine();
        len=str.length();
        char a[]=new char[len+1];
        for(i=0;i<len;i++)
            a[i]=str.charAt(i);
        System.out.println("Enter character whose frequency is to be determined ");
       // String k=obj1.nextLine();
        char k=obj1.next().charAt(0);
       for(i=0;i<len;i++)
        {
            if(str.charAt(i)==k)
            {
                l++;
            }
        }
     
        System.out.println("The frequency of "+k+" is "+l);
    }
    finally { obj1.close();}
}
            
    }

