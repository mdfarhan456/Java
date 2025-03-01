import java.util.Scanner;
public class Sumarr{

    static void sumarr(){
             Scanner obj=new Scanner(System.in);

        System.out.println("enter size of an array");
        int size=obj.nextInt();

        int arr[]=new int[size];
System.out.println("entr elements of an array");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=obj.nextInt();
        }
        int sum=0;
        for (int i=0 ; i<arr.length ; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String arg[]){
   

        sumarr();
    }
}