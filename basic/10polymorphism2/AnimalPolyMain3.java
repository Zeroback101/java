package basic.10polymorphism2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()}; 
        for (Animal animal : animals) {
            soundAnimal(animal);
        }

        // 문제점 1. Animal를 인스턴스로 사용하지 않는다. -> 추상 클래스
        Animal animal = new Animal(); 
        animal.sound();

        // 문제점 2. Animal의 sound를 오버라이딩 하지 않을 가능성 -> 추상 매서드
        Pig pig = new Pig();
        pig.sound(); 
    }

    // 동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("sound start");
        animal.sound(); 
        System.out.println("sound end");
    }
}
