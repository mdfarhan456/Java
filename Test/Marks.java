class Arr
{
    void sort()
    {
        int arr[]=new int[]{44,55,89,35,30};

        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
                
            
            }
           
            
        }
        for(int i=0 ; i<arr.length ; i++)
        {
             System.out.println(arr[i]);
        }

    }
}

public class Marks
{
    public static void main(String arg[])
    {
        Arr obj=new Arr();
        obj.sort();


    }
}