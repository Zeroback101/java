package basic.06memory;

public class JavaMemoryMain {
  public static void main(String[] args) { 
        System.out.println("main start");
        method1(10); // 호출 1
        System.out.println("main end"); // 실행 완료 3
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal); // 호출 2
        System.out.println("method1 end"); // 실행 완료 2
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end"); // 실행 완료 1
    }
}
