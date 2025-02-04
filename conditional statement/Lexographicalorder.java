import java.util.Scanner;
class Lexographicalorder{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String w1 , w2 , w3;
        System.out.println("enter first word");
        w1=obj.nextLine();

        System.out.println("enter Second word");
        w2=obj.nextLine();

        System.out.println("enter three word");
        w3=obj.nextLine();

        if(w1.compareTo(w2)>0){
            String temp;
            temp=w1;
            w1=w2;
            w2=temp;
        }

        if(w1.compareTo(w3)>0){
            String temp;
            temp=w1;
            w1=w3;
            w3=temp;
        }

        if(w2.compareTo(w3)>0){
            String temp;
            temp=w2;
            w2=w3;
            w3=temp;
        }

        //  else if(w2.compareTo(w3)>0){
        //     String temp;
        //     temp=w2;
        //     w2=w3;
        //     w3=temp;
        // }

        System.out.println(w1+" "+w2+" "+w3);
        
    }
}
