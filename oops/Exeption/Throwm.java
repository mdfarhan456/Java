// Runtime Exception................................................

// import java.util.Scanner;

// class Ae extends RuntimeException
// {

//     Ae()
//     {
//         super("divide by zero is not allowed");
//     }
// }
// class Result
// {
//     void divide()
//     {
//         Scanner obj=new Scanner(System.in);

//         int a=10;
//         int b;
//         System.out.println("enter a number");
//         b=obj.nextInt();
//         if(b==0)
//         {
//             throw new Ae();
//         }
//         else
//         {
//             int c;
//             c=a/b;
//             System.out.println(c);
//         }
        
//     }
// }


// public class Throwm
// {
//     public static void main(String arg[])
//     {
//         Result obj=new Result();
//         obj.divide();

//     }
// }





// Compiletime Exception.......................................

// import java.util.Scanner;
// class Ae extends Exception{
    
//      Ae()
//     {
//         super("divide by zero is not allowed");
//     }
    
// }
// class Result{
    
//     void arr()
//     {
//        Scanner obj=new Scanner(System.in);
//        int a=2;
//        int b;
//        System.out.println("enter a number");
//        b=obj.nextInt();
      
//        try{
//            if(b==0)
//            {
//                throw new Ae();
//            }
//            else{
//                int c;
//                c=a/b;
//                System.out.println(c);
//            }
//        }
//        catch(Ae e)
//        {
//            System.out.println(e);
//        }
    
      
       
//     }
// }
// public class Throwm
// {
// 	public static void main(String[] args) {
		
// 		Result obj=new Result();
// 		obj.arr();
// 	}
// }




// Throws method...............................................................


// import java.util.Scanner;
// import java.io.FileInputStream;
// import java.io.*;




// public class Throwm
// {
//     static void Result() throws FileNotFoundException {
//          FileInputStream obj=new FileInputStream("/c:abc.ext");

//     }
//     public static void main(String arg[])
//     {
       
//       try{
//         Result();
//       }
//       catch(Exception e)
//       {
//         System.out.println(e);
//       }
     

//     }
// }








//Runtime..................
// import java.util.Scanner;
// class Ae extends RuntimeException{
    
//      Ae()
//     {
//         super("this index is not allowed");
//     }
    
// }
// class Result{
    
//     void arr()
//     {
//         Scanner obj=new Scanner(System.in);
//         int a[]=new int[]{2,6,3};
//         int i;
//         System.out.println("enter index number");
//         i=obj.nextInt();


//         try{
            
//             System.out.println(a[i]);
//         }
//         catch(Exception e)
//         {
//             throw new Ae();
//         }
//     }
// }
// public class Throwm
// {
// 	public static void main(String[] args) {
		
// 		Result obj=new Result();
// 		obj.arr();
// 	}
// } 











//compiletime............................

import java.util.Scanner;
class Ae extends Exception{
    
     Ae()
    {
        super("this index is not allowed");
    }
    
}
class Result{
    
    void arr()
    {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[]{2,6,3};
        int i;
        System.out.println("enter index number");
        i=obj.nextInt();


        try{
            if(i>2){
             
             throw new Ae();
            }
            else{
                 System.out.println(a[i]);
            }
        }
        catch(Ae e)
        {
            System.out.println(e);
            
        }
    }
}
public class Throwm
{
	public static void main(String[] args) {
		
		Result obj=new Result();
		obj.arr();
	}
} 