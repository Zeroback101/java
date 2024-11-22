package basic.06memory;

public class DataCountMain {

    public static void main(String[] args) {
        Data data1 = new Data("A");
        System.out.println("data1 = " + Data.count); // 메서드 영역 변수 접근 [class 이름].[static 변수 이름]

        Data data2 = new Data("B");
        System.out.println("data2 = " + Data.count);

        Data data3 = new Data("C");
        System.out.println("data3 = " + Data.count);

        Data data4 = new Data("D");
        System.out.println("data4 = " + data4.count); // 인스턴스를 통한 접근, 별로 추천하지 않은 방법임, count가 인스턴스 변수인지 클래스 변수인지 헷갈리게 됨
        System.out.println("data4 = " + Data.count); // 클래스를 통한 접근
    }
}
