import java.util.Scanner;
public class Data
{
public static void main (String arg[])
{
Scanner obj=new Scanner(System.in);
int n1;
int n2;

System.out.println("enter n1 and n2");
n1=Integer.parseInt(obj.nextLine());
n2=Integer.parseInt(obj.nextLine());


int c = n1+n2;

System.out.println(c);


 
}
}