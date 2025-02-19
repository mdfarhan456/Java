import java.util.Scanner;
class Multimissingnumbers{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
       
       int arr[]=new int[]{1,5,8,12,29};

       for(int i=0 ; i<arr.length-1 ; i++){
        if(arr[i+1]-arr[i]>1){
            for(int j=arr[i]+1;j<arr[i+1];j++){
                System.out.println(j);
            }
        }
       }
    }
}