import java.util.Scanner;
class Trangle{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int a;
int b;
int c;
String result;
System.out.println("enter a , b & c");
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();
result=(a==b && b==c)?"equal":"not equal";
System.out.println(result);
}
}
