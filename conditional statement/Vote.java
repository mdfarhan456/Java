import java.util.Scanner;
class Vote{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int age;
System.out.println("enter age");
age=obj.nextInt();
if(age>18){
System.out.println("eligible");
}
else{
System.out.println("not eligible");
}
}
}