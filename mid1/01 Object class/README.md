# Object 클래스

### 1. java.lang 패키지 소개
#### (1) java.lang의 대표적인 클래스
- Object: 모든 자바 객체의 부모 클래스
- String: 문자열
- Integer, Long, Double: 기본형 데이터 타입을 객체로 만든 것
- Class: 클래스 메타 정보
- System: 시스템과 관련된 기본 기능

#### (2) java.lang의 특징
- import 생략 가능

### 2. Object 클래스
#### (1) 자바에서 모든 객체의 최종 부모는 Object이다.

#### (2) 자바에서 Object 클래스가 최상위 부모 클래스인 이유는?
- 공통 기능을 제공하기 위함
  > 객체의 정보 제공하고, 다른 객체와 같은지 비교하고, 객체가 어떤 클래스로 만들어졌는지 확인하는 기능은 모든 객체에게 필요한 기본제공이다.
  > - toString()
  > - equals()
  > - getClass()
- 다형성의 기본 구현
  > Object는 모든 클래스의 부모 클래스이므로 모든 객체를 참조할 수 있다.

#### (3) Object 다형성
- Object는 모든 객체의 부모이므로 모든 객체를 대상으로 다형적 참조를 할 수 있다.
- Object를 통해 전달받은 객체를 호출하려면 각 객체에 맞는 다운캐스팅 과정이 필요하다.
  ```java
  private static void action(Object obj) {
        if(obj instanceof Dog dog) {         // 객체에 맞는 douwcasting 후 함수 호출
            dog.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
  ```
- 다형적 참조는 가능하지만, 메서드 오버라이딩은 안되기 때문에 다형성을 활용하기에 한계가 있다.

#### (4) Object 배열
- 세상의 모든 객체를 담을 수 있으므로 새로운 클래스가 추가되거나 변경되어도 메서드를 수정하지 않아도 된다.
  ```java
  private static void size(Object[] objects) {
        System.out.println("전달된 객체 수: " + objects.length);
  }
  ```

### 3. toString()
#### (1) toString()
- 패키지를 포함한 객체의 이름과 참조값(해시코드)를 16진수로 제공한다.
- `해시코드`: 객체의 참조값
  ```java
  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
  ```
#### (2) toString() 오버라이딩
- toString() 오버라이딩하여 원하는 내용이 출력되도록 변경 가능
  ```java
  @Override
    public String toString() { // cmd+N 으로 자동 생성 가능
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
  ```
- toString() 오버라이딩으로 인한 참조값 못보는 경우 아래와 같이 참조값 확인 가능
  ```java
  String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
  ```
#### (3) toString() Object 다형성 활용
  ```java
  public static void print(Object object) {
        String string = "객체 정보 출력 " + object.toString();
        System.out.println(string);
    }
  ```

### 4. equals()
#### (1) 동일성과 동등성
- 동일성(Identity): 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는 것, `자바 메모리 참조 기준`
- 동등성(Equality): equals() 메서드를 사용하여 두 객체가 논리적으로 동등한 것, `논리적 기준`

- **동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의해야 한다. 그렇지 않으면 object는 동일성 비교를 기본으로 제공한다.**

#### (2) equals() 구현
```java
// 정확한 equals() 구현
@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
```
- 반사성: 객체는 자기 자신과 동등해야 한다.
- 대칭성: 두 객체가 서로에 대해 동일하다고 판단하면 이는 양방향으로 동일해야 한다.
- 추이성: 한 객체가 두번째 객체와 동일하고 두번째 객체가 세번째 객체와 동일하다면, 첫번째 객체는 세번째 객체와도 동일해야 한다.
- 일관성: 두 객체의 상태가 변경되지 않는 한, equals() 메소드는 항상 동일한 값을 반환해야 한다.
- null에 대한 비교: 모든 객체는 null과 비교했을 때 false를 반환해야 한다.




















