# Java Basics
Java의 기본 개념을 설명하며, 각 항목은 간단한 설명과 예시 코드로 구성되어 있습니다.

## 1. 기본형과 참조형
- **설명**: 기본형은 값 자체를 저장하고, 참조형은 객체의 주소를 저장합니다.
```java
int a = 10; // 기본형
String s = "Hello"; // 참조형
System.out.println(a); // 출력: 10
System.out.println(s); // 출력: Hello
```
## 2. 객체지향 프로그래밍
- **설명**: 캡슐화, 상속, 다형성, 추상화의 개념을 바탕으로 하는 프로그래밍 방식입니다.
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
Animal dog = new Dog();
dog.sound(); // 출력: Bark
```
## 3. 생성자
- **설명**: 객체를 초기화하기 위해 사용되는 특수한 메서드입니다.
```java
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
Person p = new Person("Alice");
System.out.println(p.name); // 출력: Alice
```
## 4. 패키지
- **설명**: 관련된 클래스와 인터페이스를 그룹화하는 데 사용됩니다.
```java
package mypackage;
public class MyClass {
    public void sayHello() {
        System.out.println("Hello, Package!");
    }
}
```
## 5. 접근 제어자
- **설명**: 클래스 멤버의 접근 수준을 제한합니다. (public, protected, default, private)
```java
class Test {
    private int value = 10;
    public int getValue() {
        return value;
    }
}
Test t = new Test();
System.out.println(t.getValue()); // 출력: 10
```
## 6. 자바 메모리 구조와 static
- **설명**: static 키워드는 클래스 수준의 메모리를 사용하게 합니다.
```java
class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
}
new Counter();
new Counter();
System.out.println(Counter.count); // 출력: 2
```
## 7. final
- **설명**: 값을 변경할 수 없게 하거나, 메서드 또는 클래스를 오버라이딩하지 못하게 합니다.
```java
final class FinalClass {}
// class SubClass extends FinalClass {} // 오류 발생
```
## 8. 상속
- **설명**: 기존 클래스를 기반으로 새로운 클래스를 생성합니다.
```java
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}
Child c = new Child();
c.show(); // 출력: Child class
```
## 9. 다형성
- **설명**: 같은 메서드 호출이 객체에 따라 다르게 동작합니다.
```java
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
Shape s = new Circle();
s.draw(); // 출력: Drawing Circle
```










