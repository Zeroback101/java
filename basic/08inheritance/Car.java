package basic.08inheritance;

public class Car {
    public void move() {
        System.out.println("move");
    }

    // 기능 추가 -> 부모에 추가했으므로 자식에게 전달된다.
    public void openDoor() {
        System.out.println("open door");
    }
}
