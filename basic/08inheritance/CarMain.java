package basic.08inheritance;

public class CarMain {
 
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(); 
        electricCar.move(); // 부모 공간에 가서 찾는다.
        electricCar.charge(); // 자식 공간에 가서 찾는다.

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
