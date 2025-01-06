## Wrapper 클래스

### (1) 래퍼 클래스란?
> 기본형을 감싸서 만드는 클래스

### (2) 기본형과 null
- 기본형은 null 값이 존재하지 않는다.

### (3) 자바 래퍼 클래스
- 자바는 기본형에 대응되는 래퍼 클래스를 제공한다. -> Integer, Short, Long, Float ...
- 자바가 제공하는 래퍼 클래스는 불변이며, equals로 비교해야 한다.
- `박싱` : 기본형을 래퍼 클래스로 변경하는 것 / `언박싱` : 래퍼 클래스 안의 기본형 값을 꺼내는 것
  ```java
  // Boxing
  Integer i = new Integer(10); // 미래에 삭제 예정, valueOf()로 대체
  Integer integerObj = Integer.valueOf(10); // -128~127 자주 사용하는 숫자값 재사용

  // Unboxing
  System.out.println("integer = " + integerObj.intValue());
  ```

### (4) Auto Boxing
- 기본형에서 래퍼 클래스로 변환하거나, 래퍼 클래스를 기본형으로 변환하는 일이 자주 발생한다.
  ```java
  int value = 10;
  Integer boxedValue = Integer.valueOf(value);
  int ubBoxedValue = boxedValue.intValue();
  ```
- 따라서 자바에서는 자동으로 변환해주는 Auto Boxing 기능을 제공한다.
  ```java
  // Auto Boxing
  int value = 10;
  Integer boxedValue = value;
  int ubBoxedValue = boxedValue;
  ```






















