package basic.09polymorphism;

public class CastingMain1 {

    public static void main(String[] args) {
        Parent poly = new Child(); // 부모 타입에 자식 인스턴스 생성
        // poly.childMethod(); 부모 -> 자식 메서드 호출: 불가능

        // 다운 캐스팅: 부모 타입 -> 자식 타입으로 변경
        Child child = (Child) poly; 
        child.childMethod();
    }
}
