package basic.06memory;

// import static: 정적 메서드 임포트, 호출 시 클래스 명 생략 가능
import static basic.06memory.DecoData.staticCall; 
import static basic.06memory.DecoData.*; 

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); 
      
        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스2 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("DecoData.staticCall 호출");
        staticCall(data2);

        // 추가: 
        DecoData data3 = new DecoData();
        data3.staticCall(); // 인스턴스를 통한 접근 -> 사용 추천 안함: 인스턴스 메서드인지 클래스 메서드인지 구분 불가
        DecoData.staticCall(); // 클래스를 통한 접근
        staticCall(); // import를 통한 접근

    }
}
