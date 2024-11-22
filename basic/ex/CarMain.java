package basic.ex;

public class CarMain {
  public static void main() {
    Car car1 = new Car("K3");
    Car car2 = new Car("G80");
    Car car3 = new Car("Model Y");

    Car.showTotalCars(); // static method
  }
}
