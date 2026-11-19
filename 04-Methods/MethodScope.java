public class MethodScope {
    
    public static void main(String[] args) {
        
        int a = 10 ;
        if (a > 5){
            int b = 20;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        System.out.println("a outside if = " + a);
    }
}
