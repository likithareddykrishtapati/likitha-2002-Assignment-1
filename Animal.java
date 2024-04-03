class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of both derived classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Invoking the makeSound() method
        dog.makeSound(); // Output will be "Dog barks"
        cat.makeSound(); // Output will be "Cat meows"
    }
}
