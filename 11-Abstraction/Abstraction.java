
// 1.Abstraction is a oops concept which we hide the implementation and 
// showing the esential features to users.
//  Abstract class can have both abstract methods and concrete methods.
// If the method is abstract then we cannot implement there

abstract class Abstraction {
    abstract void run(); //we cannot implement here as the method is abstract

    void walk() {
        System.out.println("Walk method");
    }
}

class child extends Abstraction {
    void run() {
        System.out.println("running method which is abstract");
    }
}

class B {
    public static void main(String[] args) {
        child c = new child();
        c.walk();
        c.run();
    }
}