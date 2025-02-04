import java.util.Scanner;
public class Wovel{
    public static void main(String arg[]){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter a character");
        char ch;
        ch=obj.nextLine().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch+" "+"is a wovel");
        }

        else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println(ch+" "+"is a wovel");
        }
        else{
            System.out.println(ch+" "+"is  a consonent");
        }
    }
}