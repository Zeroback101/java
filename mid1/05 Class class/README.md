## Class 클래스

### (1) Class class 기능
- 클래스의 정보를 다루는데 사용
- 타입 정보 얻기: 클래스 이름, 슈퍼 클래스, 인터페이스, 접근 제한자 등과 같은 정보 조회
- 리플랙션: 클래스에 정의된 메소드, 필드, 생성자 등을 조회하고 객체 인스턴스로 생성하거나 메소드를 호출하는 작업 가능
- 동적로딩과 생성: Class.forName() 메서드를 사용하여 클래스를 동적으로 로드, newInstance() 메서드를 통새 새로운 인스턴스를 생성할 수 있다.
- 애노테이션 처리: 애노테이션 조회 및 처리

### (2) Class class 메서드
1. 클래스 조회
   ```java
   Class clazz = String.class; // 1. 기본
   Class clazz = new String().getClass(); // 2. 인스턴스에서 조회
   Class clazz2 = Class.forName("java.clazz"); // 3. 문자열로 조회 
   ```
2. 모든 필드 출력
   ```java
   Field[] fields = clazz.getDeclaredFields();
   ```
3. 모든 메서드 출력
   ```java
   Method[] methods = clazz.getDeclaredMethods();
   ```
4. 상위 클래스 출력
   ```java
   clazz.getSuperclass();
   ```
5. 인터페이스 출력
   ```java
   Class[] interfaces = clazz.getInterfaces();
   ```

### (3) Class class 생성하기
> Class 클래스에는 클래스의 모든 정보가 들어있어 이 정보를 기반으로 인스턴스를 생성하거나 메서드를 호출하고 필드 값도 변경할 수 있다.
```java
public static void main(String[] args) throws Exception { 
    Class helloClass = Hello.class; // Hello 클래스 생성
    Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // 생성자 선택하여 인스턴스 생성
    String result = hello.hello();
    System.out.println("result = " + result);
}
```

### (4) 리플랙션
> `리플랙션이란?` 클래스의 메타 정보를 기반으로 클래스에 정의된 메소드, 필드, 생성자 등을 Class를 사용해 조회하고 이들을 통해 객체 인스턴스를 생성하거나 메소드를 호출하는 작업을 말한다. 추가로 애노테이션 정보를 읽어서 특별한 기능을 수행할 수 있다.

## System 클래스
- 표준 입력, 출력, 오류 스트림 `System.out.pringln()`
- 시간 측정 `System.currentTimeMillis()`
- 환경 변수 `System.getenv()`
- 시스템 속성 `System.getProperties()`
- 시스템 종료 `System.exit()`
- 배열 고속 복사 `System.arraycopy(origin, 0, copied, 0, origin.length)`

## Math, Random 클래스
- API 문서에서 찾아서 사용하기
















