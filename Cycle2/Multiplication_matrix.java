import java.util.*;
public class Multiplication_matrix 
{
    public static void main(String args [])
    {
        int i,j,k;
        Scanner obj=new Scanner(System.in);
        int [][] A=new int[50][50];
        int [][] B=new int[50][50];
        
        System.out.println("Enter the no.of rows and columns of the matrix A ");
        int r1=obj.nextInt();
        int c1=obj.nextInt();
        System.out.println("Enter the elements of the matrix A ");
        for(i=0;i<r1;i++)
            for(j=0;j<c1;j++)
                A[i][j]=obj.nextInt();
        System.out.println("Enter the no.of rows and columns of the matrix B ");
        int r2=obj.nextInt();
        int c2=obj.nextInt();
        System.out.println("Enter the elements of the matrix B ");
        for(i=0;i<r2;i++)
             for(j=0;j<c2;j++)
                B[i][j]=obj.nextInt();
        if (r2!=c1)
         {
             System.out.println("Multiplication Not Possible");
            return ;
        }

        int C[][] = new int[r1][c2];
        System.out.println("\nResultant Matrix:");
        for (i = 0; i < r1; i++)
         {
            for (j = 0; j < c2; j++)
             {
                for (k = 0; k < r2; k++) 
                {
                    C[i][j] += A[i][k] * B[k][j];
                 }
            System.out.println(C[i][j]);  
            }
        }

    }
}
