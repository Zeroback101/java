package basic.08inheritance;

public class ElectricCar extends Car { // ElectricCar -> Car 상속

    @Override 
    public void move() { // 오버라이딩 = 부모의 기능을 자식이 새로 재정의하는 것
        System.out.println("fast move");
    }

    public void charge() {
        System.out.println("charge");
    }
}
