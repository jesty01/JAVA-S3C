class Oddeven 
 {
    public static void main(String args [])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=obj.nextInt();
        if(n%2==0)
            System.out.println(n+" is an even number");
        else
            System.out.println(n+" is an odd number");    
        }
}
