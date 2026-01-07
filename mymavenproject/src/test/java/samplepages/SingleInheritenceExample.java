package samplepages;

class Dog extends Animal_SingleInheritance {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritenceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method
    }
}