import java.util.Scanner;
class Dimondp{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        int a=0;
        for(int r=1 ; r<=9 ;r++){
            a=(r<=5)?++a:--a;

            for(int c=1 ; c<=9 ; c++){
                if(c>=6-a && c<=4+a){
                    System.out.print("*");
                }
                else{
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}