import java.util.*;
 class Student
 {
    int i;
    Scanner obj=new Scanner(System.in);
    
    void read()
     {
        int [] Marks=new int[20];
        System.out.println("Name : ");
        String str=obj.nextLine();
        System.out.println("Roll no : ");
        int roll=obj.nextInt();
        for(i=0;i<5;i++)
         {
            System.out.println("Marks for subject "+(i+1));
            Marks[i]=obj.nextInt();
         }
         System.out.println("\n");
         System.out.println("Details Entered\n");
        Student s1=new Student();
         s1.display(str,roll,Marks);
     }

     void display(String str,int rollno,int [] Marks)
     {

        System.out.println("Name : "+str);
        System.out.println("Roll no : "+rollno);
        System.out.println("\n");
        for(i=0;i<5;i++)
        System.out.println("Marks for subject "+(i+1)+ " = "+Marks[i]);
    }
        public static void main(String args [])
        {
             Student s=new Student();
            s.read();
         
        }
}
