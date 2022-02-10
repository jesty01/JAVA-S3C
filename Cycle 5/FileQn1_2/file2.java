import java.io.*;
import java.util.*;
class file2
{
  public static void main(String[] args) throws Exception
   {
     FileInputStream fin = new FileInputStream("trial.txt");
int c = -1,l=0,w=0;
int ch;

while((ch=fin.read()) != -1)
{
c++;
  if( ch =='\n')
   l++;
if (ch == ' ' || ch == '\n')
   w++;
}
  System.out.println("No.of Character = " + c);
System.out.println("No.of Words = " + w);
System.out.println("No.of Lines = " + l);

fin.close();
}
}
