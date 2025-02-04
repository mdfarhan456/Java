import java.util.Scanner;
public class Checkpositivenum{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number to check weather a number positive or negetive:");
        int num=obj.nextInt();

        if(num>0){
            System.out.println(num+" "+"is a positive number");
        }
        else if(num==0){
            System.out.println("it is a zero");
        }
        else{
            System.out.println(num+" "+"is a negative number");
            
        }

    }
}