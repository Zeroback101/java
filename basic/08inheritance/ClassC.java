package basic.08inheritance;

public class ClassC extends ClassB {

    public ClassC() {
        // super(); // ClassB는 기본생성자가 없으므로 error
        super(10, 20); // 기본 생성자가 아닌 B에 정의된 생성자를 사용하여 호출한다. -> ClassA -> ClassB -> ClassC 순서대로 호출
        System.out.println("ClassC 생성자");
    }
}
