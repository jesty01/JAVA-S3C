import java.util.*;
public class Secondlargest_array
 {
    public static void main(String args [])
    {
        Scanner obj=new Scanner(System.in);
        int i,large,seclarge;
        int [] A=new int [100];
        System.out.println("Enter no.of elements in the array");
        int n=obj.nextInt();
        System.out.println("Enter elements of the array ");
        for(i=0;i<n;i++)
            A[i]=obj.nextInt();
        large=A[0];
        for(i=0;i<n;i++)
            if(A[i]>large)
                large=A[i];
        seclarge=A[0];
        for(i=0;i<n;i++)
            if(A[i]>seclarge && A[i]<large)
                seclarge=A[i];
        System.out.println("The second largest element in the array is "+seclarge);
    }
}
