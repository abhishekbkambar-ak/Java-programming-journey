public class StaticVsInstanceMethods {
    //Static method
    static void greet(){
        System.out.println("Hello This is a Static Method : ");
    }

    void sayHello(){
        System.out.println("Hello This is a non-static Method : ");
    }

    public static void main(String[] args) {

        // Calling a static Method
        greet(); 

        //creating an object 
        StaticVsInstanceMethods obj = new StaticVsInstanceMethods();

        //Calling a non-static method using the object 
        obj.sayHello();
    }
}
