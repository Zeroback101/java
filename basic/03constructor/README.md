# 생성자

### 1. this.
자기자신의 인스턴스를 가리키는 방법
즉, 자기자신의 멤버변수에 접근한다.

### 2. 생성자
- **특징1:** 객체 생성과 동시에 초기화하기 위해 사용한다.
- **특징2:** 클래스의 이름과 동일한 이름의 메소드로 구현한다.
- **특징3:** 생성자 호출은 필수이므로 누락하면 comfile 오류가 난다.

### 3. 기본 생성자
매개변수가 없는 생성자로, 사용자가 생성자를 정의하지 않으면 자바가 알아서 생성해준다.
```java
public class MemberDefault {
  int value;

  MemberDefault() { // 기본 생성자
  }
}
```

### 4. 생성자 오버로딩
생성자를 여러가지 만들 경우 사용한다.
```java
public class Member {
  String name;
  int sid;

  Member(name) { // 생성자 1
    this.name = name;
    this.sid = 0;
  }
  Member(name, sid) { // 생성자 2
    this.name = name;
    this.sid = sid;
  }
}
```

### 5. this()
생서자 함수 첫줄에 사용하여 자기 자신의 인스턴스(멤버변수)를 초기화 하는 기능을 제공하는 함수
```java
public class Member {
  String name;
  int sid;

  Member(name) { 
    this(name, 0);
  }
}
```
