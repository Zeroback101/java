package basic.08inheritance.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("publicValue = " + publicValue);
    }

    protected void protectedMethod() {
        System.out.println("protectedValue = " + protectedValue);
    }

    void defaultMethod() {
        System.out.println("defaultValue = " + defaultValue);
    }

    private void privateMethod() {
        System.out.println("privateValue = " + privateValue);
    }

    public void printParent() {
        System.out.println("print parent");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        defaultMethod();
        privateMethod();
    }
}
