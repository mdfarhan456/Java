// import java.util.Scanner;
// class Missingnumber{
//     public static void main(String arg[]){
//         Scanner obj=new Scanner(System.in);

//      int arr[]=new int[]{1,3,5,7,9};
        // int size=0;

// System.out.println("enetr size of an aarray");
// size=obj.nextInt();
//         int arr[]=new int[size];


// System.out.println("enetr elemets of an array");
// for(int k=0 ; k<arr.length ; k++){
//     arr[k]=obj.nextInt();
// }

//         System.out.println("missing numbers");
//         for (int i=0;i<arr.length-1;i++){
//             if(arr[i+1]-arr[i]>1){
//                 System.out.println(arr[i]+1);
//             }
//         }
//     }
// }



import java.util.Scanner;
class Missingnumber{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

     int arr[]=new int[]{2,4,6,8,10};
     
     for(int i=0 ; i<arr.length ; i++){
        if(arr[i+1]-arr[i]>1)
        {
            System.out.println(arr[i]+1);
        }
     }
     
     }
     }