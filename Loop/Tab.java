import java.util.Scanner;
class Tab{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int n=obj.nextInt();
        // int sum=1;
        int fac=1;
        for(int i=1 ; i<=n ; i++){
           // fac=fac*i;
            // sum=sum+i;

            if(n%i==0){
System.out.println(i);
            }
            
        }
        // System.out.println("sum of"+ n +"numbers =" + fac);
        // System.out.println("sum of"+ n +"numbers =" + sum);
    }
}


// import java.util.Scanner;
// class Tab{
//     public static void main(String arg[]){
//         Scanner obj=new Scanner(System.in);
        
//         for(int i=2 ; i<=10 ; i++){
//             for (int j=1 ; j<=10 ; j++){
//             System.out.println(i*j);

//             }
//         }
//     }
// }