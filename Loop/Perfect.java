import java.util.Scanner;
class Perfect{
    public static void main (String arg[]){
        Scanner obj=new Scanner(System.in);

        int n=6;
        int s=0;

        for(int i=1 ; i<n ; i++){
            if(n%i==0){
                s=s+i;
            }
        }
        if(s==n){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}