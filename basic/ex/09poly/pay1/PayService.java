package basic.ex.09poly.pay1;

public class PayService {
  
  public void processPay(String payOpt, int amount) {
    System.out.println("결제를 시작합니다: option=" + payOpt + " amount=" + amount);
    boolean result = true;

    Pay pay = PayStore.findPay(payOpt);
    result = pay.pay();

    if(result) {
      payment(payCategory, amount);
      System.out.println("결제가 성공했습니다.");
    } else {
      System.out.println("결제가 실패했습니다.");
    }
    
  }
}
