import java.util.Scanner;

class Zeromovetolast{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        int arr[]=new int[]{3,4,6,7,0,8,0,0};

        int k=0;

        for(int i=0 ; i<arr.length ; i++){
            
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=k ; i<arr.length ; i++){
            arr[i]=0;

        }
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+",");
        }
    }
}