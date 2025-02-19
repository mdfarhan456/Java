import java.util.Scanner;
class Finddublicatevalue{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
         int arr[]=new int[]{2,4,5,6,2,4,2,4,2};
           
        //    int size=0;
        //  System.out.println("enetr size of an aray");
        // size=obj.nextInt();
        // int arr[]=new int[size];

        // System.out.println("enetr elements of array");
        // for(int k=0;k<arr.length ; k++){
        //     arr[k]=obj.nextInt();
        // }
  System.out.println("dublicate values");
           for(int i=0 ; i<arr.length ; i++){
            int c=1;
            boolean dub=false;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                arr[j]=-1;
                dub=true;
                c++;
                }
            }
               if(dub && arr[i]!=-1){
              
                    System.out.println(arr[i] +" repeated element="+" "+c);
                }
        }
    }
}