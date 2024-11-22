package basic.07final;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 변수에 final을 붙임
        data = new Data(); // Final이라 재할당 불가: error, 즉, 참조형 주소를 변경 불가

        data.value = 10; // data.value는 final이 아니므로 참조 대상의 값은 변경 가능
        System.out.println(data.value); 
        data.value = 20;
        System.out.println(data.value);
    }
}
