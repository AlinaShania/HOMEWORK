package HW19;

public class Task2 {

    static void method (){
        System.out.println("Empty");
    }
    static void method( int a){
        System.out.println(a);
    }
    static void method(String name){
        System.out.println(name);
    }
    static void method (String name, String statement){
        System.out.println(name+" "+statement);
    }

    public static void main(String[] args) {
        method();
        method(2023);
        method("Alina");
        method("Alina","is Happy");
    }
}
