import  java.util.Scanner;
class Decending{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        int size=0;
        System.out.println("enetr size of an array");
        size=obj.nextInt();

        int arr[]=new int[size];
        System.out.println("enetr elements of an array");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("bofere elements of array");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }

        for(int i=0 ; i<arr.length ; i++){
            
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after array elements");
        for (int i=0 ; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}