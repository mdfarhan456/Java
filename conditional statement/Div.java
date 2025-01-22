import java.util.Scanner;
class Div{
public static void main(String arg[]){
Scanner obj=new Scanner(System.in);
int a;

System.out.println("enter a number");
a=obj.nextInt();
if((a%2==0 && a%4==0 && a%6==0)&&(a%8!=0)){
System.out.println("div");
}
else{
System.out.println("not div");
}


}
}

