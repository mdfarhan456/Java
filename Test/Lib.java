class Library{
      
      void add(String... book)
      {
           
            System.out.println("Added books..............");
            for(String i:book)
            {
                  
                  System.out.println(i);
            }

      }
      void remove(String... book)
      {
             String removedBook = book[book.length - 1];
             String[] newStr = new String[book.length - 1];
             

               for (int i = 0; i < newStr.length; i++) {
               newStr[i] = book[i];
               
        }
        System.out.println("Removed book..........");
        System.out.println(removedBook);
      //   return newStr;
        
            
           

      }
      void display(String... book)
      {
            
            System.out.println("Display books..............");
            
             
             String[] newStr = new String[book.length - 1];
             

               for (int i = 0; i < newStr.length; i++) {
               newStr[i] = book[i];
               System.out.println(newStr[i]);
               
        }
             
      }
}

public class Lib{
      public static void main(String arg[]){
            String[] book=new String[]{"java","python","php","c++"};
            Library obj=new Library();
            obj.add(book);
            obj.remove(book);
            obj.display(book);
            


      }
}