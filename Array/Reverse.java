import java.util.Scanner;
class Reverse{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        // int arr[] = new int[]{2,5,3,7,5,4};
        int size=0;
        System.out.print("enter size of an array");
        size=obj.nextInt();
        int arr[] = new int[size];

        int start=0;
        int end=arr.length-1;
       
       
 System.out.println("enetr value of an array");
        for(int i=0 ; i<arr.length ; i++){
           
            arr[i]=obj.nextInt();
            
        }
 System.out.println("before reverse");
        for (int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
       

        while(start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println("after reverse");
        for(int j:arr){
            System.out.println(j);
        }
    }
}

