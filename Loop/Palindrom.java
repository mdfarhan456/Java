import java.util.Scanner;
class Palindrom{
    public static void main(String arg[]){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter number");
        int num=obj.nextInt();
        int org=num;
        int rev=0;
        int d=0;
       
       while(num!=0){
        d=num%10;
        rev=rev*10+d;
        num=num/10;
       }
       if(rev==org){
        System.out.println("Palindrom");
       }
       else{
         System.out.println("not Palindrom");
       }

    }
}