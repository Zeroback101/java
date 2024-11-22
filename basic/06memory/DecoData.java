package basic.06memory;

public class DecoData {
    
    private int instanceValue;
    private static int staticValue;
    
    public static void staticCall() { // 정적 메서드
        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        // instanceValue++; // 인스턴스 변수 접근 불가능, 컴파일 에러
        // instanceMethod(); // 인스턴스 메서드 접근 불가능, 컴파일 에러
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() { // 인스턴스 메서드
        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능

        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능
    }

    private void instanceMethod() { // 인스턴스 메서드
        System.out.println("instanceValue = " + instanceValue);
    }
    
    private static void staticMethod() { // 정적 메서드
        System.out.println("staticValue = " + staticValue);
    }
}
