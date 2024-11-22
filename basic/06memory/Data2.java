package basic.06memory;

public class Data2 {
    public String name;
    public static int count; // static 변수: 스택영역(메서드 영역)에서 관리 -> 공용으로 사용

    public Data2(String name) {
        this.name = name;
        count++; // static 이 붙은 count 값 증가
    }
}
