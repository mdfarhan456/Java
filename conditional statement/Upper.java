import java.util.Scanner;
public class Upper{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a character");
        char ch;
        ch=obj.nextLine().charAt(0);
        char r;
        
        if(ch>='A' && ch<='Z'){
            r=((char)(ch+32));
            System.out.println(r);

        }
        else{
              r=((char)(ch-32));
            System.out.println(r);
        }
    }
}