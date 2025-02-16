import java.util.Scanner;
class Sries{
    public static void main (String arg[]){
        Scanner obj=new Scanner(System.in);

        // int n=5;
        // int a=1;
        // int d=2;
        // int sum=0;

        
        // int n=6;
        // int a=1;
        //int d=3;
        // int sum=0;
        // int r=3;

        //  double n=5;
        // double a=1;
        // double sum=0;
        // double r=3;


         int n=5;
        int a=1;
        int sum=0;

        for(int i=0;i<n;i++){
            // sum=a+i*d;

            // sum=a*Math.pow(r,i);
            sum=sum*10+1; 


            System.out.println(sum);

        }
    }
}
