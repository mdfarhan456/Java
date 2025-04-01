class Two{
    void Show()
    {
        System.out.println("multilevel inharitance");
    }
}
class Three extends Two{

}

public class Multilevel extends Three{
    public static void main(String arg[])
    {
        Multilevel obj=new Multilevel();
        obj.Show();

    }
}