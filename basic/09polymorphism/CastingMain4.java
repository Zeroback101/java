package basic.09polymorphism;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent poly = new Child(); // 다형적 참조 -> child 인스턴스가 존재하는 parent 인스턴스
        Child child1 = (Child) poly;
        child1.parentMethod();
        child1.childMethod();

        Parent parent = new Parent();
        Child child2 = (Child) parent; // child가 생성되지 않았으므로 캐스팅이 불가: 런타임 에러 - ClassCastException
        child2.parentMethod();
        child2.childMethod();

    }
}
