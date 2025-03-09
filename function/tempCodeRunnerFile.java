import java.util.Scanner;
// public class Kthlargestnum{

//     static int kthl(int arr[],int k){
       
     
//         for(int i=0 ; i<k ; i++){

//             for(int j=i+1 ; j<arr.length ; j++){
//                 if(arr[i]<arr[j]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
                    
//                 }
//             }
//         }
//      ;
//         return arr[k-1];

//     }

//     public static void main(String arg[]){
//          Scanner obj=new Scanner(System.in);

//         System.out.println("enter size of an array");
//         int size=obj.nextInt();

//         int arr[]=new int[size];
//         System.out.println("enter elemenst of an array");
//         for (int i=0 ; i<arr.length ;i++){
//             arr[i]=obj.nextInt();
            
//         }
//            int k;
//         System.out.println("which largest number you want");
//         k=obj.nextInt();
//         System.out.println(kthl(arr,k));
//     }

// }