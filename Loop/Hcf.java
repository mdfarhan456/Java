import java.util.Scanner;
class Hcf{
    public static void main (String arg[]){
         Scanner obj=new Scanner(System.in);
          int num1, num2,i,s;
   System.out.println("enter first number");
     num1=obj.nextInt();

    System.out.println("enter second number");
    num2=obj.nextInt();
    if(num1<num2){
    s=num1;
    }
    else{
    s=num2; 
    } 
    for(i=s;i>=1;i--)
    {
        if(num1%i==0 && num2%i==0)
        {
            System.out.println(i);
       
       break;
        }
    }

    }
}