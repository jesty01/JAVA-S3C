import java.util.*;
public class Smallest_array {
    public static void main(String args [])
    { 
        Scanner obj=new Scanner(System.in);
        int i,small;
        int [] A=new int [25];
        System.out.println("Enter no.of elements in the array");
        int n=obj.nextInt();
        System.out.println("Enter elements of the array ");
        for(i=0;i<n;i++)
            A[i]=obj.nextInt();
         small=A[0];
         for(i=0;i<n;i++)
            if(A[i]<small)
                small=A[i];
        System.out.println("Smalllest element of the array is "+small); 
    }
    
}
