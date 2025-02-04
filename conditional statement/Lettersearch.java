import java.util.Scanner;
public class Lettersearch{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String word;
        System.out.println("enter a word");
        word=obj.nextLine();

        char ch;
         System.out.println("enter a character");
         ch=obj.nextLine().charAt(0);

         if(word.charAt(0)==ch){
            System.out.println(ch+" "+"letter found in word");
         }

           if(word.charAt(1)==ch){
            System.out.println(ch+" "+"letter found in word");
         }

           if(word.charAt(2)==ch){
            System.out.println(ch+" "+"letter found in word");
         }

           if(word.charAt(3)==ch){
            System.out.println(ch+" "+"letter found in word");
         }

           if(word.charAt(4)==ch){
            System.out.println(ch+" "+"letter found in word");
         }

           if(word.charAt(5)==ch){
            System.out.println(ch+" "+"letter found in word");
         }
         else{
            System.out.println("no letter found");
         }
    }
}