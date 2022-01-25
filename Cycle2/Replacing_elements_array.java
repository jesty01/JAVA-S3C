import java.util.*;

class Replacing_elements_array {
    public static void main(String args [])
    {
        Scanner o=new Scanner(System.in);
        int [] A=new int[50];
        int i,f=0;
        System.out.println("Enter the number of elelmnts in the array ");
        int n=o.nextInt();
        System.out.println("Enter the elements into the array ");
        for(i=0;i<n;i++)
            A[i]=o.nextInt();
        System.out.println("Enter the element to be removed ");
        int replaced_element=o.nextInt();
        System.out.println("Enter the element to be added");
        int added_element=o.nextInt();
        for(i=0;i<n;i++)
        {
            if(A[i]==replaced_element)
            {
                A[i]=added_element;
                f=1;System.out.println("Modified Array is");
                for(i=0;i<n;i++)
                    System.out.println(A[i]);  
            }
        }
        if(f==0)   
             System.out.println("The element "+replaced_element+" not found in the array"); 
      }
 }
