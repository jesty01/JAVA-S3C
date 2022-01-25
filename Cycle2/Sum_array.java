import java.util.*;
class Sum_array
{
    public static void main(String args [])
    {
    int i,sum=0;
    Scanner r=new Scanner(System.in);
    int [] A=new int [25];
    System.out.println("Enter size of the array");
    int n=r.nextInt();
    System.out.println("Enter the elements of the array");
    for(i=0;i<n;i++)
        A[i]=r.nextInt();
    for(i=0;i<n;i++)
        sum=sum+A[i];
    System.out.println("Sum of elements of the given array is "+sum);    


}
}
