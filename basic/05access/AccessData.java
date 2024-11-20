package basic.05access;

public class AccessData {
  public int publicField; // 어디서나 접근 가능
  int defaultField; // 같은 패키지만 접근 가능
  private int privateField; // 접근 불가능

  public void publicMethod() {
    System.out.println("public method 호출" + publicField);
  }
  void defaultMethod() {
    System.out.println("default method 호출" + defaultField);
  }
  private void privateMethod() {
    System.out.println("private method 호출" + privateField);
  }
  public void innerMethod() {
    System.out.println("inner method 호출");
    publicField = 10;
    defaultField = 20;
    privateField = 30;
    System.out.println("public 호출" + publicField);
    System.out.println("default 호출" + defaultField);
    System.out.println("default 호출" + defaultField);
  }
}
