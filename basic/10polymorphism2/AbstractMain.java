package basic.10polymorphism2;

public class AbstractMain {

    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
        AbstractCat cat = new AbstractCat();
        AbstractCaw caw = new AbstractCaw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) { // 다형적 참조
        System.out.println("sound start");
        animal.sound(); // 메서드 오버라이딩
        System.out.println("sound end");
    }
}
