import java.util.Scanner;
public class Tour{
    public static void main(String arg[]){
        Scanner obj = new Scanner (System.in);
        System.out.println("please enter website(www.Tourism.com)");
        String web=obj.nextLine();

        if(web.equalsIgnoreCase("www.Tourism.com")){
            System.out.println("please choose visit type International or Domestic");
            String choice=obj.nextLine();

            if(choice.equalsIgnoreCase("International")){
                System.out.println("choose International Destination japan or russia");
                String destination=obj.nextLine();

                if(destination.equalsIgnoreCase("japan")){
                    System.out.println("you have to pay 200");
                }else if(destination.equalsIgnoreCase("russia")){
                    System.out.println("you have to pay 300");
                }else{
                    System.out.println("invalid international destinatioan ");
                }

                }else if(choice.equalsIgnoreCase("domestic")){
                System.out.println("choose domestic Destination Bhopal or indore");
                String destination=obj.nextLine();

                if(destination.equalsIgnoreCase("indore")){
                    System.out.println("you have to pay 400");
                }else if(destination.equalsIgnoreCase("bhopal")){
                    System.out.println("you have to pay 500");
                }else{
                    System.out.println("invalid domestic destinatioan ");
                }

                }else{
                    System.out.println("Invalid choice");
                }
        }else{
        System.out.println("Invalid website");
    }
    }
}