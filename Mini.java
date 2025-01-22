import java.util.Scanner;
class Mini{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
System.out.println("Database system");
String name;
String UID;
char bg;
int age;
System.out.println("enter your information");
name=obj.nextLine();
UID=obj.nextLine();
bg=obj.nextLine().charAt(0);
age=obj.nextInt();

System.out.println(name +" "+UID+" "+bg+" "+age);
}
}
