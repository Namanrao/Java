package ObjectOrientedProgramming.Polymorphism;

public class test {

    public static void main(String[] args) {
        Animal dog = new Dog();  //I am creating an object of Dog with the reference of Animal class. Because it is a  super /parent class.
//        this  is known as polymorphism .
        dog.makeSound();
    }
}
