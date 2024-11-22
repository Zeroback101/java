package basic.07final;

public class ConstructInit {
    final int value; // 초기값이 없으면 생성자를 통해서 값을 무조건 할당해야함

    public ConstructInit(int value) {
        this.value = value; // 생성 이후 값 변경 불가
    }
}
