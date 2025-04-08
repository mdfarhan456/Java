class Two{
    void show()
    {
        System.out.println("2 class");
    }
}
class Three extends Two{
    void show()
    {
         System.out.println("3 class");  //it is overding function of Two class
    }
}



public class Overriding extends Three{

    public static void main(String arg[])
    {

        //if we want to access functio of TWO class we have to make object of Two class........
        // Two obj1=new Two();
        // obj1.show();


//overiding......
        // Overriding obj=new Overriding();
        // obj.show();

    }
}


// Polymorphism = many forms (object/function)
// static(compile time)=method overloaing
// dynamic(run time)=method overiding



// rule of overloading-->
// 1. Name of function should be shame
// 2. Function should be in diffrent class
// 3. there should be inheritance