// import java.util.Scanner;
// class Amstrong{
//     public static void main(String arg[]){
//         Scanner obj=new Scanner (System.in);
//         //System.out.println("enter number");
//         int num=153;
//         //=obj.nextInt();
//         int og =num;
//         int sum=0;
//         int d=0;
       
//        while(num!=0){
//         d=num%10;
//         sum=sum+d*d*d;
//         num=num/10;
//        }
//        if(sum==og){
//         System.out.println("Armstrong");
//        }
//        else{
//          System.out.println("not Armstrong");
//        }

//     }
// }


import java.util.Scanner;
class Amstrong{
    public static void main(String arg[]){
        Scanner obj=new Scanner (System.in);
        //System.out.println("enter number");
        int num=153;
        //=obj.nextInt();
        int og =num;
        int sum=0;
        int d=0;
       
       while(num!=0){
        num=num/10;
       }
       if(sum==og){
        System.out.println("Armstrong");
       }
       else{
         System.out.println("not Armstrong");
       }

    }
}