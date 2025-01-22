import java.util.Scanner;
class Space
{
public static void main(String arg[])
{
Scanner obj = new Scanner(System.in);
int age;
String name;

System.out.println("enter age and name");

age=obj.nextInt();
obj.nextLine();
name=obj.nextLine();

System.out.println("your age and name is"+" "+age+" "+name);
}
}
