# ENUM

### (1) 타입 안전 열거형 패턴 - Type safe Enum Pattern
> 타입 안전 열거형 패턴은 열거형으로 나열된 항목만 사용할 수 있고, 항목이 아닌 것은 사용할 수 없다.
```java
public class ClassGrade {
  public static final ClassGrade BASIC = new ClassGrade();
  public static final ClassGrade GOLD = new ClassGrade();
  public static final ClassGrade DIAMOND = new ClassGrade();
  
  // private 생성자 추가 -> 외부에서 생성자를 사용하지 못하도록 막음
  private ClassGrade() {}
}
```
#### 장점
- 타입 안정성 향상: 정해진 객체만 사용할 수 있기 때문에 잘못된 값을 입력하는 문제를 방지할 수 있다.
- 데이터 일관성: 정해진 객체만 사용되므로 일관성이 보장됨.
#### 단점
- 코드를 많이 작성해야 한다.
- private 생성자를 추가해야 한다.

### (2) Enum Type
> `열거형`은 타입 안전 열거형 패턴을 편리하게 사용할 수 있도록 제공한다.

- 열거형 정의
  ```java
  public enum Grade {
    BASIC, GOLD, DIAMOND
  }
  ```
  - enum 타입은 인스턴스 생성이 불가능하다. -> 생성자가 private로 정의되어 있음.
  - static import를 사용해서 코드를 줄일 수 있다. -> import static enumerataion.ex3.Grade.*

### (3) Enum 주요 메서드
- values(): 모든 ENUM 상수를 포함하는 배열을 반환
- valueOf(Strig name): 주어진 이름과 일치하는 ENUM 상수를 반환
- name(): ENUM 상수의 이름을 문자열로 반환
- ordinal(): ENUM 상수의 선언 순서를 반환(0부터 시작)
  > ordinal은 사용하지 않는 것이 좋다. 이 값을 사용하다가 중간에 상수를 선언하는 위치가 변경되면 전체 위치가 변경되기 때문이다.
- toString(): ENUM 상수의 이름을 문자열로 반환, 오버라이딩 가능





















