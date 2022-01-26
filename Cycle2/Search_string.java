import java.util.*;
  class Search_string
 {
     public static void main(String args [])
     {
         int i,len,index=0;
         Scanner obj = new Scanner(System.in);
         Scanner l=new Scanner(System.in);
         System.out.println("Enter a string");
         String str=obj.nextLine();
         len=str.length();
         char A[]=new char[len+1];
         for(i=0;i<len;i++)
            A[i]=str.charAt(i);
        System.out.println("Enter the element to be searched ");
       char key=obj.next().charAt(0);
       for(i=0;A[i]!='\0';i++)
            if(A[i]==key)
                index=i;
        if(index==0)
            System.out.println(key+" not found in the string"); 
        else
            System.out.println(key+" found at index "+index+"  of the string");
           
            
    }
}
