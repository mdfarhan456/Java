class Two{

    int arr[];

    Two(int arr[])
    {
        this.arr=arr;
        // System.out.println(arr); //this is printing address 
    }
    Two(Two obj)
    {
        this.arr=obj.arr;
    }
    void display()
    {
        for(int i:arr)
        {
            System.out.print(i);
        }
        System.out.println();
    }

}

class Deepcopy {
    public static void main(String arg[])
    {
        int arr[]={2,4,5,6};
        Two obj=new Two(arr);
        Two obj1=new Two(obj);

        obj.display();
        obj1.display();

        obj.arr[0]=8;
         obj.display();
        obj1.display();  //its value will  change coz they sharing memory

    }
}




// class Two{

//     int arr[];

//     Two(int arr[])
//     {
//         this.arr=new int[arr.length];
//          for(int i=0 ; i<arr.length ; i++)
//         {
//             this.arr[i]=arr[i];
//         }
       
//     }
//     Two(Two obj)
//     {
//         this.arr=new int[obj.arr.length];
//          for(int i=0 ; i<arr.length ; i++)
//         {
//             this.arr[i]=obj.arr[i];
//         }
       
//     }
//     void display()
//     {
//         for(int i:arr)
//         {
//             System.out.print(i);
//         }
//         System.out.println();
//     }

// }

// class Deepcopy {
//     public static void main(String arg[])
//     {
//         int arr[]={2,4,5,6};
//         Two obj=new Two(arr);
//         Two obj1=new Two(obj);

//         obj.display();
//         obj1.display();

//         obj.arr[0]=8;

//         obj.display(); 
//         obj1.display();  //its value will not change coz we have assigned new memory to bothe obj

//     }
// }