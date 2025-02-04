import java.util.Scanner;
public class Dig{
    public static void main(String atg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int num;
        num=obj.nextInt();
        int d1=num%10;
        num=num/10;

         int d2=num%10;
        num=num/10;

         int d3=num%10;
        
        //int temp;

        if(d3==1){
            System.out.println("one");

        }

        else if(d2==2){
            System.out.println("two");

        }

         else if(d1==3){
            System.out.println("three");

        }

        else{
            System.out.println("error");
        }

    }
}