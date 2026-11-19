public class ReturnDoubleExample {
    static double divide(double a , double b ){

        double result = a / b ;
        return result ;

    }
    public static void main(String[] args) {
        double result = divide(10 , 3);

        System.out.println("Division : " + result);
    }

}
