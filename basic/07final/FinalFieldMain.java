package basic.07final

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10); // 생성자로 작성 후 변경 불가
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit1.value = " + constructInit1.value);
        System.out.println("constructInit2.value = " + constructInit2.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit(); // 필드에서 초기화되었으므로 변경 불가
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1.value = " + fieldInit1.value); // 출력: 10
        System.out.println("fieldInit2.value = " + fieldInit2.value); // 출력: 10
        System.out.println("fieldInit3.value = " + fieldInit3.value); // 출력: 10
 
        System.out.println("상수 출력");
        System.out.println("FieldInit.CONST_VALUE = " + FieldInit.CONST_VALUE);

    }
}
