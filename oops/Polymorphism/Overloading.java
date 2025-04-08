class Two{
   int a;
   int b;
   void show(int a)
   {
    System.out.println(a);
    

   }
   void show(int b, int a)
   {
     System.out.println(b);
     System.out.println(a);
    
    

   }


}

public class Overloading
{
    public static void main(String arg[])
    {
        Two obj=new Two();
        obj.a=5;
        obj.b=6;

        obj.show(obj.a);
        obj.show(obj.a,obj.b);
        
        


    }
}