import java.util.Scanner;
class Coinn{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int head1;
int head2;
int head3;
String result;
System.out.println("enter 1 for head and 0 for tail");
head1=obj.nextInt();
head2=obj.nextInt();
head3=obj.nextInt();

int head=(head1==1?1:0)+(head2==1?1:0)+(head3==1?1:0);
result=(head==2)?"head":"tail";

System.out.println(result);
}
}
