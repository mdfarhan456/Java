import java.util.Scanner;
class Veg{
    public static void main(String arg[]){
        Scanner obj = new Scanner (System.in);

        System.out.println("What do you want to buy vegetables and fruits:");
        String ch=obj.nextLine();

        switch(ch){
           case "vegetables"->
            {
                System.out.println("which vegetable you want to buy potato or capsicum");
                String veg=obj.nextLine();

                switch(veg){

                case "capsicum"->{
                
                    System.out.println("capsicum is 100rs kg");
                }
                

                    case "potato"->{
                
                    System.out.println("Potato is 50rs kg");
                    }

                    default->{
                        System.out.println("we dont have that vegetabe");
                    }

                 }

             }

             case "fruits"->{
                System.out.println("which fruits you want to buy banana or mango");
                String fruits=obj.nextLine();

                switch(fruits){

                    case "banana"->{
                        System.out.println("you have to pay 120rs");
                    }

                    case "mango"->{
                        System.out.println("you have to pay 150rs");
                    }

                    default->{
                        System.out.println("we dont have that fruit");
                    }
                }
             }
             default->{
            System.out.println("wrong input");
        }
        }
        
        
    }
}