public class One {
    public static void main(String arg[]) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; 
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace(); 
            // e.getMessage();
            // System.out.println(e); 
        }
        // System.out.println("hello");
    }
}

// public class One
// {
//     public static void main(String arg[])
//     {
//         try{
//             int arr[]=new int[]{4,5,2};
//             System.out.println(arr[6]);

//         }
//         catch(Exception e)
//         {
//             e.getMessage();
//         }
//         // System.out.println("code will run after Exception");

//     }
// }
