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

import java.util.Scanner;

class Ae extends Exception
{

    Ae()
    {
        super("divide by zero is not allowed");
    }
}
class Result
{
    void divide()
    {
       

        int a=10;
        int b=0;
        int c;
        c=a/b;

        try
        {
            throw new Ae();
        }
        
        catch(Exception e)
        {
            
            System.out.println(e);
        }

       
        
        
    }
}


public class Throwm
{
    public static void main(String arg[])
    {
        Result obj=new Result();
        obj.divide();

    }
}





// Throws method


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