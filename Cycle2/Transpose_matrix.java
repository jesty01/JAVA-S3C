import java.util.*;
public class Transpose_matrix 
{
    public static void main(String args [])
    {
        int i,j,large;
        Scanner obj=new Scanner(System.in);
        int [][] A=new int[50][50];
        int [][] T=new int [50][50];
        System.out.println("Enter the no.of rows and columns of the matrix respectively ");
        int r=obj.nextInt();
        int c=obj.nextInt();
        System.out.println("Enter the elements  of the matrix  ");
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                A[i][j]=obj.nextInt();
        for(i=0;i<r;i++)
            for(j=0;j<c;j++)
                T[i][j]=A[j][i];
        System.out.println("Transpose of the given matrix is ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)  
                 System.out.println(T[i][j]); 
            System.out.println();   
        }
        
    }
}
