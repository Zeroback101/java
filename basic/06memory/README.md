# 자바 메모리 구조와 static

### 메모리 구조
**1. 메서드영역:** 공통 데이터, 모든 영역에서 공유 (클래스, static, 런타임 상수 풀)

**2. 스택영역:** 스레드 수만큼 생성됨, 스택 프레임 생성 (함수, 지역변수/매개변수)

**3. 힙영역:** 객체와 배열 (new로 생성되는 인스턴스 등), GC가 동작함.

*클래스의 메서드는 공유하므로 새로운 공간에 할당하지 않고 메서드 영역에 할당된다.

### static 변수
클래스의 멤버 변수 구분
- `인스턴스 변수`: 인스턴스가 생성될 때마다 인스턴스 안에 생성
- `클래스 변수`: 클래스에 소속된 변수로 프로그램 실행시 1개 생성 후 공유, 정적 변수 == static 변수

### static 메서드
클래스의 메서드 구분
- `인스턴스 메서드`
- `클래스 메서드`: static mehod는 static만 사용할 수 있다.
```java
public class DecoData {
    
    private int instanceValue; // 인스턴스 변수
    private static int staticValue; // 정적 변수
    
    public static void staticCall() { // 정적 메서드
        staticValue++; // 정적 변수 접근 가능
        instanceValue++; // 인스턴스 변수 접근 불가능, 컴파일 에러
    }
}
```
### main() method is static method
메인 메소드는 객체 생성 없이 바로 호출이 되므로 static 메서드 이다. 

따라서, main() 메서드에서 호출하는 클래스의 메서드는 모두 static method이다.

