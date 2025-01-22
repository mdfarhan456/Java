import java.util.Scanner;
public class First
{
public static void main(String arg[])
{
System.out.println("hello");
Scanner obj = new Scanner (System.in);
String name;
int age;
System.out.println("enter your name and aage");
name = obj.nextLine();
age = obj.nextInt();
obj.nextLine();
System.out.println(name+" "+age);
}
}
