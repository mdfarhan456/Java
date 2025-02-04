import java.util.Scanner;
public class Leapyear{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a year");
        int year;
        year=obj.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println(year+" "+"is a leap year");
        }

        else if(year%100==0 && year%400==0){
            System.out.println(year+" "+"is a leap year");
        }
        else{
            System.out.println(year+" "+"is not a leap year");
        }
    }
}