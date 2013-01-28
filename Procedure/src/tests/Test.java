package tests;

/**
 * User: Igor Russo
 * Date: 29.01.13
 * Time: 0:05
 */
public class Test {
    public static void main(String[] args) {
            Parent child = new Child();
            Receiver advancedReceiver = new AdvancedReceiver();
            advancedReceiver.receive(child);
    }
}

class Parent {
    public void outMe() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void outMe() {
        System.out.println("Child");
    }
}

class Receiver {
    public void receive(Parent p) {
        System.out.println("Receiver");
        p.outMe();
    }
}

class AdvancedReceiver extends Receiver{
    public void receive(Child c) {
        System.out.println("AdvancedReceiver");
        c.outMe();
    }
}
