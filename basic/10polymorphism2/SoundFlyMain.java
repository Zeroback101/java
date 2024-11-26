package basic.10polymorphism2;

public class SoundFlyMain {
    public static void main(String[] args) {
        Bird bird = new Bird();

        soundAnimal(bird); // 클래스 상속

        flyAnimal(bird); // 인터페이스 구현
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("sound start");
        animal.sound();
        System.out.println("sound end");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("fly start");
        fly.fly();
        System.out.println("fly end");
    }
}
