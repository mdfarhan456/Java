// import java.util.Scanner;
// public class Returnn{

//     static int sum(int a , int b){
//         return a+b;
//     }
//     public static void main(String arg[]){
//         int a=3;
//         int b=7;
//         System.out.println(sum(a,b));

//         // System.out.println(sum(5,3));
//     }
// }



import java.util.Scanner;
public class Returnn{

    static int sum(int a , int b){
        return a+b;
    }
    public static void main(String arg[]){
      Scanner obj=new Scanner (System.in);

      System.out.println("enetr a");
      int a=obj.nextInt();

       System.out.println("enetr b");
      int b=obj.nextInt();

      System.out.println(sum(a,b));
    }
}