public class MethodOverloading {
    public static void main(String[] args) {
        
        add(10 , 20);
        add(10 , 20 , 30);
        add(5.5 , 4.5);
    }
    public static void add(int a , int b){
        System.out.println("Addition : " + (a + b));
    }
    public static void add(int a , int b , int c){
        System.out.println("Addition : " + (a + b + c));
    }
    public static void add(double a ,double b){
        System.out.println("Addition : " + (a + b));
    }
}
