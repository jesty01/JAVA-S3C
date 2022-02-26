import java.util.*;
class student
{
 String name;
 int Rollno,age;
 long Phone_number;
 float CGPA;
	
 public static void main(String[] args)
 {
  int n = 3;
  student s[] = new student[n];
  int i;
  for(i=0; i<n; i++)
  {
   s[i] = new student();
   System.out.println("Enter the Details of Student "+(i+1));
   s[i].EnterDetials();
  }
  int c = 0;
  int a = 0;
  long ph=0;
  for(i=0; i<n; i++)
  {
   if(s[c].CGPA<s[i].CGPA)
     c = i;
   if(s[a].age > s[i].age)
     a=i;
   if(s[i].name.equals("ANU"))
     ph=s[i].Phone_number;
  }
  
    System.out.println(s[c].name);
   
    System.out.println(s[a].Rollno);
   
   
  
  System.out.println(ph);
 }
 void EnterDetials()
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Roll Number : ");
  Rollno = sc.nextInt();
  System.out.print("Enter the Name : ");
  sc.nextLine();
  name = sc.nextLine();
  
  System.out.print("Enter the Phone Number : ");
  Phone_number = sc.nextLong();
  
  System.out.print("Enter the Age : ");
  age = sc.nextInt();
  
  System.out.print("Enter the CGPA : ");
  CGPA = sc.nextFloat();
 }
}
