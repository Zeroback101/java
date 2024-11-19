package basic.02oop;

public class ValueObject {
  int value;

  static void add() {
    value++;
    System.out.println("숫자 증가 value = " + value);
  }
}
