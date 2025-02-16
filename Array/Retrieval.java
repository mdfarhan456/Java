import java.util.Scanner;
class Retrieval{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[]{1,3,6,4,7};

        // for(int i=0 ; i<5 ; i++){
        //     System.out.println(arr[i]);
        // }

        for(int i:arr){
            System.out.println(i);
        }
    }
}