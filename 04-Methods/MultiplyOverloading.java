public class MultiplyOverloading {
    public static void main(String[] args) {
        multiply(3 , 4);
        multiply(2 , 5 , 3);
    }
    public static void multiply(int a , int b){
        System.out.println("Multiplication : " + (a * b));
    }
    public static void multiply(int a , int b , int c){
        System.out.println("Multiplication : " + (a * b * c));
    }
}
