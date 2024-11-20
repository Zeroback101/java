# 접근 제어자

### 접근 제어자 종류
- **private:** 내부 클래스에서만 접근 가능
- **default(package private):** 같은 패키지 안에서만 접근 가능
- **protected:** 같은 패키지, 다른 패키지의 상속 관계에서 접근 가능
- **public:** 모든 외부에서 접근 가능

### 클래스에서의 접근 제어자
- default, public 접근 제어자만 사용 가능하다.
- public 클래스는 파일 당 1개만 생성 가능하고, 파일 이름과 동일해야 한다.
- 파일 하나에 여러 클래스를 생성할 수 있으며, default 클래스로 생성한다.

```java
public class PublicAccessModifier {
  public static void main(String[] args) {
    System.out.println("public class: 모든 곳에서 접근 가능");
  }
}

class DefaultAccessModifier {
  System.out.println("defult class: 같은 패키지에서만 접근 가능");
}
```
