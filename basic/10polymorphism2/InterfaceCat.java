package basic.10polymorphism2;

public class InterfaceCat implements  InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("Cat.move");
    }
}
