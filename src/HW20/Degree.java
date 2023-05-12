package HW20;

public class Degree {
    void getPrerequisite (){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree {

}
class Masters extends Degree {
   @Override
    void getPrerequisite (){
        System.out.println("You don't need a high school diploma to get a degree");
    }
}
class DegreeTester {
    public static void main(String[] args) {
        Degree obj1 = new Degree();
        obj1.getPrerequisite();
        Bachelors obj2 = new Bachelors();
        obj2.getPrerequisite();
        Masters obj3 = new Masters();
        obj3.getPrerequisite();


    }
}