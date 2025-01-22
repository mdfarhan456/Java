import java.util.Scanner;
class Grade{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        int marks;
        System.out.println("enter yout marks");
        marks=obj.nextInt();
        if(marks>90){
            System.out.println("Grade A");
        }
         if(marks>75 && marks<90){
            System.out.println("Grade B");
        }
         if(marks>65 && marks<75){
            System.out.println("Grade C");
        }
        if(marks>0 && marks<65){
            System.out.println("Fail");
        }
    }
}