package HW19;

public class Task3 {
    private void method (String a){
        System.out.println(a);
    }
    private void method (String a, String b){
        System.out.println(a+" "+b);
    }
    private void method (int c){
        System.out.println(c);
    }
    private void method (int c, int d){
        System.out.println(c+d);
    }

    public static void main(String[] args) {
       Task3 obj = new Task3 ();
       obj.method("Hello");
       obj.method("Hello", "People");
       obj.method(2023);
       obj.method(10,20);
    }
}
