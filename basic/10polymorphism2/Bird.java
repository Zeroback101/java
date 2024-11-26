package basic.10polymorphism2;

public class Bird extends AbstractAnimal implements Fly { // extends는 하나만 가능하기 때문에 먼저해야함
    @Override
    public void sound() { // 클래스 상속
        System.out.println("짹짹");
    }

    @Override
    public void fly() { // 인터페이스 구현
        System.out.println("Bird.fly");
    }
}
