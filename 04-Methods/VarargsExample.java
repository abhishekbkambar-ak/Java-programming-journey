public class VarargsExample {
    static void addNumbers(int... numbers){

        int sum = 0 ;

        for (int number : numbers){
            sum = sum + number ;
        }
        System.out.println("Total: " + sum );
    }
    public static void main(String[] args) {
        
        addNumbers(10 , 20);
        addNumbers(10 , 20 , 30);
        addNumbers(10 , 20 , 30 , 40 , 50);
        addNumbers(5 , 10 , 15 , 20);
    }
}
