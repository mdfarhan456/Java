interface engine
{
    void start();
}
class electrictrain implements engine
{
    public void start()
    {
        System.out.println("train is on");
    }
}
class bikepetrol implements engine
{
    public void start()
    {
        System.out.println("bike is on");
    }
}
class cardesel implements engine
{
    public void start()
    {
        System.out.println("car is on");
    }
}

public class LooseCoupling
{
    public static void main(String arg[])
    {
        engine obj=new cardesel();
        obj.start();

         engine obj1=new electrictrain();
        obj1.start();

         engine obj2=new bikepetrol();
        obj2.start();

    }
}