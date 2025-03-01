import java.util.Scanner;
class Nthlargestvalue{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        int arr[]=new int[]{5,7,8,3,9,2};
int k;
System.out.println("which largest number you want");
k=obj.nextInt();

         for (int i=0 ; i<arr.length ; i++){  // it will check whole array

        //  for (int i=0 ; i<k ; i++){  // it will check which largest number we want
        
             
             for (int j=i+1 ; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
             }
            
        }
        System.out.println(k+" largest number");
         System.out.println(arr[k-1]);
    }
}