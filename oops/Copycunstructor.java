// class Two{
//     int b;
    
//     Two(int a)
//     {
//         b=a;
//         System.out.println(b);

//     }
//     Two(Two obj)
//     {
//         b=obj.b;
//         System.out.println(b);
//     }


// }

// public class Copycunstructor{
//     public static void main(String arg[]){
//         Two obj=new Two(10);
//         Two obj1=new Two(obj);
//     }
// }




class Two{
int b;
    Two(int a)
    {

        b=a;
        System.out.println(b);

    }
    Two(Two obj)
    {

          b=obj.b;
        System.out.println(b);

    }
}
public class Copycunstructor
{
    public static void main(String arg[])
    {
        Two obj=new Two(10);
        Two obj1=new Two(obj);
       
        
        
    }
}