import java.util.*;
public class largest_matrix 
{
    public static void main(String args [])
    {
        int i,j,large;
        Scanner obj=new Scanner(System.in);
        int [][] A=new int[50][50];
        System.out.println("Enter the no.of rows and columns respectively ");
        int r=obj.nextInt();
        int c=obj.nextInt();
        System.out.println("Enter the elementsm of the matrix ");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                A[i][j]=obj.nextInt();
        large=A[0][0];    
        for(i=0;i<r;i++)
             for(j=0;j<c;j++)  
                if(A[i][j]>large)
                    large=A[i][j];
        System.out.println("The largest element in the matrix is "+large);

    }
    
}
