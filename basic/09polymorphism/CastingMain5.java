package basic.09polymorphism;

public class CastingMain5 {
    public static void main(String[] args) {
        System.out.println("poly");
        Parent poly = new Child();
        call(poly);

        System.out.println("parent");
        Parent parent = new Parent();
        call(parent);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // instanceof: 타입을 확인
        if (parent instanceof Child) { // 자식 인스턴스를 가진 부모라면, 다운 캐스팅 진행 
            System.out.println("child instance");
            Child child = (Child) parent;
            child.childMethod(); // 자식 메서드 호출
        }
    }
}
