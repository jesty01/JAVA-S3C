import java.util.*;
class Trace_matrix 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int i, j, rows, columns, trace = 0;	
		System.out.println("Enter no.of Rows and Columns of the matrix");
		rows = sc.nextInt();
		columns = sc.nextInt();
		int[][] A = new int[rows][columns];
		System.out.println("Enter the elements of the  Matrix  ");
		for(i = 0; i < rows; i++) 
		    for(j = 0; j < columns; j++) 
			    A[i][j] = sc.nextInt();
		for(i = 0; i < rows; i++) 
            for(j = 0; j < columns; j++) 
				if(i == j)
				    trace = trace + A[i][j];
				
		System.out.println("\nThe Trace Of the Matrix = " + trace);

	}
}


