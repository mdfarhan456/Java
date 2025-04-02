class Two{
    private int a;
    void set(int a)
    {
        this.a=a;
    }
    void get()
    {
        System.out.println(this.a);
    }
}

class One{
    public static void main(String arg[]){

        Two obj=new Two();
        obj.set(20);
        obj.get();

    }
}

//em]ncapsulation wrapping of data members into members function inside a single entity(class)
//data hiding=Abstraction
