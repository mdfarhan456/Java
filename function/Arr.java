// import java.util.Scanner;
// public class Arr{

//   static void arr(){
//     int arr2[]=new int[]{2,6,9,3,0,5};

//     for(int i=0 ; i<arr2.length ; i++){
//         System.out.println(arr2[i]);
//     }
//   }
//   public static void main(String arg[]){
//     arr();
//   }
// }


import java.util.Scanner;
public class Arr{

  static void arr(){
    int arr2[]=new int[]{2,6,2,3,6,5};

    for(int i=0 ; i<arr2.length ; i++){
       
        boolean dub=false;
        for(int j =i+1; j<arr2.length; j++){

            if(arr2[i]==arr2[j]){
                arr2[j]=-1;
                dub=true;
            }
        }
        if(dub && arr2[i]!=-1){
            System.out.println(arr2[i]);
        }
    }
  }
  public static void main(String arg[]){
    arr();
  }
}



// import java.util.Scanner;
// public class Arr{

//   static int arr(int arr2[] , int i){
  
//   return arr2[i];

  
//   }
//   public static void main(String arg[]){
//       int arr2[]=new int[]{2,6,9,3,0,5};

//         for(int i=0 ; i<arr2.length ; i++){
//         System.out.println(arr2[i]);
//     }
//   }
// }



// import java.util.Scanner;
// public class Arr{

//   static int arr(int arr2[] , int i){
  
//   return arr2[i];

  
//   }
//   public static void main(String arg[]){
//     Scanner obj=new Scanner(System.in);

//     System.out.println("enter size of an array");
//     int size=obj.nextInt();
 
//     int arr2[]=new int[size];

//     System.out.println("enetr elements of array");
//     for(int i=0 ; i<arr2.length ; i++){
//         arr2[i]=obj.nextInt();
//     }
//  System.out.println(" elements of array");
//         for(int i=0 ; i<arr2.length ; i++){
//         System.out.println(arr2[i]);
//     }
//   }
// }