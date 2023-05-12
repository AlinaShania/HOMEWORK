package HW19;

public class Task1 {
    double length;
    double width;
    double side;
     void calculateArea(double length, double width){
       this.length = length;
       this.width = width;
         System.out.println(length*width);
    }
    void calculateArea(double side){
         this.side = side;
        System.out.println(side*side);
    }
}
class Task1Tester{
    public static void main(String[] args) {
        Task1 rectangle = new Task1();
        rectangle.calculateArea(4.3,3.9);
        Task1 square = new Task1 ();
        square.calculateArea(4.0);
    }
}
