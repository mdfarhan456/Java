class Accendiorder{
    public static void main(String arg[]){

        int arr[]=new int[]{3,6,9,6,23};
int k=2;
        // for(int i=0 ; i<arr.length ;i++){

         for(int i=0 ; i<k ;i++){

            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp;

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        // // for(int i=0 ; i<arr.length ;i++){
        // //     System.out.println(arr[i]);
        // }
 System.out.println(arr[k-1]);

    }
}