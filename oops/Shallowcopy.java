class Two{
    int b;
    
    Two(int b)
    {
        this.b=b;
        // System.out.println(b);

    }
    Two(Two obj)
    {
        this.b=obj.b;
        // System.out.println(b);
    }
void display()
{
    System.out.println(b);
}

}

public class Shallowcopy{
    public static void main(String arg[]){
        Two obj=new Two(10);
        Two obj1=new Two(obj);

        obj.display();
        obj1.display();

        obj.b=11;
        obj.display();
        obj1.display(); // it will show old value coz we are making changes on obj not on obj1
    }
}