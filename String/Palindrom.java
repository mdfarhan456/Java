public class Palindrom{



   static void Palin(String str){
char arr[]=str.toCharArray();

int start=0;
int end=arr.length-1;

boolean pal=true;

while(start<end){
    
    if(arr[start]!=arr[end]){
        pal = false;
        break;
    }
    start++;
    end--;
}
if(pal){
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}

   }


    public static void main(String arg[]){
   
     String str="madam";

     Palin(str);
    }
}