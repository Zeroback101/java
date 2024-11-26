package basic.ex.09poly.pay0;

public class PayService {
  
  public void processPay(String payOpt, int amount) {
    System.out.println("결제를 시작합니다: option=" + payOpt + " amount=" + amount);
    if(payOpt.equals("kakao")) {
      KakaoPay kakaoPay = new KakaoPay();
      result = kakaoPay.pay(amount);
    } else if(payOpt.equals("naver")) {
      NaverPay naverPay = new NaverPay();
      result = naverPay.pay(amount);
    } else {
      System.out.println("결제 수단이 없습니다.");
      result = false;
    }

    if(result) {
      System.out.println("결제가 성공했습니다.");
    } else {
      System.out.println("결제가 실패했습니다.");
    }
  }
}
