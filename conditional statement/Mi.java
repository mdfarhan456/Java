import java.util.Scanner;
class Mi{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int num1;
int num2;
int num3;
int num4;
int mid;
System.out.println("enter four numbers");
num1=obj.nextInt();
num2=obj.nextInt();
num3=obj.nextInt();
num4=obj.nextInt();
if(num2!=0 && num3!=0){
mid=(num2+num3)/2;
System.out.println("Midterm="+" "+mid);
}
}

}

