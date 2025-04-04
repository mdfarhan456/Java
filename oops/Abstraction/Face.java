// why we should use interface..........
//100% abstraction achieve
//Loose coupling
//multiple inheritance
//class by defoult defoult and interface by defoult public


// interface i1
// {
//     void on();
// }

// public class Face implements i1
// {
// public void on()
// {
//     System.out.println("tv is on");
// }

//     public static void main(String a[])
//     {
//         Face obj=new Face();
//         obj.on();

//     }
// }


//Multiple inheritance.....


interface i1{
    void on();
}
interface i2
{
    void off();
}

public class Face implements i1,i2
{
    public void on()
    {
        System.out.println("tv is on");
    }

      public void off()
    {
        System.out.println("tv is off");
    }


    public static void main(String arg[])
    {
        Face obj=new Face();
        obj.on();
        obj.off();

    }
}

