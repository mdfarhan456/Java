class Two{
    void Show()
    {
        System.out.println("Hierarchical inheritance");
    }
}
class Three extends Two{

}

public class Hierarchical extends Two{
    public static void main(String arg[])
    {
        // Hierarchical obj=new Hierarchical();
        // obj.Show();

        Three obj=new Three();
        obj.Show();

    }
}