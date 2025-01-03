## String class

### (1) String 기초
- String은 자주 사용하는 참조형이므로 자바에서 new String()을 자동으로 지원한다.
```java
String str1 = "hello"; // 이렇게 사용하면
String str2 = new String("hello"); // 자바에서 알아서 이렇게 변경함.
```

- String 클래스의 구조를 보면 char[]에 각 문자를 하나하나 저장한 구조로 되어있다.
```java
private final char[] value;
private final byte[] value;
```
- String 클래스는 다양한 메서드를 지원한다.
- 참조형은 원칙적으로 + 연산을 지원하지 않으나, String은 예외적으로 지원한다.

### (2) equals()
- 생성자로 객체 생성한 경우: false
- 문자열 리터럴로 객체 생성한 경우: true
  ```java
  String s1 = new String("hello"); // 새로운 객체로 할당
  String str1 = "hello"; // 문자열 풀에서 반환
  ```
- 문자열 풀: 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다. 따라서 문자열 리터럴로 String 객체를 만드는 경우 문자열 풀에 존재하는 문자와 같으면 동일한 객체를 가리킨다.
- 문자열 비교는 반드시 equals()를 사용해야 한다.
> 참고: 풀이란? 여러 자원이 모여있는 곳으로 함께 사용할 수 있는 객체를 생성한 뒤 재사용 한다. `힙영역에 할당`, `해시 알고리즘으로 찾기`

### (3) 불변객체 
- String은 불변객체로 구현되어 있으므로 아래와 같이 concat를 사용한다.
- 문자열 풀을 사용하므로 공유하는 자원의 값이 변경되는 사이드 이펙트를 막기 위해 불변 객체로 구현되었다.
  ```java
  String str = "hello";
  String str2 = str.concat(" world");
  ```

### (4) 메소드
- length(): 문자열 길이
- isEmpty(): 문자열 비어있음 -> ""
- isBlank(): 문자열이 비어있거나 공백임 -> "", " "
- charAt(int): int 인덱스 위치의 문자 꺼내기
- equals(String): 문자열이 동일한지
- equalsIgnoreCase(String): 문자열이 동일한지(대소문자 무시)
- compareTo(String): 문자열 비교
- compareToIgnoreCase(String): 문자열 비교(대소문자 무시)
- startsWith(String): 시작하는 문자열
- endsWith(String): 끝나는 문자열
- contains(String): 문자열이 포함되어 있는지
- indexOf(String): 문자열의 시작 인덱스 반환
- indexOf(String, int): 문자열의 시작을 int 이후로 찾아서 인덱스 반환
- lastIndexOf(String): 뒤에서부터 문자열 찾기
- subString(int): int 인덱스부터 반환
- concat(int1, int2): int1 ~ int2까지 반환
- replace(String1, String2): String1을 String2로 변환
- toLowerCase(): 소문자 변환
- toUpperCase(): 대문자 변환
- trim(): 앞 뒤 공백 제거
- strip(): 앞 뒤 공백 제거
- stripLeading(): 앞 공백 제거
- stripTrailing(): 뒤 공백 제거
- split(): 문자열 분해
- join(): 문자열 병합

### (5) 가변 String
- StringBuilder를 통해 가변 String 객체를 생성할 수 있다.
- append(), insert(), delete(), reverse() 등의 메서드를 사용해서 String을 조작할 수 있다.
- 가변 String을 불변 String으로 바꿀 수 있다.
  ```java
  String string = sb.toString();
  ```
- String 최적화하는 경우 가변 String으로 작성하는 것이 더 좋다. 특히 반복문에서...
> 참조: `StringBuilder` VS `StringBuffer`
>
> StringBuffer는 멀티 스레드 상황에서 동기화를 맞춰주므로 동기화 오버헤드로 인한 성능이 저하된다.

### (6) 메서드 체이닝
```java
String result = sb.append("A").append("B").append("C").append("D ")
                .insert(4, "jave")
                .delete(4, 8)
                .reverse()
                .toString();
```
















