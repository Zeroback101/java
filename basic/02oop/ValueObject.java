package basic.02oop;

public class ValueObject {
  int value;

  static void add(ValueObject object) {
    object.value++;
    System.out.println("숫자 증가 value = " + object.value);
  }
}
