public class DivisionWithMultipleParameters {
    static void divide(double a ,double b ){
        if(b == 0 ){
            System.out.println("Connot divide by Zero");
        }else{
            double result = a / b ;

            System.out.println("Division " + result);
        }
    }
    public static void main(String[] args) {
        divide(9 , 8);
    }
}
