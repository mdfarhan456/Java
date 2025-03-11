import java.util.Scanner;
class Numbersintoword{
    public static void main(String arg[]){

        Scanner obj = new Scanner (System.in);

System.out.println("enter a number");
int number;
number=obj.nextInt();

int digit=0;
int rev=0;
int count=0;
String result;
while(number!=0)
{
    digit=number%10;
    rev=rev*10+digit;
    count++;
    number=number/10;
}

while(count!=0)
{
    digit=rev%10;
  result = switch(digit)
    {
        case 0->"zero";
        case 1->"one";
            case 2->"two";
                case 3->"three";
                    case 4->"four";
                        case 5->"five";
                            case 6->"six";
                                case 7->"seven";
                                    case 8->"eight";
                                        case 9->"nine";
                                        default->"invalid";
    };

    System.out.println(result);
  count--;
    rev=rev/10;
}





    
    }
}


// import java.util.Scanner;
// class Numbersintoword{
//     public static void main(String arg[]){
//         Scanner obj=new Scanner(System.in);
//         System.out.println("enter number");
//         int n=obj.nextInt();
//         int r=0;
//         int d=0;
//         int c=0;

//         for (int i=1 ; i<=n ; i++){
//             d=n%10;
//             r=r*10+d;
//             c++;
//             n=n/10;
//         }
//         System.out.println(c);
//         for (int i=c ; i>=1 ; i--){
//                d=r%10;
//  String result = switch(d)
//     {
//         case 0->"zero";
//         case 1->"one";
//             case 2->"two";
//                 case 3->"three";
//                     case 4->"four";
//                         case 5->"five";
//                             case 6->"six";
//                                 case 7->"seven";
//                                     case 8->"eight";
//                                         case 9->"nine";
//                                         default->"invalid";
//     };

//     System.out.println(result);
 
//     r=r/10;
//         }
//     }
// }