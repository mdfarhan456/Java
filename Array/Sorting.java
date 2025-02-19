// class Sorting{
//     public static void main(String arg[]){
       
//        int arr[]=new int[]{4,5,2,1,6,9,7};
// int j=1;
//        for(int i=0 ; i<arr.length ; i++){

//             if(arr[i]<arr[j]){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 j++
               

                
//             }
//         }
//         for(int i=0 ; i<arr.length ; i++){
//              System.out.print(arr[i]+",");
//         }
        
//        }

       
//        }
    


class Sorting {
    public static void main(String arg[]) {
        int arr[] = new int[]{4, 5, 2, 1, 6, 9, 7};

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
