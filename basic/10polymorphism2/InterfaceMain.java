package basic.10polymorphism2;

public class InterfaceMain {

    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스 인스턴스화 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("sound start");
        animal.sound(); // 오버라이딩된 메서드가 있으면 그 메서드를 우선적으로 호출함
        System.out.println("sound end");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("move start");
        animal.move(); // 오버라이딩된 메서드가 있으면 그 메서드를 우선적으로 호출함
        System.out.println("move end");
    }
}
