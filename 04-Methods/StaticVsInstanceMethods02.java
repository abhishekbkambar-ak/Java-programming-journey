public class StaticVsInstanceMethods02 {
    static void abhi(){
        System.out.println("Hello This is Static method with new name : ");
    
    }
    void sayAbhi(){
        System.out.println("hello this is non-static Method with new name : ");
    }
    static  void addition(){
        int a = 10;
        int b = 20;

        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {
        abhi();

        StaticVsInstanceMethods02 obj = new StaticVsInstanceMethods02();

        obj.sayAbhi();
        addition();
    }
    
}
