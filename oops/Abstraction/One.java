abstract class Two{
    abstract void on();
    abstract void of();
}

class One extends Two{

    void on(){
        System.out.println("tv is on");
    }

    void of(){
        System.out.println("tv is of");
    }



    public static void main(String arg[])
    {
        One obj=new One();
        obj.on();
        obj.of();

    }
}

// Condition of Abstraction..........

//abstract=show neccesary data and hide unneccesary data
// Abstraction class=(1 or more than one Abstract function)
// Abstract function=Abstract keyword (it does not have implemntation)
// implemntation is neccesary in inherited class otherwise class abstract
// abstract class (can not directly create object)