// import java.util.Scanner;
// public class Resumarr{

//     static int sumarr(){
//             Scanner obj=new Scanner(System.in);
//           int sum=0;

//         System.out.println("enter size of an array");
//         int size=obj.nextInt();

//         int arr[]=new int[size];
//         System.out.println("entr elements of an array");
//         for(int i=0 ; i<arr.length ; i++){
//             arr[i]=obj.nextInt();
//         }
//         for (int i=0 ; i<arr.length ; i++){
//             sum=sum+arr[i];
//         }
       
//         return sum;
      
//     }

//     public static void main(String arg[]){

       
     
//        System.out.print(sumarr());

       
//     }
// }




import java.util.Scanner;
public class Resumarr{

    static int sumarr(int arr[]){
          int sum=0;
        for (int i=0 ; i<arr.length ; i++){
            sum=sum+arr[i];
        }
       
        return sum;
      
    }

    public static void main(String arg[]){
  Scanner obj=new Scanner(System.in);

        System.out.println("enter size of an array");
        int size=obj.nextInt();

        int arr[]=new int[size];
        System.out.println("entr elements of an array");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=obj.nextInt();
        }
       
     System.out.println("sum of elements");
       System.out.print(sumarr(arr));

       
    }
}