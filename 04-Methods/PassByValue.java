public class PassByValue {
    
    static void changeValue(int number){
        number = 100 ;
        System.out.println("Inside Method: " + number);
    }
    public static void main(String[] args) {
        
        int value = 50 ;
        System.out.println("Before Method : " + value);
        changeValue(value);
        System.out.println("After Method : " + value);
    }
}
