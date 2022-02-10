import java.io.*;
import java.util.*;
class file3
{
  public static void main(String[] args) throws Exception
   {
try
{
Scanner sc = new Scanner(System.in);
FileWriter fw = new FileWriter("trial2.txt");
System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("Enter your Address:");
String address = sc.nextLine();
fw.write(name + "\n");
fw.write(address);
fw.close();
FileReader fr = new FileReader("trial2.txt");
int ch;
while((ch = fr.read()) != -1)
{
System.out.print((char)ch);
}
fr.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
