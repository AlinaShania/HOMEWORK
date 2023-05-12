package HW19;

public class Programming {
    String a;
    Programming (){
        System.out.println("I love programming languages");
    }
    Programming (String a){
        this.a = a;
        System.out.println("I love "+a);
    }
}
class ProgrammingTester {
    public static void main(String[] args) {
        Programming obj1 = new Programming();
        Programming obj2 = new Programming ("Java");
    }
}
