import  java.util.Scanner;
class Maxvalue{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        int size=0;
        System.out.println("enetr size of an array");
        size=obj.nextInt();

        

        int arr[]=new int[size];
        int max=arr[0];

        System.out.println("enetr elements of an array");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("bofere elements of array");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
           }
           System.out.println("largest value");
           System.out.println(max);

    
    }
}





         
            