# final

### final 변수와 상수
- `final` 변수: 초기값 생성 후 변경 불가
- `static final` 변수(==상수): 자바에서 static final로 선언된 변수는 상수이다.
  ```java
  static final int CONSTANT = 10;
  ```

### final 변수와 참조
- 참조형 변수에 final이 붙은 경우, 참조를 변경 불가하고, 참조되는 값은 변경 가능하다.
  ```java
  public static void main(String[] args) {
        final Data data = new Data(); // 참조형 변수에 final을 붙임
        data = new Data(); // Final이라 재할당 불가: error, 즉, 참조형 주소를 변경 불가
        data.value = 10; // data.value는 final이 아니므로 참조 대상의 값은 변경 가능
  ```
