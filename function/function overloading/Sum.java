// import java.util.Scanner;
// public class Sum{
//     static int sum(int a , char b){
//         return a+b;
//     }
//     static int sum(char b , int a){
//         return a;
//     }

//     public static void main(String arg[]){
//         System.out.println(sum(2,'a'));
//         System.out.println(sum('a',6));
//     }
// }



// import java.util.Scanner;
// public class Sum{
//     static int sum(int a ,int b){
//         return a+b;
//     }
//     static int sum(int a){
//         return a;
//     }

//     public static void main(String arg[]){
//         System.out.println(sum(2,8));
//         System.out.println(sum(6));
//     }
// }

import java.util.Scanner;
public class Sum{
    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(char b , char a){
        return a+b;
    }

    public static void main(String arg[]){
        System.out.println(sum(3,7));
        System.out.println(sum('a','b'));
    }
}