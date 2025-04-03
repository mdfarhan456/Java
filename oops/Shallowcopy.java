// class Two{
//     int b;
    
//     Two(int b)
//     {
//         this.b=b;
//         // System.out.println(b);

//     }
//     Two(Two obj)
//     {
//         this.b=obj.b;
//         // System.out.println(b);
//     }
// void display()
// {
//     System.out.println(b);
// }

// }

// public class Shallowcopy{
//     public static void main(String arg[]){
//         Two obj=new Two(10);
//         Two obj1=new Two(obj);

//         obj.display();
//         obj1.display();

//         obj.b=11;
//         obj.display();
//         obj1.display(); // it will show old value coz we are making changes on obj not on obj1
//     }
// }



class Two
{
    int a;
    Two(int a)
    {
        this.a=a;
    }

    Two(Two obj)
    {
        this.a=obj.a;
    }
    void show()
    {
        System.out.println(a);
    }

}
public class Shallowcopy
{
    public static void main(String a[])
    {
        Two obj=new Two(10);
        Two obj1=new Two(obj);

        obj.show();
        obj1.show();

    }
}