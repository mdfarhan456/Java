import java.util.Scanner;
class Dyanamic{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        System.out.println("enetr size of an array:");
        int size=obj.nextInt();

        int arr[]=new int[size];
        System.out.println("enetr elements of array:");
        for(int i=0 ; i<arr.length ;i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("Values of aarray");

        for (int i=0 ; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}

// import java.util.Scanner;

// class Dynamic {
//     public static void main(String arg[]) {
//         Scanner obj = new Scanner(System.in);
        
//         int size = 0;
//         System.out.println("Enter size of array:");
//         size = obj.nextInt();
    
//         int arr[] = new int[size];
        
//         System.out.println("Enter values for the array:");

//         // Taking input for array elements
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = obj.nextInt();
//         }

//         // Printing the values of the array
//         System.out.println("Array values:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }