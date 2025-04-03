// // import java.util.Scanner;
// // class Two
// // {
// //     class Three
// //     {
// //         void display()
// //         {
// //             Scanner sc= new Scanner (System.in);
// //             System.out.println("Enter a number");
// //             int a;
// //             a=sc.nextInt();
// //             System.out.println(a);
// //         }
// //     }
// // }
// // public class One 
// // {
// //     public static void main(String args[])
// //     {
// //         Two obj =new Two();
// //         Two.Three obj1 =  obj.new Three();
// //         obj1.display();
// //     }
// // }




// import java.util.Scanner;
// class Two
// {
//     void display(int c)
//     {
//         int d=c;
//         Scanner sc= new Scanner (System.in);
//         System.out.println("Enter a number");
//         int a;
//         a=sc.nextInt();
//         System.out.println(a);
//         System.out.println(c);
//     }
// }
// public class One 
// {
//     public static void main(String args[])
//     {
//         Two obj =new Two();
//         // int c=2;
//         obj.display(2);
//     }
// }




import java.util.Scanner;
class Two{
   
    void show(int c)
    {
       int d=c;
       Scanner obj=new Scanner (System.in);
        System.out.println("enter a number");
        int a;
         a=obj.nextInt();

        System.out.println(a);
        System.out.println(d);
    }

}

public class One
{
    public static void main(String arg[])
    {
        Two obj=new Two();
        int c=5;
        obj.show(c);
        
    }

}