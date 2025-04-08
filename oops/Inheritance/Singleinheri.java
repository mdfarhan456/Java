// class Two{
//     void show()
//     {
//         System.out.println("Single Inheritance");

//     }
// }
// public class Singleinheri extends Two{
//     public static void main(String arg[])
//     {
//         Singleinheri obj=new Singleinheri();
//         obj.show();
        

//     }
// }

class Shape{

    String color;

    void show(String color)
    {
        System.out.println(color);
    }
}
class Trangle extends Shape
{

}

class Singleinheri
{
    public static void main(String rgs[])
    {
        Trangle obj=new Trangle();
        obj.color="red";
        obj.show(obj.color);

    }
}