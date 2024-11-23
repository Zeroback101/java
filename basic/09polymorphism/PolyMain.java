package basic.09polymorphism;

public class PolyMain {

    public static void main(String[] args) {
        Parent parent = new Parent(); // 부모 인스턴스 생성
        parent.parentMethod(); // 부모 메서드 호출

        Child child = new Child(); // 자식 인스턴스 생성
        child.parentMethod(); // 자식 -> 부모 메서드 호출
        child.childMethod(); // 자식 메서드 호출

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); // 부모 타입에 자식 인스턴스 생성
        poly.parentMethod(); // 부모 메서드 호출
        poly.childMethod(); // 부모 -> 자식 메서드 호출: error, 캐스팅이 필요
        
        Parent poly2 = new Grandson(); // 부모 타입에 자손 인스턴스 생성
    }
}
