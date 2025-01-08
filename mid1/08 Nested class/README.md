## 08 중첩 클래스

### (1) 클래스의 분류
- 정적 중첩 클래스 -> 정적 변수와 같은 위치에 선언
- 내부 클래스
    - 내부 클래스(inner) -> 인스턴스 변수와 같은 위치에 선언
    - 지역 클래스(local) -> 지역 변수와 같은 위치에 선언
    - 익명 클래스(annonymous)
```java
class Outer {
  // 정적 중첩 클래스
  static class staticNested {...}

  // 내부 클래스
  class Inner {...}

  public void process() {
    // 지역 클래스
    class Local {...}
  }
}
```
> 중첩: 어떤 다른 것이 내부에 위치하거나 포함되는 구조적인 관계, Outer 클래스와 관계 없음 즉, 바깥 클래스의 인스턴스에 소속되지 않음.
>
> 내부: 내의 내부에 있는 나를 구성하는 요소, Outer 클래스와 긴밀한 관계 있음 즉, 바깥 클래스의 인스턴스에 소속됨
>
> - 지역 클래스: 바깥 클래스의 인스턴스의 멤버에 접근
> - 내부 클래스: 내부 클래스 특징 + 지역 변수에 접근
> - 익명 클래스: 지역 클래스의 특징 + 클래스의 이름이 없는 특별한 클래스

### (2) 정적 중첩 클래스
- 자신의 멤버 접근 가능
- 외부 클래스 인스턴스 멤버에는 접근 불가
- 외부 클래스 클래스 멤버에는 접근 가능
  ```java
  public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 변수에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근할 수 없다.
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
  }
  ```
- 중첩 클래스의 접근
  ```java
  NestedOuter nestedOuter = new NestedOuter();
  NestedOuter.Nested nested = new NestedOuter.Nested();
  ```
> 외부 클래스와 아무런 관계가 없지만 단지 private 변수에 접근 가능하다는 점 말고는 그냥 다른 클래스이다.

### (3) 내부 클래스
- 자신의 멤버 접근 가능
- 외부 클래스 인스턴스 멤버에는 접근 가능
- 외부 클래스 클래스 멤버에는 접근 가능
  ```java
  public class InnerOuter {
      private static int outClassValue = 3;
      private int outInstanceValue = 2;
  
      class Inner {
          private int innerInstanceValue = 1;
          public void print() {
              // 자신의 변수에 접근할 수 있다.
              System.out.println(innerInstanceValue);
  
              // 바깥 클래스의 인스턴스 멤버에 접근할 수 있다.
              System.out.println(outInstanceValue);
  
              // 바깥 클래스의 클래스 멤버에는 접근할 수 있다.
              System.out.println(InnerOuter.outClassValue);
          }
      }
  }
  ```
- 내부 클래스의 접근
  ```java
  InnerOuter outer = new InnerOuter();
  InnerOuter.Inner inner = outer.new Inner();
  ```
  - 내부 클래스는 바깥 클래스의 인스턴스에 소속되므로 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다.
  - 따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스터스를 생성할 수 있다.

### (4) 지역 클래스
- 자신의 인스턴스 변수에 접근할 수 있다.
- 자신이 속한 코드 블럭의 지역 변수에 접근할 수 있다.
- 자신이 속한 코드 블력의 매개 변수에 접근할 수 있다.
- 바깥 클래스의 인스턴스 멤버에 접근할 수 있다.

> 지역변수 캡쳐란?
> 
> - 변수의 생명 주기
> 1. 클래스 변수: 프로그램 종료까지(메서드 영역)
> 2. 인스턴스 변수: 인스턴스 생존 기간(힙 영역)
> 3. 지역 변수: 메서드 호출이 끝나면 사라짐(스택 영역)
>
> 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인스턴스에 함께 넣어두는 것을 지역변수 캡쳐라고 한다.
> 지역 클래스가 접근하는 지역 변수는 final이어야 한다. 즉, 중간에 값이 변경되면 안된다.

> `사실상 final` : 값이 변경되지 않는 변수

### (5) 정리
#### 정적 중첩 클래스
```java
public class OuterClass1 {
    static class NestedClass {
        public void hello() {
            System.out.println("Nested.hello");
        }
    }
}
```
#### 내부 클래스
```java
public class OuterClass2 {
    class InnerClass {
        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }
}
```
#### 지역 클래스
```java
public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
```






















