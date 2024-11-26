package basic.10polymorphism2;

public class InterfaceCaw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("Caw.move");
    }
}
