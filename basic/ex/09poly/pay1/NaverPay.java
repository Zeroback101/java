package basic.ex.09poly.pay0;

public class NaverPay implements PayCategory {
  @Override
  public void pay(int amount) {
    System.out.println("네이버페이 시스템과 연결합니다.");
    System.out.println(amount + "원 결제를 시도합니다.");
  }
}
