import java.util.Scanner;
class Topairsum
{
    public static void main(String arg[])
    {
        Scanner pbj=new Scanner(System.in);
        boolean flag=false;

        int arr[]=new int[]{4,5,6,7,2,3};
        int sum=50;

        for(int i=0 ; i<arr.length ;i++)
        {

            for (int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    flag=true;
                }
              
              

            }
        }
        if(!flag){
            System.out.println("there is no sum");
        }
    }
}