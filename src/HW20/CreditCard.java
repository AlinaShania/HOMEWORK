package HW20;

public class CreditCard {
    double balance;
    double interest;
    void method () {
        System.out.println((balance*interest)/24);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    void method () {
        System.out.println((balance*interest)/12);
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard();
        obj1.method();
        Visa obj2 = new Visa ();
        obj2.method();
        AX obj3 = new AX();
        obj3.method();
    }
}
