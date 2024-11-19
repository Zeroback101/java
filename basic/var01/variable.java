package basic.var01

public class variable {
  public static void main(String[] args) {
    // 자바의 변수는 기본형과 참조형으로 나뉜다. 
    // 자바는 변수값을 복사해서 저장한다.
    // 1. 기본형의 경우 변수값 자체를 복사하므로 값 변경이 각각 영향을 주지 않는다.
    // 2. 참조형의 경우 참조값(주소) 자체를 복사하므로 값이 변경되면 동일하게 변경된다.

    // null
    // NullPointerException: 참조할 주소 값이 존재하지 않는다.
    // 예시 1. 지역변수가 null로 선언된 경우
    Data data = null;
    data.value = 10; // NullPointerException
    // 예시 2.
    BigData bigData = new BigData();
    System.out.println(bigData.value); // 0
    System.out.println(bigData.data.value); // null.value이므로 Exception 발생!
    bigData.data = new Data();
    // 결론: NullPointerException이 발생하면 null값에 .(dot)을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.
  }
}

========================================================================
public class Data {
  int value;
}

public class BigData {
  int value;
  Data data;
}
