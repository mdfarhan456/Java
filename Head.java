import java.util.Scanner;
class Head{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int coin1;
int coin2;
int coin3;
String result;
System.out.println("enter head or tail");
coin1=obj.nextInt();
coin2=obj.nextInt();
coin3=obj.nextInt();
int head=(coin1==1?1:0)+(coin2==1?1:0)+(coin3==1?1:0);
result=(head==2)?"head":"tail";
System.out.println(result);
}
} 
