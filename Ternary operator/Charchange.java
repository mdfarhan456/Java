import java.util.Scanner;
public class Charchange{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a character");
        char b=obj.nextLine().charAt(0);
        char result;
        result=((b>='A'  && b<='Z')?((char)(b+32)):((char)(b-32)));
         System.out.println(result);
    }
}