import java.util.Scanner;
class Digitword{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        int number=123;
        int d1=0,d2=0,d3=0;

        d1=number%10;
        number=number/10;

          d2=number%10;
        number=number/10;

          d3=number%10;
        //number=number/10;

        if(d1==3){
            System.out.println("one");
        }

         if(d2==2){
            System.out.println("two");
        }

         if(d3==1){
            System.out.println("three");
        }

    }
}