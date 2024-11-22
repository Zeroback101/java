package basic.07final;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        data1 = 20; // 재할당: error

        final int data2 = 10;
        data2 = 20; // 재할당: error
    }

    static void method(final int parameter) {
        parameter = 20; // 매개변수 값 변경 불가: error
    }
}
