// import java.util.Scanner;
// public class Paramidp {
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);

   

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <=9 ; j++) {
//                 if(j>=6-i && j<=4+i){
//                 System.out.print("*"); 
//                 }
//                 else{
//                      System.out.print(" ");
//                 }
//             }
//             System.out.println(); 
//         }
//     }
// }


import java.util.Scanner;

public class Paramidp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        
        System.out.println("Enter the number of rows for the pyramid: ");
        int rows = obj.nextInt();

        // System.out.println("Enter the number of coloum for the pyramid: ");
        // int coloum = obj.nextInt();
        
     
         int coloum = 2 * rows - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= coloum; j++) {
               
                if (j >= rows - i + 1 && j <= rows + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
