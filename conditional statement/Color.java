import java.util.Scanner;
public class Color{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
       // System.out.println("enter color1");
        String color1="red";
        color1=obj.nextLine();

       // System.out.println("enter color2");
        String color2=" black";
        color2=obj.nextLine();
        String color=color1+color2;

        if(color.equals("redblack")){
            System.out.println("darkred");
        }
        else{
            System.out.println("ic");
        }
    }
}