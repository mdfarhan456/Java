class Student
{
    Student(String name)
    {
        System.out.println("name:"+name);
    }
    Student(String name ,int rollnum)
    {
        System.out.println("name:"+name+" "+"rollnum:"+rollnum);
    }
    Student(String name ,int rollnum , int marks)
    {
        System.out.println("name:"+name+" "+"rollnum:"+rollnum+" "+"marks:"+marks);
    }
}
public class Stu
{
    public static void main(String args[])
    {
        Student obj=new Student("farhan");
        Student obj1=new Student("sakib",5);
        Student obj2=new Student("jaid",8,75);

    }
}