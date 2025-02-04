import java.util.Scanner;
public class Tran{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
       
        System.out.println("enter a");
        int a;
        a=obj.nextInt();

         System.out.println("enter b");
        int b;
        b=obj.nextInt();

         System.out.println("enter c");
        int c;
        c=obj.nextInt();

        if(a==b && b==c){
            System.out.println("equal");
        }

        else{
            System.out.println("not aqual");
        }




    }
}

