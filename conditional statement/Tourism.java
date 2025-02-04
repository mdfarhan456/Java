import java.util.Scanner;
public class Tourism{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter website(www.Tourism.com)");
        String web=obj.nextLine();

        if(web.equals("www.Tourism.com")) {
            System.out.println("chose visit type:");
            System.out.println("1. International visit");
            System.out.println("2. Domestic visit");

            int choice=obj.nextInt();
            obj.nextLine();

            if(choice==1){
                System.out.println("Available Internaion destination");
                System.out.println("- Japan");
                System.out.println("- Russia");

                System.out.println("enter your Destination");
                String Destination=obj.nextLine();

                if(Destination.equals("Japan")){
                    System.out.println("you have to pay 200rs");
                }else if(Destination.equals("Russia")){
                    System.out.println("you have to pay 300rs");
                }else{
                    System.out.println("invalid international Destination");
                }

            }if(choice==2){
                System.out.println("Available Domestic destination");
                System.out.println("- Bhopal");
                System.out.println("- Indore");

                System.out.println("enter your Destination");
                String Destination=obj.nextLine();

                if(Destination.equals("Bhopal")){
                    System.out.println("you have to pay 600rs");
                }else if(Destination.equals("Indore")){
                    System.out.println("you have to pay 100rs");
                }else{
                    System.out.println("invalid Domestic Destination");
                }
            
        }else{
            System.out.println("Invalid choice");
        }

    }else{
        System.out.println("Invalid website");
    }
    
}
}