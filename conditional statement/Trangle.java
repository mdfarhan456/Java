import java.util.Scanner;
class Trangle{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int a;
int b;
int c;
System.out.println("enter a , b & c");
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();
if(a==b && b==c){
System.out.println("equal");
}
else{
System.out.println("not equal");
}
}
}
