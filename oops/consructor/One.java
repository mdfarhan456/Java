//Non parameterizez.....

// class Two
// {
//     Two(){
     
//        System.out.println("consuructoe called");

//     }
// }
// public class One
// {
//     public static void main(String arg[])
//     {

//         Two obj=new Two();
        

//     }
// }



//Parametrazied................

// class Two
// {
//     Two(String name , int age){
//         System.out.println(name);
//         System.out.println(age);
     
       

//     }
// }
// public class One
// {
//     public static void main(String arg[])
//     {

//         Two obj=new Two("farhan",21);
        

//     }
// }


//Copy constructor......................

class Two
{
    String name="";
    int age;

    Two(String name , int age)
    {
        this.name=name;
        this.age=age;

        System.out.println(this.name);
        System.out.println(this.age);

    }

    Two(Two obj)
    {
          this.name=obj.name;
          this.age=obj.age;

        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class One
{
    public static void main(String arg[])
    {
        Two obj= new Two("farhan",21);
        
        
        Two obj1=new Two(obj);

    }

}
