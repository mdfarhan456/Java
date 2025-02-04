import java.util.Scanner;
public class Path{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter path");
        int path;
        path=obj.nextInt();
if(path==1)
{
         System.out.println("enter path");   
          path=obj.nextInt(); 
if(path==2){
   System.out.println("enter path");   
          path=obj.nextInt(); 
          if(path==3){
             System.out.println("enter path");   
          path=obj.nextInt(); 
          if(path==4){ System.out.println("reached");  }
          else{ System.out.println("wrong path"); }
          }
          else if(path==4){

 System.out.println("reached");   
        
          }
          else{
 System.out.println("wrong path");  
          }
}
else if(path==3){
  System.out.println("enter path");   
          path=obj.nextInt(); 
if(path==2){
  System.out.println("enter path");   
          path=obj.nextInt(); 
          if(path==4){System.out.println("reached");}
          else{
System.out.println("wrong path"); 
          }
}
else if(path==4){ System.out.println("reached");  }
else{ System.out.println("wrong path");  }

}
else if(path==4){
 System.out.println("reached");  
}
else{
 System.out.println("wrong path");  
}



        }
else{
 System.out.println("wrong path");  
}
    }
}