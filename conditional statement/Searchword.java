import java.util.Scanner;
class Searchword{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String word;
        char letter;
        System.out.println("enter a word");
        word=obj.nextLine();

        System.out.println("enter a letter");
        letter=obj.nextLine().charAt(0);

        if(word.charAt(0)==letter){
            System.out.println("letter found"+" "+letter);
        }

        else if(word.charAt(1)==letter){
            System.out.println("letter found"+" "+letter);
        }

       else if(word.charAt(3)==letter){
            System.out.println("letter found"+" "+letter);
        }

        else if(word.charAt(4)==letter){
            System.out.println("letter found"+" "+letter);
        }

        else if(word.charAt(5)==letter){
            System.out.println("letter found"+" "+letter);
        }

        else{
            System.out.println("letter not found"+" "+letter);
        }



    }
}