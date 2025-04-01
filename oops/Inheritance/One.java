// // Loose coupling
// class Two{
//  int a;

//     void Show()
//     {
//        System.out.println("abc");
//     }
// }

// class Three{
    
// }
// public class One{

//     public static void main(String arg[])
//     {

//         Two obj = new Two();
//         obj.Show();
//         obj.a=11;
//         System.out.println(obj.a);


//     }

// }





// Autowiring




class Two{
 int a;

    void Show()
    {
       System.out.println("abc");
    }
}

class Three extends Two{

    void display()
    {
        System.out.println(a);
    }
    
}
public class One extends Three{

    public static void main(String arg[])
    {

        Two obj = new Two();
        obj.Show();
        obj.a=11;
        System.out.println(obj.a);

        Three obj1=new Three();
        obj1.display();

        
       One obj2=new One();
        obj2.display();



    }

}