public class FactorialMethod {
    public static void main(String[] args) {
        fact(5);
    }
    public static void fact(int a){
        int factorial = 1 ;

        for (int i = 1 ; i <= a ; i++){
            factorial = factorial * i ;
        }
        System.out.println("Factorial is : " + factorial);
    }
}
