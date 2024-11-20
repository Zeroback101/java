# 접근 제어자

### 접근 제어자 종류
- **`private`:** 내부 클래스에서만 접근 가능
- **`default(package private)`:** 같은 패키지 안에서만 접근 가능
- **`protected`:** 같은 패키지, 다른 패키지의 상속 관계에서 접근 가능
- **`public`:** 모든 외부에서 접근 가능


### 클래스에서의 접근 제어자
- `default`, `public` 접근 제어자만 사용 가능하다.
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


### 캡슐화
1. `데이터`를 숨긴다.
  - 객체 내부의 데이터를 외부에서 접근하게 허용하면 안된다.
  - 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다.
2. `기능`을 숨긴다.
  - 객체의 기능 중 외부에서 사용하지 않고 내부에서만 사용하는 기능들에 대해서 감춘다.
