package basic.10polymorphism2;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child(); // 다형적 참조: 부모는 자식을 담을 수 있다.
        a.methodA(); // 메서드 오버라이딩: 오버라이딩된 자식 메소드 호출
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon(); 

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon(); // 자기 자신의 메서드 호출
    }
}
