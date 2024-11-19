package basic.ex;

public class RectangleMain {
  public static void main(String[] args) {
    Ractangle r = new Ractangle();
    r.width = 5;
    r.height = 8;

    int area = r.calculateArea();
    System.Out.println("넓이: " + area);

    int perimeter = r.calculatePerimeter();
    System.Out.println("둘레: " + perimeter);

    boolean square = r.calculateSquare();
    System.Out.println("정사각형 여부: " + square);
  }
}
