import java.util.Scanner;
class Add{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        System.out.println("enter first number");
        int n1;
         n1=obj.nextInt();

         System.out.println("enter second number");
         int n2;
         n2=obj.nextInt();
         int result;

        
         

         result=(n1>n2)?(n1+n2):(n1-n2);
         System.out.println(result);

    }
}