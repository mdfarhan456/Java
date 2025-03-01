// import java.util.Scanner;
// public class Nonreturn{

//     static void sum(){
//          int a=2;
//          int b=3;
//         System.out.println(a+b);
//     }

//     public static void main(String arg[]){
//         sum();



//     }
// }


import java.util.Scanner;
public class Nonreturn{

    static void sum(int a , int b){
     
        System.out.println(a+b);
    }

    public static void main(String arg[]){
     Scanner obj=new Scanner(System.in);

     System.out.println("enter a");
     int a=obj.nextInt();

       System.out.println("enter b");
       int b=obj.nextInt();

       sum(a,b);


    }
}