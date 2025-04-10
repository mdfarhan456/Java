// class Two{
//     private int a;
//     void set(int a)
//     {
//         this.a=a;
//     }
//     void get()
//     {
//         System.out.println(this.a);
//     }
// }

// class One{
//     public static void main(String arg[]){

//         Two obj=new Two();
//         obj.set(20);
//         obj.get();

//     }
// }

//em]ncapsulation wrapping of data members into members function inside a single entity(class)
//data hiding=Abstraction

class Two {
    private String name;
    private int age;

    // Setter for name
    void setName(String name) {
        this.name = name;
    }

    // Getter for name
    void getName() {
        System.out.println(this.name);
    }

    // Setter for age
    void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    void getAge() {
        System.out.println(this.age);
    }
}

public class One {
    public static void main(String[] args) {
        Two obj = new Two();

        obj.setName("Farhan");
        obj.setAge(21);

        obj.getName();
        obj.getAge();
    }
}
