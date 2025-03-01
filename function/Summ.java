// public class Summ{

// static void sum()
// {
//     int sum1=0;
//     int n=10;

//     for(int i=1 ; i<=n ; i++){
//         sum1=sum1+i;
//     }
//     System.out.println(sum1);
// }
// public static void main(String arg[]){
//     sum();
// }

// }



// public class Summ{

// static int sum(int n , int n2)
// {
//     int sum1=0;
    

//     for(int i=1 ; i<=n2 ; i++){
//         sum1=sum1+i;
//     }
//     return sum1;
// }
// public static void main(String arg[]){
// int n1=1;
//   int n2=10;

//   System.out.println(sum(n1,n2));
// }

// }


import java.util.Scanner;
public class Summ{

static int sum(int n , int n2)
{
    int sum1=0;
    

    for(int i=1 ; i<=n2 ; i++){
        sum1=sum1+i;
    }
    return sum1;
}
public static void main(String arg[]){
  Scanner obj=new Scanner (System.in);

  System.out.println("enter start point");
  int n1=obj.nextInt();

   System.out.println("enter end point");
  int n2=obj.nextInt();


  System.out.println(sum(n1,n2));
}

}

