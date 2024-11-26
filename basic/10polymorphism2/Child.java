package basic.10polymorphism2;

public class Child implements InterfaceA, InterfaceB { // 인터페이스의 다중 구현
    @Override
    public void methodA() { // A 인터페이스의 메서드
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() { // B 인터페이스의 메서드
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() { // 같은 메서드는 구현을 하나만 하면됨
        System.out.println("Child.methodCommon");
    }
}
