package basic.10polymorphism2;

public abstract class AbstractAnimal { // 추상 클래스

    public abstract void sound(); // 추상 메서드

    public void move() { // 추상 메서드가 아님
        System.out.println("AbstractAnimal.move");
    }
}
