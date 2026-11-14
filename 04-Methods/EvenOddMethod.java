public class EvenOddMethod {
    public static void main(String[] args) {
        checkEvenOdd(10);
        checkEvenOdd(7);
    }
    public static void checkEvenOdd(int a ){
        if (a % 2 == 0){
            System.out.println(a + " is Even ");
        }else{
            System.out.println(a + " is Odd ");
        }
    }
}
