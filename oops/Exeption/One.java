public class One {
    public static void main(String arg[]) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; 
            System.out.println(c);
        } catch (Exception e) {
            // e.printStackTrace(); 
            // e.getMessage();
            System.out.println(e); 
        }
        System.out.println("hello");
    }
}
