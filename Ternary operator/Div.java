import java.util.Scanner;
class Div{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int a;
String result;
System.out.println("enter a number");
a=obj.nextInt();
result=((a%2==0 && a%4==0 && a%6==0)&&(a%8!=0))?"div by 2,4 &6":"not div";
System.out.println(result);
}
}

