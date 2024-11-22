package static2;

public class DecoMain {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil.deco(s); // 인스턴스 생성 없이 클래스 이름으로 접근 가능
        System.out.println("deco = " + deco);
    }
}
