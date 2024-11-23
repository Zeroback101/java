package basic.09polymorphism.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child(); // 자식 인스턴스 생성
        System.out.println("child.value = " + child.value); // 자식 변수
        child.method(); // 자식 메서드 호출

        Parent parent = new Parent(); // 부모 인스턴스 생성
        System.out.println("parent.value = " + parent.value); // 부모 변수
        parent.method(); // 부모 메서드 호출

        Parent poly = new Child(); // 자식 인스턴스 사용 가능한 부모 
        System.out.println("poly.value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드 오버라이딩, 오버라이딩 된 메서드는 항상 우선권을 가짐
    }
}
