import  java.util.Scanner;
class Minvalue{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);

        // int size;
        // System.out.println("enetr size of an array");
        // size=obj.nextInt();

        

        int arr[]=new int[]{4,6,2,6,7};
        int min=arr[0];

        // System.out.println("enetr elements of an array");
        // for(int i=0 ; i<arr.length ; i++){
        //     arr[i]=obj.nextInt();
        // }

        // System.out.println("bofere elements of array");
        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.println(arr[i]);
        // }

        for(int k=0 ; k<arr.length ; k++){
            if(arr[k]<min){
                min=arr[k];
            }
            
           }
           System.out.println("smallest value");
           System.out.println(min);

    
    }
}