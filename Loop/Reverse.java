import java.util.Scanner;
class Reverse{
    public static void main(String arg[]){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter number");
        int num=obj.nextInt();
        int rev=0;
        int d=0;
       
       while(num!=0){
        d=num%10;
        rev=rev*10+d;
        num=num/10;
       }
       System.out.println(rev);

    }
}