public class ReturnValueExample {
    static int add(int a ,int b){
        int sum = a + b ;

        return sum ;
    }
    public static void main(String[] args) {
        int result = add(50 , 25);

        System.out.println("Addition : " + result);
    }
}
