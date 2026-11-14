public class AreaWithReturn {
    public static void main(String[] args) {
        
        double area = calculateArea(10,5);

        System.out.println("Rectangle Area : " + area);
    }
    public static double calculateArea(double length , double width){
        return length * width ;
    }
}
