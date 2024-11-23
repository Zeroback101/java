package basic.08inheritance.access.child;

import basic.08inheritance.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지
        defaultValue = 1; // 다른 패키지 접근 불가, error
        privateValue = 1; // 접근 불가, error

        publicMethod();
        protectedMethod();
        defaultMethod(); // error
        privateMethod(); // error

        printParent(); // 부모에서 default, private 메서드에 접근하는 것이므로 호출 가능
    }
}
