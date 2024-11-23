package basic.08inheritance;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() { // 부모 메서드 오버라이딩
        System.out.println("Child.hello");
    }
    
    
    public void call() {
        System.out.println("this.value = " + this.value); // this 생략 가능
        System.out.println("super.value = " + super.value); // super: 부모 클래스에 대한 참조

        this.hello(); // this 생략 가능
        super.hello(); // 부모 클래스에 대해 참조
    }
}
