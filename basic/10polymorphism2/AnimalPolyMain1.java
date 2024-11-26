package basic.10polymorphism2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog); // 부모는 자식을 담을 수 있다.
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) { 
        System.out.println("sound start");
        animal.sound(); // 오버라이딩된 메서드가 있으면 그 메서드를 우선적으로 호출함
        System.out.println("sound end");
    }
}
