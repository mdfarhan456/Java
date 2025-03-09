public class Rev{



   static void Rev(String str){
char arr[]=str.toCharArray();

int start=0;
int end=arr.length-1;

for(int i=0 ; i<arr.length/2 ; i++)
{

      char temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;

      start++;
      end--;
}
     String  obj=new String(arr);
     System.out.println(obj);
   }
 

  


    public static void main(String arg[]){
   
     String str="farhan";

     Rev(str);
    }
}