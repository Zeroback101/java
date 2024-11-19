# Summary

## 1. 절차지향 프로그래밍
- **특징**: 순서대로 실행되는 프로그래밍으로 `1)` 클래스를 통해 데이터를 묶고, `2)` 함수를 통해 기능을 모듈화 할 수 있다.
- **한계**: 데이터와 기능이 분리되어 관리되므로 어느 한쪽이 변경되면 해당 내용을 전부 수정해야 한다.

## 2. 객체지향 프로그래밍
- **특징**: class 내부에 `속성(데이터)`과 `기능(메소드)`을 구현한다.
```java
// class
package oop;
public class Object {
  int data;

  static void showData() {
    System.out.println("데이터 값: ", data);
  }
}
```
