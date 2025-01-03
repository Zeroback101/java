# 불변 객체

## 1. 기본형과 참조형
### (1) 기본형과 참조형의 공유
- **기본형**: 하나의 값을 여러 변수에서 절대 공유하지 않는다. 즉, 값이 복사해서 대입하므로 별도의 메모리 공간에 저장된다.
- **참조형**: 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다. 즉, 참조값을 복사해서 대입하므로 동일한 메모리 공간을 가리킨다.

### (2) 공유 참조와 사이드 이펙트
> *사이드 이펙트란?*
- 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것
```java
// 객체 공유 O
Address a = new Address("seoul");
Address b = a;
```
- 해결방안: 객체를 공유하지 않으면 된다.
```java
// 객체 공유 X
Address a = new Address("seoul");
Address b = new Address("seoul");
```
- **자바는 참조값의 공유를 막을 수 있는 방법이 없다.**

## 2. 불변 객체
### (1) 입문
> 불변 객체란? 객체의 상태(객체 내부의 값, 필드, 멤버 변수)가 변하지 않는 객체
```java
// 1. final로 선언
private final String value;
// 2. setValue() 메서드 제거
```
- 가변 객체: 처음 만든 이후 상태가 변할 수 있다.
- 불변 객체: 처음 만든 이후 상태가 변하지 않는다.

### (2) 값 변경
- 불변 객체의 값은 변경할 수 없으므로 기존의 값을 그대로 둔 상태로 새로운 값을 생성한다.
- 이때, 값을 반드시 반환받아야 한다.
```java
public ImmutableObj add(int addValue) {
      return new ImmutableObj(value + addValue);
}
```
```java
ImmutableObj obj1 = new ImmutableObj(10);
ImmutableObj obj2 = obj1.add(20);
```
> 참고: 자바에서 불변객체의 값을 바꾸는 메서드의 이름은 `withMethod()` 형식을 사용한다.

















