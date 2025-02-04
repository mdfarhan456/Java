import java.util.Scanner;
public class Findthegreatestnum{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number1:");
        int n1;
        n1=obj.nextInt();

         System.out.println("enter number2:");
        int n2;
        n2=obj.nextInt();

         System.out.println("enter number1:");
         int n3;
         n3=obj.nextInt();

         if(n1>n2 && n1>n3){
            System.out.println(n1+" "+"is gretest");
         }

            else if(n2>n1 && n2>n3){
            System.out.println(n2+" "+"is gretest");
         }

            else if(n3>n2 && n3>n1){
            System.out.println(n3+" "+"is gretest");
         }
         else {
             System.out.println("error");
         }
    }
}